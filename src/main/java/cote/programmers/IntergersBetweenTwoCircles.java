package cote.programmers;

public class IntergersBetweenTwoCircles {
    public long solution(int r1, int r2) {
        long answer = 0;

        long initValue = 8;

        for (int i = 1; i < r1; i++) {
            initValue += 8;
        }

        for (int i = r1; i < r2; i++) {
            answer += initValue;
            initValue += 8;
        }

        answer += 4;

        return answer;
    }
}
