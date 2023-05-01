package cote.programmers;

import java.util.Arrays;

public class Immigration {
    /**
     * @param n 입국 심사를 기다리는 사람 수
     * @param times 각 심사관 한 명을 심사하는데 걸리는 시간 배열
     * @return 모든 사람이 심사를 받는데 걸리는 시간의 최솟값
     */
    public long solution(int n, int[] times) {
        long start = 1;                                     // 모든 사람이 심사를 받는데 걸리는 시간 min
        long end = (long) Arrays.stream(times).max().getAsInt() * n;   // 모든 사람이 심사를 받는데 걸리는 시간 max

        long answer = end;          // 최소 시간 업데이트용 변수
        long mid = 0;               // 탐색용 중간값

        while (start <= end) {
            mid = (start + end) / 2;

            long people = 0;        // 각 심사관이 심사할 수 있는 사람의 수
            for (int time : times) {
                people += mid / time;
            }

            if (people < n) {       // 각 심사관이 심사할 수 있는 사람의 수보다 대기 인원 수보다 작으면
                start = mid + 1;    // 모든 사람이 심사를 받는데 걸리는 최소 시간이 늘어난다.
            } else {                // 각 심사관이 심사할 수 있는 사람의 수가 대기 인원보다 크거나 같으면
                end = mid - 1;      // 모든 사람이 심사를 받는데 걸리는 최대 시간이 줄어든다.
                answer = mid;
            }
        }

        return answer;
    }
}
