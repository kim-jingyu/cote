package cote.topcoder;

import java.util.HashMap;
import java.util.Map;

public class InterestingParty {
    public int bestInvitation(String[] first, String[] second) {
        Map<String, Integer> countPerInterest = new HashMap<>();
        int answer = 0;

        for (int i = 0; i < first.length; i++) {
            countPerInterest.putIfAbsent(first[i], 0);
            countPerInterest.putIfAbsent(second[i], 0);
        }

        for (int i = 0; i < first.length; i++) {
            countPerInterest.put(first[i], countPerInterest.get(first[i]) + 1);
            countPerInterest.put(second[i], countPerInterest.get(second[i]) + 1);
        }

        for (Integer value : countPerInterest.values()) {
            answer = Math.max(answer, value);
        }

        return answer;
    }
}
