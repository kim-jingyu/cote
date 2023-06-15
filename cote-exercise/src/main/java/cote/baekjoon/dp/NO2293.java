package cote.baekjoon.dp;

import java.util.Scanner;

public class NO2293 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();

        int[] coin = new int[n];
        for(int i=0;i<n;i++){
            coin[i] = sc.nextInt();
        }

        int[] dp = new int[target+1];
        dp[0] = 1;
        for(int k=0;k<n;k++){
            for(int i=coin[k];i<=target;i++){
                dp[i] = dp[i] + dp[i-coin[k]];
            }
        }

        System.out.println(dp[target]);
    }
}

//3 10
//        1
//        2
//        5

//10