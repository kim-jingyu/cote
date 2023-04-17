package cote.programmers;

import java.util.Arrays;

public class JoyStick {
    public int solution(String name) {
        int answer = 0;
        int nameLen = name.length();
        int move = nameLen - 1;

        for (int cur = 0; cur < nameLen; cur++) {
            // 상하 이동거리 구하기
            answer += Math.min(name.charAt(cur) - 'A', 'Z' - name.charAt(cur) + 1);

            // A의 마지막 위치
            int lastPosA = cur + 1;
            while (lastPosA < nameLen && name.charAt(lastPosA) == 'A') {
                lastPosA++;
            }

            // 좌우 이동거리 구하기
            // cur = 오른쪽 이동거리
            // name - lastPosA = 왼쪽 이동거리
            // Math.min(cur, nameLen - lastPosA) = 끝에서 해당 숫자까지 이동거리, 오른쪽 이동거리 중 작은 값
            move = Math.min(move, cur + (nameLen - lastPosA) + Math.min(cur, nameLen - lastPosA));
        }

        return answer + move;
    }
}
