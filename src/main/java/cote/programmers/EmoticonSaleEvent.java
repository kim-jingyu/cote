package cote.programmers;

import java.util.ArrayList;
import java.util.List;

/**
 * 2023 KAKAO BLIND RECRUITMENT
 */
public class EmoticonSaleEvent {
    public int[] solution(int[][] users, int[] emoticons) {
        int[] answer = {};
        // emoticon 별 rate, userMoney, plus 가입자 수
        ArrayList<List<Integer>> emoticon = new ArrayList<>(emoticons.length);

        // 0. users 에서 emoticon 최소 비율 가져오기
        int minRate = 40;
        for (int[] user : users) {
            minRate = Math.min(minRate, user[0]);
        }

        // 1. emoticon 별로 비율 배정하기 ( minRate ~ 40 )
        for (int rate = 40; rate >= minRate; rate--) {

            // emoticons[i] 의 비율이 rate 일 때,
            for (int i = 0; i < emoticons.length; i++) {
                // 2. rate 가 user 의 rate (user[0]) 보다 크거나같으면
                for (int j = 0; j < users.length; j++) {
                    if (rate >= users[j][0]) {
                        List<Integer> info = emoticon.get(i);
                        info.add(rate);
                        // userMoney = emoticons[0] X rate
                        info.add(emoticons[i] * (100 - rate) / 100);
                        info.add(0);
                    }
                }
            }
        }

        return answer;
    }
}
