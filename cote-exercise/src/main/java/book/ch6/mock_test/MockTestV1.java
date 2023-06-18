package book.ch6.mock_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockTestV1 implements MockTest{
    private static final int[][] RULES = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4}
    };
    public int[] solution(int[] answers) {
        int[] cnt = new int[RULES.length];
        for (int i = 0; i < RULES.length; i++) {
            int ruleLength = RULES[i].length;
            for (int j = 0; j < answers.length; j++) {
                int curRule = j % ruleLength;
                if (answers[j] == RULES[i][curRule]) cnt[i]++;
            }
        }

        Arrays.sort(cnt);

        for (int i : cnt) {
            System.out.println("i = " + i);
        }

        List<Integer> answer = new ArrayList<>();
        int max = -1;
        for (int i = RULES.length; i >= 1; i--) {
            if (cnt[i - 1] >= max) {
                max = cnt[i - 1];
                answer.add(4 - i);
            }
        }

        return answer.stream()
                .mapToInt(i -> Integer.parseInt(String.valueOf(i)))
                .toArray();
    }
}
