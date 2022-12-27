package top.yangwulang.platform.utils;

import org.apache.commons.lang3.StringUtils;

import java.io.File;

public class FileUtils {
    public static String path(String path) {
        String p = StringUtils.replace(path, "\\", "/");
        p = StringUtils.join(StringUtils.split(p, "/"), "/");
        if (!StringUtils.startsWithAny(p, "/") && StringUtils.startsWithAny(path, "\\", "/")) {
            p = p + "/";
        }

        if (!StringUtils.endsWithAny(p, "/") && StringUtils.endsWithAny(path, "\\", "/")) {
            p = p + "/";
        }

        if (path != null && path.startsWith("/")) {
            p = "/" + p;
        }

        return p;
    }

    public static String defaultLocalPath() {
        File file = new File("");
        return file.getAbsolutePath();
    }

    public static String defaultUploadLocalPath() {
        return defaultLocalPath() + "\\upload";
    }
}
