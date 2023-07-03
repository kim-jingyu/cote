package book.ch9.a_to_b;

import java.util.HashMap;
import java.util.Map;

public class AToBV0 implements AToB{
    @Override
    public int solution(String before, String after) {
        return toMap(before).equals(toMap(after)) ? 1 : 0;
    }

    private Map<Character, Integer> toMap(String before) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : before.toCharArray()) {
            map.putIfAbsent(c, 0);
            map.put(c, map.get(c) + 1);
        }

        return map;
    }
}
