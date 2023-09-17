package theory.io;

import java.io.File;
import java.io.IOException;

public class FileInfo {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("사용법 : java FileInfo 파일이름");
            System.exit(0);
        }

        // File(String pathName)
        File file = new File(args[0]);
        if (file.exists()) { // 파일이 존재할 경우
            System.out.println("file.length() = " + file.length());
            System.out.println("file.canRead() = " + file.canRead());
            System.out.println("file.canWrite() = " + file.canWrite());
            System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
            try {
                System.out.println("file.getCanonicalPath() = " + file.getCanonicalPath());
            } catch (IOException e) {
                System.out.println(e);
            }
            System.out.println("file.getName() = " + file.getName());
            System.out.println("file.getParent() = " + file.getParent());
            System.out.println("file.getPath() = " + file.getPath());
        } else {
            System.out.println("파일이 존재하지 않습니다.");
        }
    }
}
