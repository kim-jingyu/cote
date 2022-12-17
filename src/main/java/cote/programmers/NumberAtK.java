package cote.programmers;

import java.util.Arrays;

public class NumberAtK {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int location = commands[i][2];

            int[] sliced = Arrays.copyOfRange(array, start - 1, end);
            Arrays.sort(sliced);
            answer[i] = sliced[location - 1];
        }

        return answer;
    }
}

//[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]