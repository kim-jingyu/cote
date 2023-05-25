package cote.programmers;

import java.util.Arrays;

class InterceptionSystem {
    public int solution(int[][] targets) {
        int answer = 0;

        Arrays.sort(targets, ((o1, o2) -> {return o1[1] - o2[1];})); // x좌표 right(최대값) 값 기준으로 정렬

        // 현재 요격 가능 최대값보다 target 의 left(최소값) 가 크거나 같으면, answer 업데이트
        int interceptMax = 0;

        for (int[] target : targets) {
            if (target[0] < interceptMax) continue;

            answer++;
            interceptMax = target[1];
        }


        return answer;
    }
}
