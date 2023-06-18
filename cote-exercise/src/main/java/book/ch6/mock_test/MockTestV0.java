package book.ch6.mock_test;

import java.util.stream.IntStream;

class MockTestV0 {
    private static final int[][] RULES = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
    };

    public int[] solution(int[] answers) {
        int[] corrects = new int[3];
        int max = 0;

        for (int problem = 0; problem < answers.length; problem++) {
            // 현재 문제
            int answer = answers[problem];

            // 수포자별 현재 문제에 대한 답 구하기
            for (int person = 0; person < 3; person++) {
                int personAnswer = getAnswer(person, problem);

                // 수포자의 답과 현재 문제의 답이 같으면
                if (answer == personAnswer && ++corrects[person] > max) {
                    max = corrects[person];
                }
            }
        }

        final int maxCorrect = max;
        return IntStream.range(0,3)
                .filter(i -> corrects[i] == maxCorrect)
                .map(i -> i+1)
                .toArray();
    }

    private int getAnswer(int person, int problem) {
        int[] rule = RULES[person];
        int index = problem % rule.length;
        return rule[index];
    }
}
