package cote.baekjoon.backtracking;

import java.util.Scanner;

public class NO14889 {
    private static int n,start,link,answer=Integer.MAX_VALUE;
    private static boolean[] ch;
    private static int[][] arr;

    public static void solution(int Level,int st){
        if(Level == n/2){
            start = 0;
            link = 0;
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    if(ch[i] && ch[j]){
                        start += arr[i][j];
                        start += arr[j][i];
                    } else if (!ch[i] && !ch[j]) {
                        link += arr[i][j];
                        link += arr[j][i];
                    }
                }
            }
            answer = Math.min(answer,Math.abs(start-link));
        }
        else{
            for(int i=st;i<n;i++){
                if(!ch[i]){
                    ch[i] = true;
                    solution(Level+1,i+1);
                    ch[i] = false;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ch = new boolean[n];

        arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        solution(0,0);

        System.out.println(answer);
    }
}

//8
//        0 5 4 5 4 5 4 5
//        4 0 5 1 2 3 4 5
//        9 8 0 1 2 3 1 2
//        9 9 9 0 9 9 9 9
//        1 1 1 1 0 1 1 1
//        8 7 6 5 4 0 3 2
//        9 1 9 1 9 1 0 9
//        6 5 4 3 2 1 9 0

//1