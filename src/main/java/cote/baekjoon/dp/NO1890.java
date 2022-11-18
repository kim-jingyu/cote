package cote.baekjoon.dp;

import java.util.Scanner;

public class NO1890 {
    private static int n;
    private static int[][] map;

    public static void solution(){

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


    }
}

//4
//        2 3 3 1
//        1 2 1 3
//        1 2 3 1
//        3 1 1 0