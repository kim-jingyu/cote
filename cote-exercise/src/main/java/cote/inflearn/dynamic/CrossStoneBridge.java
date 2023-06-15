package cote.inflearn.dynamic;

import java.util.Scanner;

public class CrossStoneBridge {
    private static int[] dy;

    public static int solution(int stNumber){
        dy[1] = 1;
        dy[2] = 2;
        for(int i=3;i<=stNumber+1;i++){
            dy[i] = dy[i-2] + dy[i-1];
        }
        return dy[stNumber+1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stones = sc.nextInt();
        dy = new int[stones+2];
        System.out.println(solution(stones));
    }
}
