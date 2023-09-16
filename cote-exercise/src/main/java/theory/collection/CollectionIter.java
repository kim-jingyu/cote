package theory.collection;

import java.util.*;

public class CollectionIter {
    public static void main(String[] args) {
        List<String> collection = new ArrayList<>();
        collection.add("kim");
        collection.add("lee");
        collection.add("hong");

        System.out.println("collection.size() = " + collection.size());
        Collections.sort(collection);

        Iterator<String> iter = collection.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            System.out.println("str = " + str);
        }
    }
}
