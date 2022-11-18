package cote.baekjoon.dp;

import java.util.Scanner;

public class NO1890 {
    private static int n;
    private static int[][] map;
    private static long[][] dp;

    public static void solution(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int next = map[i][j];
                if(next==0) break;
                if(i+next<n) dp[i+next][j] += dp[i][j];
                if(j+next<n) dp[i][j+next] += dp[i][j];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        map = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                map[i][j] = sc.nextInt();
            }
        }
        dp = new long[n][n];
        dp[0][0] = 1;
        solution();

        System.out.println(dp[n-1][n-1]);
    }
}

//4
//        2 3 3 1
//        1 2 1 3
//        1 2 3 1
//        3 1 1 0