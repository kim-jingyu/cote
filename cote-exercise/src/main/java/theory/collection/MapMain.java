package theory.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("kim", "김");
        map.put("lee", "이");
        map.put("hong", "홍");
        map.put("hong", "홍길동");

        Set<String> keySet = map.keySet();
        Iterator<String> iter = keySet.iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            String value = map.get(key);

            System.out.println(key + ":" + value);
        }
    }
}
