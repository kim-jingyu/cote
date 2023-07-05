package cote.baekjoon.backtracking;

import java.util.Scanner;

public class NO14888 {
    private static int n, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    private static int[] arr, operators;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        operators = new int[4];
        for (int i = 0; i < 4; i++) {
            operators[i] = sc.nextInt();
        }

        calculate(1, arr[0]);

        System.out.println(max);
        System.out.println(min);
    }

    private static void calculate(int level, int sum) {
        if (level == n) {
            max = Math.max(max, sum);
            min = Math.min(min, sum);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operators[i] == 0) continue;

            operators[i]--;
            switch (i) {
                case 0:
                    calculate(level + 1, sum + arr[level]);
                    break;
                case 1:
                    calculate(level + 1, sum - arr[level]);
                    break;
                case 2:
                    calculate(level + 1, sum * arr[level]);
                    break;
                case 3:
                    calculate(level + 1, sum / arr[level]);
                    break;
            }
            operators[i]++;
        }
    }
}