package book.ch6.mock_test;

import java.util.ArrayList;
import java.util.List;

public class MockTestV1 implements MockTest{
    private static final int[][] RULES = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
    };
    public int[] solution(int[] answers) {
        List<Integer> result = new ArrayList<>();
        int[] correct = new int[RULES.length];
        int max = 0;

        for (int problem = 0; problem < answers.length; problem++) {
            int answer = answers[problem];
            for (int person = 0; person < RULES.length; person++) {
                int index = problem % RULES[person].length;
                if (answer == RULES[person][index]) {
                    correct[person]++;
                    if (correct[person] > max) {
                        max = correct[person];
                    }
                }
            }
        }

        for (int i = 0; i < RULES.length; i++) {
            if (correct[i] == max) {
                result.add(i + 1);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
