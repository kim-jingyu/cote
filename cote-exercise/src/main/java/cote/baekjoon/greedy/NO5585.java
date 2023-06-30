package cote.baekjoon.greedy;

import java.util.Scanner;

public class NO5585 {
    private static final int[] changes = {500, 100, 50, 10, 5, 1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int rest = 1000 - money;
        int answer = 0;

        for (int change : changes) {
            while (true) {
                if (rest - change < 0) {
                    break;
                }
                answer++;
                rest -= change;
            }
        }

        System.out.print(answer);
    }
}
