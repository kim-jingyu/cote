package cote.baekjoon.silver;

import java.util.*;

public class NO18232 {
    static class Position{
        int now;
        int level;

        public Position(int now, int level) {
            this.now = now;
            this.level = level;
        }
    }
    public static void main(String[] args) {
        int answer = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int start = sc.nextInt();
        int end = sc.nextInt();

        List<int[]> connections = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int[] connected = new int[2];
            int port1 = sc.nextInt();
            int port2 = sc.nextInt();

            connected[0] = port1;
            connected[1] = port2;
        }

        boolean[] visited = new boolean[n];

        Queue<Position> queue = new LinkedList<>();
        queue.add(new Position(start, 0));
        while (!queue.isEmpty()) {
            Position position = queue.poll();
            int now = position.now;

            if (visited[now]) continue;

            visited[now] = true;
            int level = position.level;

            if (now == end) {
                answer = Math.min(answer, now);
            }

            for (int i = 0; i < m; i++) {
                int[] connection = connections.get(i);

                if (connection[0] == now && !visited[connection[1]]) {
                    queue.add(new Position(connection[1], level + 1));
                }

                if (connection[1] == now && !visited[connection[0]]) {
                    queue.add(new Position(connection[0], level+1));
                }
            }
        }
    }
}

//5 1
//        1 5
//        1 4
//
//        10 3
//        2 5
//        1 6
//        1 3
//        2 8