package cote.programmers;

/**
 * 2023 KAKAO BLIND RECRUITMENT
 */
public class EmoticonSaleEvent {
    private int emoticonPlus = 0;
    private int[] userMoney;
    public int[] solution(int[][] users, int[] emoticons) {
        int[] answer = {};
        int[] discounts = {10, 20, 30, 40};
        int[] arr = new int[emoticons.length];  // 할인율 저장 배열
        userMoney = new int[users.length];

        dfs(0, discounts, users, emoticons, arr);

        for (int i : userMoney) {
            System.out.println(i);
        }

        System.out.println("emoticonPlus = " + emoticonPlus);

        return answer;
    }

    private void dfs(int level, int[] discounts, int[][] users, int[] emoticons, int[] arr) {
        if (level == emoticons.length) {
            // arr -> 이모티콘 할인율 모음
            // arr[i] -> 이모티콘별 할인율
            for (int i = 0; i < emoticons.length; i++) {
                // 이모티콘 할인율로 사용자별 최소 할인율과 비교 계산
                for (int j = 0; j < users.length; j++) {
                    if (users[j][0] < arr[i]) continue;
                    // 만약 크다면, 사용자별 이모티콘 구매 비용 추가
                    userMoney[j] += emoticons[i] * (100 - arr[i]) / 100;
                    // 만약 사용자별 이모티콘 구매 비용이 사용자별 플러스 멤버십 가입 가격보다 크면, 구매 비용 초기화 + 이모티콘 플러스 서비스 가입
                    if (userMoney[j] > users[j][1]) {
                        userMoney[j] = 0;
                        emoticonPlus++;
                    }
                }
            }
            return;
        }
        for (int discount : discounts) {
            arr[level] = discount;
            dfs(level + 1, discounts, users, emoticons, arr);
        }
    }
}
