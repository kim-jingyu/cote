package cote.programmers.test;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class NO1 {
    public int solution(String s, int N) {
        int answer = -1;

        Set<Integer> correct = new HashSet<>();
        for (int i = 1; i <= N; i++) {
            correct.add(i);
        }

        for (int i = 0; i <= s.length() - N; i++) {
            String substringed = s.substring(i, i + N);
            Set<Integer> set = substringed.chars()
                    .mapToObj(c -> Character.getNumericValue(c))
                    .collect(Collectors.toSet());

            if (set.containsAll(correct)) {
                int value = Integer.parseInt(substringed);
                System.out.println("value = " + value);
                answer = Math.max(answer, value);
            }
        }

        return answer;
    }
}
