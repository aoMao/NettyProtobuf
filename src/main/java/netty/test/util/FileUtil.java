package netty.test.util;

import java.io.File;

public class FileUtil {

    public static void deleteFile(File file) {
        if (!file.exists()) {
            return;
        }

        if (file.isFile()) {
            file.delete();
        } else {
            File[] files = file.listFiles();
            for (File f : files) {
                deleteFile(f);
            }
            file.delete();
        }
    }
}
