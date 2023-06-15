package cote.baekjoon.backtracking;

import java.util.Scanner;

public class NO14888 {
    private static final int OPERATOR_LENGTH = 4;
    private static int n,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
    private static int[] arr,operator;

    public static void solution(int Level,int sum){
        if(Level==n-1){
            max = Math.max(max,sum);
            min = Math.min(min,sum);
        }
        else{
            for(int i=0;i<OPERATOR_LENGTH;i++){
                if(operator[i]>0){
                    operator[i]--;

                    switch(i){
                        case(0):
                            solution(Level+1,sum + arr[Level+1]);
                            break;
                        case(1):
                            solution(Level+1,sum - arr[Level+1]);
                            break;
                        case(2):
                            solution(Level+1,sum * arr[Level+1]);
                            break;
                        case(3):
                            solution(Level+1,sum / arr[Level+1]);
                            break;
                    }

                    operator[i]++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        operator = new int[OPERATOR_LENGTH];
        for(int i=0;i<OPERATOR_LENGTH;i++){
            operator[i] = sc.nextInt();
        }

        solution(0,arr[0]);

        System.out.println(max);
        System.out.println(min);
    }
}

//6
//        1 2 3 4 5 6
//        2 1 1 1
//
//        54
//        -24