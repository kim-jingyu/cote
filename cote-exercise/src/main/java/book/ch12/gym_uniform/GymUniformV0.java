package book.ch12.gym_uniform;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

public class GymUniformV0 implements GymUniform{
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

        Queue<Integer> q = new LinkedList<>();

        for (int l : lost) {
            q.add(l);
        }

        int cnt = 0;

        for (int r : reserve) {
            if (owns.contains(r)) continue;

            while (!q.isEmpty() && (q.peek() < r - 1 || owns.contains(q.peek()))) {
                q.poll();
            }
            if (q.isEmpty()) break;

            if (q.peek() <= r + 1) {
                q.poll();
                cnt++;
            }
        }

        return n - lost.length + owns.size() + cnt;
    }
}
