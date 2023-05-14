package cote.programmers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class PresentByN {
    // dp에는 숫자 N으로 만들어진 경우의 수가 들어간다.
    public int solution(int N, int number) {
        int answer = -1;
        List<Set<Integer>> dp = new ArrayList<>();

        // 숫자 N으로 만들어진 dp 리스트 만들기
        for (int i = 1; i <= 8; i++) {
            Set<Integer> tmp = new HashSet<>();
            tmp.add(Integer.parseInt(Integer.toString(N).repeat(i)));
            dp.add(tmp);
        }


        return answer;
    }
}
