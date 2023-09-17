package theory.io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamExam01 {
    public static void main(String[] args) {
        InputStream inputStream = null;

        try {
            int data = inputStream.read(); // byte -> int ?
        } catch (IOException e) {
            System.out.println("io오류 = " + e);
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                System.out.println("io오류2 = " + e);
            }
        }
    }
}
