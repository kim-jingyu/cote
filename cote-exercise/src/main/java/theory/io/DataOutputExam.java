package theory.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputExam {
    public static void main(String[] args) throws Exception {
        // /tmp/score.dat 파일에 저장한다.
        String name = "kim";
        int kor = 90;
        int eng = 60;
        int math = 70;
        double total = kor + eng + math;
        double avg = total / 3.0;

        // 다양한 타입을 저장할 때 사용하는 객체 -> DataOutputStream
        DataOutputStream out = new DataOutputStream(new FileOutputStream("/tmp/score.dat"));
        for (int i = 0; i < 2; i++) {
            write(out, name, kor, eng, math, total, avg);
        }
        out.close();
    }

    private static void write(DataOutputStream out, String name, int kor, int eng, int math, double total, double avg) throws IOException {
        out.writeUTF(name);
        out.writeInt(kor);
        out.writeInt(eng);
        out.writeInt(math);
        out.writeDouble(total);
        out.writeDouble(avg);
    }
}
