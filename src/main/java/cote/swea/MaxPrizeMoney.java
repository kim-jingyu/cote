package cote.swea;

import java.util.*;

public class MaxPrizeMoney {
    private static int answer;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();

        for (int i = 1; i <= testcases; i++) {
            int number = scanner.nextInt();
            int exchange = scanner.nextInt();
            answer = 0;

            dfs(0, String.valueOf(number).split(""), exchange, new boolean[exchange + 1][1000000]);

            System.out.println("#" + i + " " + answer);
        }

    }

    private static void dfs(int level, String[] numbers, int exchange, boolean[][] isVisited) {
        if (level == exchange) {
            String flattenedNumber = getFlattenedNumber(numbers);
            answer = getMaxAnswer(flattenedNumber);
            return;
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                exchange(numbers, i, j);

                String flattenedNumber = getFlattenedNumber(numbers);

                if(!isVisited[level][Integer.valueOf(flattenedNumber)]) {
                    isVisited[level][Integer.valueOf(flattenedNumber)] = true;
                    dfs(level+1, numbers, exchange, isVisited);
                }

                exchange(numbers, i, j);
            }
        }
    }

    private static String getFlattenedNumber(String[] numbers) {
        String flattenedNumber = "";
        for (String number : numbers) {
            flattenedNumber += number;
        }
        return flattenedNumber;
    }

    private static void exchange(String[] numbers, int i, int j) {
        String tmp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = tmp;
    }

    private static int getMaxAnswer(String flattenedNumber) {
        return Math.max(answer, Integer.valueOf(flattenedNumber.toString()));
    }
}
