package top.yangwulang.platform.config;

import io.swagger.v3.core.converter.AnnotatedType;
import io.swagger.v3.core.converter.ModelConverter;
import io.swagger.v3.core.converter.ModelConverterContext;
import io.swagger.v3.oas.models.media.Schema;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Iterator;

/**
 * @author yangwulang
 */
//@Configuration
@Slf4j
public class CustomerOpenApi {


    @Bean
    public Converter converter() {
        return new Converter();
    }


    record Converter() implements ModelConverter {

        @Override
        public Schema<?> resolve(AnnotatedType annotatedType, ModelConverterContext modelConverterContext, Iterator<ModelConverter> chain) {
            if (chain.hasNext()) {
                Type annotatedTypeRaw = annotatedType.getType();
                if (annotatedTypeRaw instanceof Class<?> type && type.isInterface()) {
                    io.swagger.v3.oas.annotations.media.Schema annotation = type.getAnnotation(io.swagger.v3.oas.annotations.media.Schema.class);
                    if (annotation == null) {
                        return chain.next().resolve(annotatedType, modelConverterContext, chain);
                    }
                    Schema<?> schema = new Schema<>();
                    schema.setDescription(annotation.description());
                    String name = annotation.name();
                    if ("".equals(name)) {
                        name = ((Class<?>) annotatedTypeRaw).getSimpleName();
                    }
                    schema.setName(name);
                    Method[] declaredMethods = type.getDeclaredMethods();
                    for (Method declaredMethod : declaredMethods) {
                        io.swagger.v3.oas.annotations.media.Schema fieldSchema = declaredMethod.getAnnotation(io.swagger.v3.oas.annotations.media.Schema.class);
                        if (fieldSchema == null) {
                            continue;
                        }
                        Schema<?> fileSchemaObj = new Schema<>();
                        fileSchemaObj.setDescription(fieldSchema.description());
                        fileSchemaObj.setName(fieldSchema.name());
                        fileSchemaObj.setType(declaredMethod.getReturnType().getTypeName());
                        schema.addProperty(declaredMethod.getName(),fileSchemaObj);
                    }
                    return schema;
                }
                return chain.next().resolve(annotatedType, modelConverterContext, chain);
            }
            return null;
        }
    }
}
