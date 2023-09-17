package theory.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterIO {
    public static void main(String[] args) throws IOException {
        Writer out = new FileWriter("/tmp/hello.txt");
        out.write((int) '가');
        out.write((int) '나');
        out.write((int) '다');
        out.close();
    }
}
