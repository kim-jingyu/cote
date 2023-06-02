package cote.programmers;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DeliveryBox {
    public int solution(int[] order) {
        int answer = 0;

        boolean[] visited = new boolean[order.length + 1];

        Queue<Integer> queue = new LinkedList<>();
        for (int o : order) {
            queue.add(o);
        }

        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            Integer curOrder = queue.poll();

            if (visited[curOrder - 1]) {
                answer++;
                visited[curOrder] = true;
                continue;
            }

            if (stack.isEmpty()) {
                for (int i = 1; i < curOrder; i++) {
                    if (visited[i]) continue;
                    stack.push(i);
                }
                answer++;
            } else {
                if (stack.pop() == curOrder) answer++;
                else break;
            }

            visited[curOrder] = true;
        }

        return answer;
    }
}
