package theory.collection;

import java.util.ArrayList;

public class WithoutGenericArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("kim");
        list.add("lee");
        list.add("hong");

        String str1 = (String) list.get(0);
        String str2 = (String) list.get(1);
        String str3 = (String) list.get(2);

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
    }
}
