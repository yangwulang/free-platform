package top.yangwulang.platform.config.j2cache.cache.support.caffeine;

public class CacheConfig {

    private long size = 0L;
    private long expire = 0L;

    @Override
    public String toString() {
        return String.format("[SIZE:%d,EXPIRE:%d]", this.size, this.expire);
    }

    public static long getSize(CacheConfig cacheConfig) {
        return cacheConfig.size;
    }

    public static long getExpire(CacheConfig cacheConfig) {
        return cacheConfig.expire;
    }

    public static CacheConfig build(String a) {
        CacheConfig var1 = null;
        String[] var2 = a.split(",");
        int var10000 = var2.length;
        String var3;
        if (var10000 == 1) {
            var1 = new CacheConfig();
            var3 = var2[0].trim();
            var1.size = Long.parseLong(var3);
            return var1;
        } else {
            if (var10000 == 2) {
                var1 = new CacheConfig();
                var3 = var2[0].trim();
                String var4;
                String var6 = var4 = var2[1].trim();
                var1.size = Long.parseLong(var3);
                int var7 = var4.length();
                char var5 = Character.toLowerCase(var6.charAt(var7 - 1));
                var7 = var4.length();
                var1.expire = Long.parseLong(var6.substring(0, var7 - 1));
                switch(var5) {
                    case 'd':
                        var1.expire *= 86400L;
                        return var1;
                    case 'h':
                        var1.expire *= 3600L;
                        return var1;
                    case 'm':
                        var1.expire *= 60L;
                        return var1;
                    case 's':
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown expire unit:"+var5);
                }
            }

            return var1;
        }
    }

}
