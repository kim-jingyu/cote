package theory.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        boolean flag1 = set.add("kim");
        boolean flag2 = set.add("lee");
        boolean flag3 = set.add("hong");
        boolean flag4 = set.add("hong");
        System.out.println("flag3 = " + flag3);
        System.out.println("flag4 = " + flag4);

        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            System.out.println("str = " + str);
        }
    }
}
