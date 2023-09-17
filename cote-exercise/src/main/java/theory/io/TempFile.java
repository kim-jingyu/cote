package theory.io;

import java.io.File;
import java.io.IOException;

// 임시 파일의 생성과 삭제
public class TempFile {
    public static void main(String[] args) {
        try {
            File f = File.createTempFile("tmp_", ".dat");
            System.out.println("f.getAbsolutePath() = " + f.getAbsolutePath());
            System.out.println("10초 동안 멈춰있다.");
            try {
                Thread.sleep(10000); // 10초 동안 프로그램이 멈춘다.
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            f.deleteOnExit(); // JVM이 종료될 때 임시파일을 자동으로 삭제한다.
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
