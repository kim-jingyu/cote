package cote.topcoder;

import java.util.ArrayList;
import java.util.List;

public class InterestingDigits {
    public int[] digits(int base) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 2; i < base; i++) {
            if ((base - 1) % i == 0) {
                answer.add(i);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
