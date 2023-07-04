package cote.baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NO1339 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[26];
        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            for (int j = 0; j < temp.length(); j++) {
                char c = temp.charAt(j);
                arr[c - 'A'] += (int) Math.pow(10, temp.length() - 1 - j);
            }
        }

        Arrays.sort(arr);

        int num = 9;
        int answer = 0;
        for (int i = 25; i >= 0; i--) {
            answer += arr[i] * num;
            num--;
        }

        System.out.println(answer);
    }
}
