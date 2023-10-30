package top.yangwulang.platform.utils;

import cn.hutool.core.io.FileUtil;
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

    /**
     * 级联创建文件或者文件夹
     * @param fileOrDir 文件或者文件夹
     * @return 创建的文件
     */
    public static File touch(String fileOrDir) {
        return FileUtil.touch(fileOrDir);
    }
}
