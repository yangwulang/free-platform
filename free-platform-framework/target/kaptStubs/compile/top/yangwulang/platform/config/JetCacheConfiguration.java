package top.yangwulang.platform.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Ltop/yangwulang/platform/config/JetCacheConfiguration;", "", "()V", "SerialPolicyJimmer", "free-platform-framework"})
@com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation
@com.alicp.jetcache.anno.config.EnableMethodCache(basePackages = {"top.yangwulang.platform"})
@org.springframework.context.annotation.Configuration
public class JetCacheConfiguration {
    
    public JetCacheConfiguration() {
        super();
    }
    
    /**
     * jetcache中序列化策略
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00050\u0004H\u0016\u00a8\u0006\b"}, d2 = {"Ltop/yangwulang/platform/config/JetCacheConfiguration$SerialPolicyJimmer;", "Lcom/alicp/jetcache/anno/SerialPolicy;", "()V", "decoder", "Ljava/util/function/Function;", "", "", "encoder", "free-platform-framework"})
    public static final class SerialPolicyJimmer implements com.alicp.jetcache.anno.SerialPolicy {
        
        public SerialPolicyJimmer() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.util.function.Function<java.lang.Object, byte[]> encoder() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.util.function.Function<byte[], java.lang.Object> decoder() {
            return null;
        }
    }
}