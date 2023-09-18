package theory.serialization;

import java.io.*;
import java.util.ArrayList;

public class ObjectIOExam {
    public static void main(String[] args) throws Exception {
        User user1 = new User("hong@example.com", "홍길동", 2020);
        User user2 = new User("kim@example.com", "김철수", 1990);
        User user3 = new User("lee@example.com", "이영희", 2000);
        ArrayList<User> list = new ArrayList<>(); // ArrayList 자체도 직렬화 가능
        list.add(user1);
        list.add(user2);
        list.add(user3);

        // 기존 list를 받아들여서 ArrayList로 copy하는 메서드
        ArrayList<User> list2 = copy(list);

        for (User user : list2) {
            System.out.println("user = " + user);
        }
    }

    private static ArrayList<User> copy(ArrayList<User> list) throws IOException, ClassNotFoundException {
        // Object output stream 에 쓴 것이 바이트 배열 메모리에 저장된다.
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bout);
        out.writeObject(list);
        out.close();
        bout.close();

        byte[] array = bout.toByteArray(); // list가 직렬화되어서 byte 배열이 됨

        // 역직렬화
        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(array));
        ArrayList<User> list2 = (ArrayList) in.readObject();
        in.close();
        return list2;
    }
}
