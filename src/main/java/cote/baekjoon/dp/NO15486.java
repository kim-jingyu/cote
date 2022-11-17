package cote.baekjoon.dp;

import java.util.Scanner;

public class NO15486 {
    private static int n,max=Integer.MIN_VALUE;
    private static int[] dy;
    private static int[][] arr;

    public static void solution(){
        for(int i=0;i<=n;i++){
            max = Math.max(max,dy[i]);
            int nextDay = arr[i][0] + i;
            if(nextDay <= n) {
                dy[nextDay] = Math.max(dy[nextDay],arr[i][1]+max);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dy = new int[n+1];

        arr = new int[n+1][2];
        for(int i=0;i<n;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        solution();

        System.out.println(max);
    }
}

//7
//        3 10
//        5 20
//        1 10
//        1 20
//        2 15
//        4 40
//        2 200

//45