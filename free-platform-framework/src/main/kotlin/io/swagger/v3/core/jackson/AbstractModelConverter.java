package io.swagger.v3.core.jackson;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.module.SimpleModule;
import io.swagger.v3.core.converter.AnnotatedType;
import io.swagger.v3.core.converter.ModelConverter;
import io.swagger.v3.core.converter.ModelConverterContext;
import io.swagger.v3.core.util.ReflectionUtils;
import io.swagger.v3.oas.models.media.Schema;
import org.apache.commons.lang3.StringUtils;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public abstract class AbstractModelConverter implements ModelConverter {
    protected final ObjectMapper _mapper;
    protected final AnnotationIntrospector _intr;
    protected final TypeNameResolver _typeNameResolver;
    protected Map<JavaType, String> _resolvedTypeNames;

    protected AbstractModelConverter(ObjectMapper mapper) {
        this(mapper, TypeNameResolver.std);
    }

    protected AbstractModelConverter(ObjectMapper mapper, TypeNameResolver typeNameResolver) {
        this._resolvedTypeNames = new ConcurrentHashMap<>();
        mapper.registerModule(new SimpleModule("swagger", Version.unknownVersion()) {
            public void setupModule(Module.SetupContext context) {
                context.insertAnnotationIntrospector(new SwaggerAnnotationIntrospector());
            }
        });
        this._mapper = mapper;
        this._typeNameResolver = typeNameResolver;
        this._intr = mapper.getSerializationConfig().getAnnotationIntrospector();
    }

    public Schema resolve(AnnotatedType type, ModelConverterContext context, Iterator<ModelConverter> chain) {
        return chain.hasNext() ? chain.next().resolve(type, context, chain) : null;
    }

    protected String _typeName(JavaType type) {
        return this._typeName(type, null);
    }

    protected String _typeName(JavaType type, BeanDescription beanDesc) {
        String name = this._resolvedTypeNames.get(type);
        if (name == null) {
            name = this._findTypeName(type, beanDesc);
            // 如果名字中存在有下划线，认定为非驼峰命名，将其下划线去掉转成驼峰命名
            if (name.contains("_")) {
                String[] splitNames = name.split("_");
                StringBuilder nameBuilder = new StringBuilder();
                for (String splitName : splitNames) {
                    nameBuilder.append(StringUtils.capitalize(splitName));
                }
                name = nameBuilder.toString();
            }
            this._resolvedTypeNames.put(type, name);
        }
        return name;
    }

    protected String _findTypeName(JavaType type, BeanDescription beanDesc) {
        if (type.isArrayType()) {
            return "Array";
        } else if (type.isMapLikeType() && ReflectionUtils.isSystemType(type)) {
            return "Map";
        } else if (type.isContainerType() && ReflectionUtils.isSystemType(type)) {
            return Set.class.isAssignableFrom(type.getRawClass()) ? "Set" : "List";
        } else {
            if (beanDesc == null) {
                beanDesc = this._mapper.getSerializationConfig().introspectClassAnnotations(type);
            }

            PropertyName rootName = this._intr.findRootName(beanDesc.getClassInfo());
            return rootName != null && rootName.hasSimpleName()
                    ? rootName.getSimpleName()
                    : this._typeNameResolver.nameForType(type, new TypeNameResolver.Options[0]);
        }
    }

    protected String _typeQName(JavaType type) {
        return type.getRawClass().getName();
    }

    protected String _subTypeName(NamedType type) {
        return type.getType().getName();
    }

    protected boolean _isSetType(Class<?> cls) {
        if (cls != null) {
            if (Set.class.equals(cls)) {
                return true;
            }

            Class<?>[] var2 = cls.getInterfaces();
            for (Class<?> a : var2) {
                if (Set.class.equals(a) || "interface scala.collection.Set".equals(a.toString())) {
                    return true;
                }
            }
        }

        return false;
    }
}
