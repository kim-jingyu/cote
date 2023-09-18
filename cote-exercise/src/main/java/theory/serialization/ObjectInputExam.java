package theory.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectInputExam {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("/tmp/userlist.dat"));
        ArrayList<User> list = (ArrayList) in.readObject(); // 파일에 있는 데이터를 읽어들여서 역직렬화
        in.close();

        for (User user : list) {
            System.out.println("user = " + user);
        }
    }
}
