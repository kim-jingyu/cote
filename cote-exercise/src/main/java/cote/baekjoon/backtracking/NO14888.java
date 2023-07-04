package cote.baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NO14888 {
    private static int[] numbers, operators;
    private static int n;
    private static List<Integer> results = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        numbers = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        operators = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        calculate(1, numbers[0]);

        Collections.sort(results);

        System.out.println(results.get(results.size() - 1));
        System.out.println(results.get(0));
    }

    private static void calculate(int level, int number) {
        if (level == n) {
            results.add(number);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operators[i] > 0) {
                operators[i]--;
                switch (i) {
                    case 0 -> calculate(level + 1, number + numbers[level]);
                    case 1 -> calculate(level + 1, number - numbers[level]);
                    case 2 -> calculate(level + 1, number * numbers[level]);
                    case 3 -> calculate(level + 1, number / numbers[level]);
                }
                operators[i]++;
            }
        }
    }
}