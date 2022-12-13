package cote.baekjoon.greedy;

import java.util.Scanner;

public class NO11047 {
    private static int n;
    private static int[] arr;

    public static int solution(int target){
        int sum = 0;
        int cnt = 0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>target) continue;
            while(true){
                sum += arr[i];
                cnt++;
                if(sum>target){
                    sum -= arr[i];
                    cnt--;
                    break;
                }
                if(sum==target){
                    return cnt;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int target = sc.nextInt();

        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(target));
    }
}

//10 4200
//        1
//        5
//        10
//        50
//        100
//        500
//        1000
//        5000
//        10000
//        50000