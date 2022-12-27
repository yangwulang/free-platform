package top.yangwulang.platform.utils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

public class ResourceUtils extends org.springframework.util.ResourceUtils {
    private static ResourceLoader resourceLoader = new DefaultResourceLoader();
    private static ResourcePatternResolver resourceResolver;

    public ResourceUtils() {
    }

    public static ResourceLoader getResourceLoader() {
        return resourceLoader;
    }

    public static ClassLoader getClassLoader() {
        return resourceLoader.getClassLoader();
    }

    public static Resource getResource(String location) {
        return resourceLoader.getResource(location);
    }

    public static InputStream getResourceFileStream(String location) throws IOException {
        return resourceLoader.getResource(location).getInputStream();
    }

    public static String getResourceFileContent(String location) {
        try {
            InputStream is = getResourceFileStream(location);
            Throwable throwable = null;

            try {
                return IOUtils.toString(is, StandardCharsets.UTF_8);
            } catch (Throwable var13) {
                throwable = var13;
                throw var13;
            } finally {
                if (throwable != null) {
                    try {
                        is.close();
                    } catch (Throwable var12) {
                        throwable.addSuppressed(var12);
                    }
                } else {
                    is.close();
                }
            }
        } catch (IOException var15) {
            throw new RuntimeException(var15);
        }
    }

    public static Resource[] getResources(String locationPattern) {
        try {
            return resourceResolver.getResources(locationPattern);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        resourceResolver = new PathMatchingResourcePatternResolver(resourceLoader);
    }
}
