package cote.programmers;

import java.util.Arrays;

public class GymUniform {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] students = new int[n + 1];
        Arrays.fill(students, 1);

        for (int curLost : lost) students[curLost]--;
        for (int curReserve : reserve) students[curReserve]++;

        for (int cur = 1; cur <= n; cur++) {
            if (students[cur] == 2) {
                if (cur != 1 && students[cur - 1] == 0) {
                    students[cur - 1]++;
                    students[cur]--;
                } else if (cur != n && students[cur + 1] == 0) {
                    students[cur + 1]++;
                    students[cur]--;
                }
            }
        }

        for (int cur = 1; cur <= n; cur++) {
            if (students[cur] >= 1) {
                answer++;
            }
        }

        return answer;
    }
}
