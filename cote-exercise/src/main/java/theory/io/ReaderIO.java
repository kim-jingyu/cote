package theory.io;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderIO {
    public static void main(String[] args) throws IOException {
        Reader in = new FileReader("/tmp/hello.txt");

        int ch = -1;
        while ((ch = in.read()) != -1) {
            System.out.println("(char) ch = " + (char) ch);
        }

        in.close();
    }
}
