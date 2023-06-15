package cote.baekjoon.backtracking;

import java.util.Scanner;

public class NO15649 {
    private static int n,m;
    private static int[] arr,ch;

    public static void solution(int Level){
        if(Level==m){
            for(int i:arr){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        else{
            for(int i=1;i<=n;i++){
                if(ch[i]==0){
                    arr[Level] = i;
                    ch[i] = 1;
                    solution(Level+1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];
        ch = new int[n+1];

        solution(0);
    }
}

//4 2
//
//        1 2
//        1 3
//        1 4
//        2 1
//        2 3
//        2 4
//        3 1
//        3 2
//        3 4
//        4 1
//        4 2
//        4 3