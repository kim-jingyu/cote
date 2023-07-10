package cote.baekjoon.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class NO10828 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = br.read();

        for (int i = 0; i < n; i++) {
            String[] values = br.readLine().split(" ");
            if (values.length == 2) {
                stack.push(Integer.valueOf(values[1]));
                continue;
            }

            switch (values[0]) {
                case "pop": {
                    if (stack.isEmpty()) System.out.println(-1);
                    else System.out.println(stack.pop());
                    break;
                }
                case "size": {
                    System.out.println(stack.size());
                    break;
                }
                case "empty": {
                    if (stack.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                }
                case "top": {
                    if (stack.isEmpty()) System.out.println(-1);
                    else System.out.println(stack.peek());
                    break;
                }
            }
        }

        br.close();
    }
}
