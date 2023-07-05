package cote.baekjoon.backtracking;

import java.util.Scanner;

class NO14889 {
    private static int n;
    private static int[][] map;
    private static boolean[] isVisited;
    private static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        isVisited = new boolean[n];

        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        calculate(0, 0);

        System.out.println(answer);
    }

    private static void calculate(int level, int current) {
        if (level == n / 2) {
            getAnswer();
            return;
        }

        for (int i = current; i < n; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                calculate(level + 1, i + 1);
                isVisited[i] = false;
            }
        }
    }

    private static void getAnswer() {
        int stark = 0;
        int link = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                if (isVisited[i] && isVisited[j]) {
                    stark += map[i][j];
                    stark += map[j][i];
                } else if (!isVisited[i] && !isVisited[j]) {
                    link += map[i][j];
                    link += map[j][i];
                }
            }
        }
        answer = Math.min(answer, Math.abs(stark - link));
    }
}