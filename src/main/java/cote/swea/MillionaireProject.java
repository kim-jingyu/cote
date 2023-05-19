package cote.swea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MillionaireProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();  // 테스트 케이스 수

        for (int i = 1; i <= T; i++) {
            int N = scanner.nextInt();  // 연속되는 날짜 수
            List<Integer> tradingOfDay = getTradingOfDay(scanner, N);

            Collections.reverse(tradingOfDay);

            long answer = getAnswer(tradingOfDay);

            System.out.println("#" + i + " " + answer);
        }
    }

    private static List<Integer> getTradingOfDay(Scanner scanner, int N) {
        List<Integer> tradingOfDay = new ArrayList<>();

        for (int j = 0; j < N; j++) {
            int trade = scanner.nextInt();
            tradingOfDay.add(trade);
        }
        return tradingOfDay;
    }

    private static long getAnswer(List<Integer> tradingOfDay) {
        long answer = 0;
        long curMax = tradingOfDay.get(0);

        for (Integer trade : tradingOfDay) {
            if (curMax >= trade) {
                answer += (curMax - trade);
            } else {
                curMax = trade;
            }
        }
        return answer;
    }
}
