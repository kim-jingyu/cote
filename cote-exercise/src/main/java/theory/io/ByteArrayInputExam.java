package theory.io;

import java.io.ByteArrayInputStream;

public class ByteArrayInputExam {
    public static void main(String[] args) throws Exception {
        byte[] array = new byte[2];
        array[0] = (byte) 1;
        array[1] = (byte) 2;

        ByteArrayInputStream in = new ByteArrayInputStream(array);
        int read1 = in.read(); // 첫번째 바이트 값
        int read2 = in.read(); // 두번째 바이트 값
        int read3 = in.read(); // EOF
        in.close();
    }
}
