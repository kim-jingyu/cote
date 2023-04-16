package cote.programmers;

public class GymUniform {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] curLost = new int[n];
        int[] curReserve = new int[n];

        // 초기화
        for (int cur : lost) {
            curLost[cur-1] = 1;
        }
        for (int cur : reserve) {
            curReserve[cur-1] = 1;
        }

        // lost, reserve 중복 제거
        for (int i = 0; i < n; i++) {
            if (curLost[i] == 1 && curReserve[i] == 1) {
                curLost[i] = 0;
                curReserve[i] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            if (curReserve[i] == 1) {
                if (i - 1 == -1) {
                    curLost[i + 1] = 0;
                    continue;
                }
                if (i + 1 == n) {
                    curLost[i - 1] = 0;
                    continue;
                }
                curLost[i - 1] = 0;
            }
        }

        for (int cur : curLost) {
            if (cur == 1) {
                answer++;
            }
        }

        return n - answer;
    }
}
