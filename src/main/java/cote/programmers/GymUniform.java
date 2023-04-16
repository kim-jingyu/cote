package cote.programmers;

import java.util.Arrays;

public class GymUniform {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] students = new int[n + 1];
        Arrays.fill(students, 1);

        for (int curLost : lost) students[curLost]--;
        for (int curReserve : reserve) students[curReserve]++;



        return n - answer;
    }
}
