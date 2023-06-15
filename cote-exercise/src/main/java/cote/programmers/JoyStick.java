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

            // A를 제외한 다음 index
            int next = cur + 1;
            while (next < nameLen && name.charAt(next) == 'A') {
                next++;
            }

            // 좌우 이동거리 구하기
            int distance = Math.min(cur, nameLen - next);
            move = Math.min(move, cur + nameLen - next + distance);
        }

        return answer + move;
    }
}
