package cote.baekjoon.greedy;

import java.util.Scanner;

public class NO1789 {

    public static int solution(long n){
        long sum = 0;
        int cnt = 0;
        for(int i=1;;i++){
            sum += i;

            if(sum > n) break;

            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(solution(n));
    }
}

//200
//
//19