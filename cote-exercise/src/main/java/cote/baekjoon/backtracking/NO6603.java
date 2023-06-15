package cote.baekjoon.backtracking;

import java.util.Scanner;

public class NO6603 {
    private static final int LOTTO_SIZE = 6;
    private static String[] input;
    private static int n;
    private static int[] arr,tmp;

    public static void solution(int Level,int start){
        if(Level==LOTTO_SIZE){
            for(int i:tmp) System.out.print(i+" ");
            System.out.println();
        }
        else{
            for(int i=start;i<n;i++){
                tmp[Level] = arr[i];
                solution(Level+1,i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            input = sc.nextLine().split(" ");
            n = Integer.valueOf(input[0]);
            if(n == 0) break;

            arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = Integer.valueOf(input[i+1]);
            }
            tmp = new int[LOTTO_SIZE];

            solution(0,0);
            System.out.println();
        }
    }
}

//7 1 2 3 4 5 6 7
//        8 1 2 3 5 8 13 21 34
//        0
