package cote.baekjoon.backtracking;

import java.util.Scanner;

public class NO15650 {
    private static int n,m;
    private static int[] arr;

    public static void solution(int Level,int start){
        if(Level==m){
            for (int i:arr) System.out.print(i+" ");
            System.out.println();
        }
        else{
            for(int i=start;i<=n;i++){
                arr[Level] = i;
                solution(Level+1,i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];

        solution(0,1);
    }
}
