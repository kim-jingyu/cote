package book.ch9.player_who_cant_finish;

import java.util.HashMap;
import java.util.Map;

public class PlayerWhoCantFinishV0 implements PlayerWhoCantFinish{
    @Override
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        for (String p : participant) {
            map.putIfAbsent(p, 0);
            map.put(p, map.get(p) + 1);
        }

        for (String c : completion) {
            int value = map.get(c) - 1;
            map.put(c, value);
            if (value == 0) {
                map.remove(c);
            }
        }

        return map.keySet().iterator().next();
    }
}
