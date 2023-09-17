package theory.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class HelloIOExam02 {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("/tmp/hello.dat");

//        int in1 = in.read();
//        System.out.println("in1 = " + in1); // 1
//
//        int in2 = in.read();
//        System.out.println("in2 = " + in2); // 255
//
//        int in3 = in.read();
//        System.out.println("in3 = " + in3); // 0
//
//        int in4 = in.read();
//        System.out.println("in4 = " + in4); // EOF. -1
        int buf = -1;
        while ((buf = in.read()) != -1) {
            System.out.println(buf);
        }

        in.close();
    }
}
