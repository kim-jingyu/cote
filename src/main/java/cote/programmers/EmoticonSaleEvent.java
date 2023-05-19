package cote.programmers;

/**
 * 2023 KAKAO BLIND RECRUITMENT
 */
public class EmoticonSaleEvent {
    private int finalEmoticonPlus = 0;   // 최종 이모티콘 플러스 가입자
    private int finalCost = 0;   // 최종 금액
    public int[] solution(int[][] users, int[] emoticons) {
        int[] answer = new int[2];      // 이모티콘 플러스 가입자, 금액
        int[] oriDiscounts = {10, 20, 30, 40};

        dfs(0, oriDiscounts, users, emoticons, new int[emoticons.length]);

        answer[0] = finalEmoticonPlus;
        answer[1] = finalCost;
        return answer;
    }

    /**
     * @param arrangedDiscounts -> arrangedDiscounts - 할인율 저장 배열
     */
    private void dfs(int level, int[] oriDiscounts, int[][] users, int[] emoticons, int[] arrangedDiscounts) {
        if (level == emoticons.length) {
            int emoticonPlus = 0;   // 이모티콘 플러스 가입자 수
            int cost = 0;   // 금액

            // 1. 유저별로
            for (int[] user : users) {
                int userMinRate = user[0];  // 유저의 최소 허용 할인비율
                int userMinCost = user[1];  // 유저의 최소 허용 가격
                int sum = 0;    // 합계금액

                // 2. 이몬티콘들 별로
                for (int i = 0; i < emoticons.length; i++) {
                    if (arrangedDiscounts[i] < userMinRate) continue;

                    // 3. 만약, 유저의 최소 허용 할인비율이 이모티콘의 할인비율보다 작거나 같으면, 합계금액 sum 구해서
                    sum += (emoticons[i] * (100 - arrangedDiscounts[i]) / 100); // 합계금액 = 이모티콘 가격 * 할인비율
                }

                // 4. 만약 sum 이 유저의 최소 허용 가격 (userMinCost) 조건보다 크거나 같으면, 이모티콘 플러스 가입자 수 증가
                if (sum >= userMinCost) {
                    emoticonPlus++;
                }
                // 5. 만약 sum 이 유저의 최소가격 조건보다 작으면, sum 을 최종 금액 (cost) 에 증액시킴
                else {
                    cost += sum;
                }
            }

            // 6. 만약 이번 유저의 이모티콘 플러스 가입자 수가 기존 이모티콘 플러스 가입자 수보다 크면,
            if (emoticonPlus > finalEmoticonPlus) {
                // 7. 이모티콘 플러스 가입자 수를 갱신하고,
                finalEmoticonPlus = emoticonPlus;
                // 8. 최종 금액을 갱신한다.
                finalCost = cost;
            }
            // 5. 만약 sum 이 유저의 최소가격 조건보다 작으면, sum 을 최종 금액 (cost) 에 증액시킴
            else if (emoticonPlus == finalEmoticonPlus) {
                // 10. 최종 금액을 기존 최종 금액과 비교하여 더 큰 걸로 대입한다.
                finalCost = Math.max(finalCost, cost);
            }
            return;
        }
        for (int discount : oriDiscounts) {
            arrangedDiscounts[level] = discount;
            dfs(level + 1, oriDiscounts, users, emoticons, arrangedDiscounts);
        }
    }
}
