package cote.programmers;

public class IntergersBetweenTwoCircles {
    public long solution(int r1, int r2) {
        long answer = 0;

        // 1사분면 - x축을 기준으로 y값의 개수를 구한다.
        for (int x = 1; x < r2; x++) {
            long cnt = 0L;
            double y2 = Math.sqrt(Math.pow(r2, 2) - Math.pow(x, 2)); // y2값의 개수
            double y1 = Math.sqrt(Math.pow(r1, 2) - Math.pow(x, 2)); // y1값의 개수

            if (isInteger(y1)) cnt = (long) y2 - (long) y1 + 1;
            else cnt = (long) y2 - (long) y1;

            answer += cnt * 4L;
        }

        // r2 좌표 선상 위의 값을 구한다.
        answer += (r2 - r1) * 4L;

        return answer;
    }

    private boolean isInteger(double y1) {
        return y1 == (long)y1;
    }
}
