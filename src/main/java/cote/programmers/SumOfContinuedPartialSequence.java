package cote.programmers;

import java.util.ArrayList;
import java.util.List;

public class SumOfContinuedPartialSequence {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        List<List<Integer>> temp = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int leftMin = Integer.MAX_VALUE;

        for (int start = 0; start < sequence.length; start++) {
            for (int end = start; end < sequence.length; end++) {
                int sum = 0;
                for (int i = start; i <= end; i++) {
                    sum += sequence[i];
                }
                if (sum == k) {
                    List<Integer> values = new ArrayList<>();
                    values.add(start);
                    values.add(end);
                    temp.add(values);
                    break;
                }
            }
        }

        for (List<Integer> values : temp) {
            if (values.get(1) - values.get(0) < min) {
                min = values.get(1) - values.get(0);
                leftMin = values.get(0);
                answer = new int[]{values.get(0), values.get(1)};
            } else if (values.get(1) - values.get(0) == min && leftMin > values.get(0)) {
                leftMin = values.get(0);
                answer = new int[]{values.get(0), values.get(1)};
            }
        }

        return answer;
    }
}
