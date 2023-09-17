package theory.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class HelloIOExam {
    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream("/tmp/hello.dat");
        out.write(1); // 0000 0000  0000 0000  0000 0000  "0000 0001"만 저장
        out.write(255);
        out.write(0);
        out.close();
    }
}
