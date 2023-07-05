package cote.baekjoon.backtracking;

import java.util.Scanner;

public class NO1182 {
    private static int n, s, answer = 0;
    private static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.nextInt();

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        calculate(0, 0);

        if (s == 0) {
            System.out.println(answer - 1);
        } else {
            System.out.println(answer);
        }
    }

    private static void calculate(int level, int sum) {
        if (level == n) {
            if (sum == s) {
                answer++;
            }
            return;
        }

        calculate(level + 1, sum + arr[level]);
        calculate(level + 1, sum);
    }
}

//5 0
//        -7 -3 -2 5 8
//
//1