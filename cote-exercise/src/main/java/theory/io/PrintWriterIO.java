package theory.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class PrintWriterIO {
    public static void main(String[] args) throws FileNotFoundException {
        // 한줄씩 출력하는 메서드를 가진다.
        PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream("/tmp/my.txt")));
        out.println("hello");
        out.println("world");
        out.println("1");
        out.close();
    }
}
