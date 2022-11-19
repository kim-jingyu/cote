package cote.baekjoon.dp;

import java.util.Scanner;

public class NO1496 {
    private static int n,s,m,max=Integer.MIN_VALUE,cntF=0;
    private static int[] v;
    private static int[][] dp;

    public static int solution(){
        for(int i=1;i<=n;i++){
            int cnt=0;
            for(int j=0;j<=m;j++){
                if(dp[i-1][j]==1){
                    //최솟값
                    if(j-v[i]>=0) dp[i][j-v[i]] = 1;
                    //최댓값
                    if(j+v[i]<=m) {
                        dp[i][j+v[i]] = 1;
                    }
                    cnt++;
                }
            }
            if(cnt==0) return -1;
        }
        for(int j=0;j<=m;j++){
            if(dp[n][j]==1){
                max = Math.max(max,j);
                cntF++;
            }
        }
        if(cntF==0) return -1;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        s = sc.nextInt();
        m = sc.nextInt();
        v = new int[n+1];

        for(int i=1;i<=n;i++){
            v[i] = sc.nextInt();
        }

        dp = new int[n+1][m+1];
        dp[0][s] = 1;

        System.out.println(solution());
    }
}

//3 5 10
//        5 3 7
//
//10
//
//
//        4 8 20
//        15 2 9 10
//
//        -1