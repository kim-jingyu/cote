package cote.baekjoon.backtracking;

import java.util.Scanner;

public class NO1182 {
    private static int n,s,answer=0,tmp;
    private static int[] arr,ch;

    public static void solution(int Level,int sum){
        if(Level==n){
            tmp = 0;
            for(int i:ch){
                if(i==1) tmp++;
            }
            if(sum==s && tmp>0){
                answer++;
            }
        }
        else{
            ch[Level] = 1;
            solution(Level+1,sum + arr[Level]);
            ch[Level] = 0;
            solution(Level+1,sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.nextInt();
        arr = new int[n];
        ch = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        solution(0,0);

        System.out.println(answer);
    }
}

//5 0
//        -7 -3 -2 5 8
//
//1