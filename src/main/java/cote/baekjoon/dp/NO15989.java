package cote.baekjoon.dp;

import java.util.Scanner;

public class NO15989 {
    private static int[][] dp;

    public static int solution(int target){
        for(int i=4;i<=target;i++){
            dp[i][1] = dp[i-1][1];
            dp[i][2] = dp[i-2][1] + dp[i-2][2];
            dp[i][3] = dp[i-3][1] + dp[i-3][2] + dp[i-3][3];
        }
        return dp[target][1] + dp[target][2] + dp[target][3];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dp = new int[10001][4];

        dp[1][1] = 1;
        dp[2][1] = 1;
        dp[2][2] = 1;
        dp[3][1] = 1;
        dp[3][2] = 1;
        dp[3][3] = 1;

        int n =sc.nextInt();

        for(int i=0;i<n;i++){
            int target = sc.nextInt();
            System.out.println(solution(target));
        }
    }
}

//3
//        4
//        7
//        10
//
//        4
//        8
//        14