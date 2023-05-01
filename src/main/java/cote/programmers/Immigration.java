package cote.programmers;

public class Immigration {
    public long solution(int n, int[] times) {
        int start = 1;      // 최소 시간
        int end = 0;        // 최대 시간
        for (int time : times) {
            end = Math.max(end, time * n);
        }
        int answer = end;     // 최소 시간 업데이트용 변수
        int mid = 0;        // 탐색용 중간값

        while (start <= end) {
            mid = (start + end) / 2;

            int people = 0;     // 각 심사관이 심사할 수 있는 사람의 수
            for (int time : times) {
                people += mid / time;
            }

            if (people < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
                answer = Math.min(answer, mid);
            }
        }

        return answer;
    }
}
