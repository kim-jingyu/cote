package cote.inflearn.dynamic;

import java.util.Scanner;

public class TheHighestScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int timeLimit = sc.nextInt();
        int[] dy = new int[timeLimit+1];
        for(int i=0;i<n;i++){
            int ps = sc.nextInt();
            int pt = sc.nextInt();
            for(int j=timeLimit;j>=pt;j--){
                dy[j] = Math.max(dy[j],dy[j-pt]+ps);
            }
        }

        System.out.println(dy[timeLimit]);
    }
}

//5 20
//        10 5
//        25 12
//        15 8
//        6 3
//        7 4

//41