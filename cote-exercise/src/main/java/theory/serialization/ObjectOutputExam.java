package theory.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectOutputExam {
    public static void main(String[] args) throws IOException {
        User user1 = new User("hong@example.com", "홍길동", 2020);
        User user2 = new User("kim@example.com", "김철수", 1990);
        User user3 = new User("lee@example.com", "이영희", 2000);
        ArrayList<User> list = new ArrayList<>(); // ArrayList 자체도 직렬화 가능
        list.add(user1);
        list.add(user2);
        list.add(user3);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("/tmp/userlist.dat"));
        out.writeObject(list); // user를 객체 직렬화시켜서 파일에 저장
        out.close();
    }
}
