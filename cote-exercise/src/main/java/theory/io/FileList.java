package theory.io;

import java.io.File;

public class FileList {
    public static void main(String[] args) {
        File file = new File("/tmp/");

        printFiles(file);
    }

    private static void printFiles(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                if (f.isDirectory()) {
                    System.out.println("[dir] f.getName() = " + f.getName());
                    printFiles(f);
                    continue;
                }
                System.out.println("f.getName() = " + f.getName());
            }
        } else {
            System.out.println("디렉토리가 아닙니다.");
        }
    }
}
