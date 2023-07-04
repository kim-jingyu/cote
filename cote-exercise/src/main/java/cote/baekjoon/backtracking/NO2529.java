package cote.baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NO2529 {
    private static String[] arr;
    private static boolean[] isVisited;
    private static int n;
    private static List<String> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = br.readLine().split(" ");
        isVisited = new boolean[10];

        calculate(0, "");

        Collections.sort(list);

        System.out.println(list.get(list.size() - 1));
        System.out.println(list.get(0));
    }

    private static void calculate(int level, String number) {
        if (level == n + 1) {
            list.add(number);
            return;
        }

        for (int i = 0; i < 10; i++) {
            if (isVisited[i]) continue;

            if (level == 0 || check(Character.getNumericValue(number.charAt(level - 1)), i, arr[level - 1])) {
                isVisited[i] = true;
                calculate(level+1, number+i);
                isVisited[i] = false;
            }
        }
    }

    private static boolean check(int before, int after, String sign) {
        if (sign.equals(">")) {
            return before > after;
        } else {
            return before < after;
        }
    }
}
