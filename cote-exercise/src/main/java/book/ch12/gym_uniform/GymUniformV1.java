package book.ch12.gym_uniform;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

public class GymUniformV1 implements GymUniform{

    @Override
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);

        Set<Integer> owns = Arrays.stream(lost)
                .boxed()
                .collect(Collectors.toSet());

        owns.retainAll(Arrays.stream(reserve)
                .boxed()
                .collect(Collectors.toSet()));

        Queue<Integer> queue = new LinkedList<>();
        for (int l : lost) {
            if (owns.contains(l)) continue;
            queue.add(l);
        }

        int cnt = 0;
        for (int r : reserve) {
            if (owns.contains(r)) continue;

            // 체육복을 빌릴 수 없는 학생들. 최소 숫자의 학생보다 2이상 작을때
            while (!queue.isEmpty() && queue.peek() < r - 1) {
                queue.poll();
            }
            if (queue.isEmpty()) break;

            // 체육복 빌리기 가능한 학생들.
            if (queue.peek() <= r + 1) {
                queue.poll();
                cnt++;
            }
        }

        return n - lost.length + owns.size() + cnt;
    }
}
