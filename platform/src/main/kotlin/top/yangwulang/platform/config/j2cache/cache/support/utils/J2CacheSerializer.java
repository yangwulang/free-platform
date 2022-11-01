package top.yangwulang.platform.config.j2cache.cache.support.utils;

import net.oschina.j2cache.util.Serializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;
import top.yangwulang.platform.utils.ObjectUtils;

/**
 * @author yangwulang
 */
public class J2CacheSerializer implements RedisSerializer<Object>, Serializer {
    @Override
    public byte[] serialize(Object t) throws SerializationException {
        return ObjectUtils.serialize(t);
    }

    @Override
    public String name() {
        return "jeesite";
    }

    @Override
    public Object deserialize(byte[] bytes) throws SerializationException {
        return ObjectUtils.unserialize(bytes);
    }
}
