package cote.inflearn.dynamic;

import java.util.Scanner;

public class StairClimb {
    private static int[] dy;

    public static int solution(int stairNum){
        dy[1]=1;
        dy[2]=2;
        for(int i=3;i<=stairNum;i++){
            dy[i] = dy[i-1]+dy[i-2];
        }
        return dy[stairNum];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stairs = sc.nextInt();
        dy = new int[stairs+1];
        System.out.println(solution(stairs));
    }
}

//7 21
