package cote.baekjoon.backtracking;

import java.util.Scanner;

public class NO14225 {
    private static int n;
    private static int[] arr;
    private static boolean[] isUsed;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        isUsed = new boolean[100000 * 20 + 1];

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        calculate(0, 0);

        int cur = 0;
        while (isUsed[cur]) {
            cur++;
        }
        System.out.println(cur);
    }

    private static void calculate(int level, int sum) {
        if (level == n) {
            isUsed[sum] = true;
            return;
        }

        calculate(level + 1, sum + arr[level]);
        calculate(level + 1, sum);
    }
}
