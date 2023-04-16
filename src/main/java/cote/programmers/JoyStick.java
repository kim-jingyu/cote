package cote.programmers;

import java.util.Arrays;

public class JoyStick {
    public int solution(String name) {
        int answer = 0;
        int[] values = new int[name.length()];
        Arrays.fill(values, 0);

        int[] params = new int[name.length()];
        for (int i = 0; i<name.length(); i++) {
            params[i] = name.charAt(i) - 65;
        }

        int pos = 0;
        for (int cur = 0; cur < name.length(); cur++) {
            if (values[cur] == params[cur]) continue;

            if (Math.abs(pos - cur) > (name.length() / 2)) {
                answer += (name.length() - cur);
                pos = cur;
                if (Math.abs(values[cur] - params[cur]) > 13) {
                    answer += Math.abs(params[cur] - 25) + 1;
                } else {
                    answer += Math.abs(values[cur] - params[cur]);
                }
            }else {
                answer += (cur - pos);
                if (Math.abs(values[cur] - params[cur]) > 13) {
                    answer += Math.abs(params[cur] - 25) + 1;
                    pos = cur;
                } else {
                    answer += Math.abs(values[cur] - params[cur]);
                    pos = cur;
                }
            }
        }

        return answer;
    }
}
