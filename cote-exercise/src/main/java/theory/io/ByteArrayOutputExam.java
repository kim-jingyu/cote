package theory.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputExam {
    public static void main(String[] args) throws IOException {
        int data1 = 1;
        int data2 = 2;

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(data1);
        out.write(data2);
        out.close();

        byte[] array = out.toByteArray();
        System.out.println("array.length = " + array.length);
        System.out.println("array[0] = " + array[0]);
        System.out.println("array[1] = " + array[1]);
    }
}
