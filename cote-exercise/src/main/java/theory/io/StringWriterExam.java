package theory.io;

import java.io.IOException;
import java.io.StringWriter;

public class StringWriterExam {
    public static void main(String[] args) throws IOException {
        // 생성자 아무것도 안 받아들이는 IO 객체는 메모리에 쓴다.
        StringWriter out = new StringWriter();
        out.write("hello");
        out.write("world");
        out.close();

        String str = out.toString();
        System.out.println("str = " + str);
    }
}
