package theory.io;

import java.io.IOException;
import java.io.StringReader;

public class StringReaderExam {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader("helloworld");
        int ch = -1;

        while ((ch = in.read()) != -1) {
            System.out.print((char) ch);
        }
        in.close();
    }
}
