package top.yangwulang.platform;

import org.junit.jupiter.api.Test;
import top.yangwulang.platform.utils.FileUtils;

public class FileUtilTest {

    @Test
    public void testDefaultPath() {
        System.out.println(FileUtils.defaultUploadLocalPath());
    }
}
