package cote.baekjoon.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class NO6603 {
    private static int[] arr;
    private static boolean[] isVisited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int k = sc.nextInt();
            if (k == 0) break;

            arr = new int[k];
            isVisited = new boolean[k];

            for (int i = 0; i < k; i++) {
                arr[i] = sc.nextInt();
            }

            calculate(0, k, 0);

            System.out.println();
        }
    }

    private static void calculate(int level, int k, int current) {
        if (level == 6) {
            for (int i = 0; i < k; i++) {
                if (isVisited[i]) System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = current; i < k; i++) {
            if (isVisited[i]) continue;

            isVisited[i] = true;
            calculate(level + 1, k, i+1);
            isVisited[i] = false;
        }
    }
}

//7 1 2 3 4 5 6 7
//        8 1 2 3 5 8 13 21 34
//        0
