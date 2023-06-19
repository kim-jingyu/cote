package book.ch7.number_at_k;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberAtKV0 implements NumberAtK{
    @Override
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();
        for (int[] command : commands) {
            calculate(command, array, answer);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    private void calculate(int[] command, int[] array, List<Integer> answer) {
        int start = command[0];
        int end = command[1];

        int[] copied = Arrays.copyOfRange(array, start - 1, end);

        Arrays.sort(copied);

        int result = copied[command[2] - 1];

        answer.add(result);
    }
}
