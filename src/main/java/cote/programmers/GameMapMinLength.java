package cote.programmers;

import java.util.LinkedList;
import java.util.Queue;

class GameMapMinLength {
    static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int solution(int[][] maps) {
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int[][] distance = new int[maps.length][maps[0].length];
        boolean[][] visited = new boolean[maps.length][maps[0].length];

        return bfs(maps, dx, dy, distance, visited);
    }

    private int bfs(int[][] maps, int[] dx, int[] dy, int[][] distance, boolean[][] visited) {
        int result = -1;
        Point departure = new Point(0, 0);    // 현재 위치
        Queue<Point> queue = new LinkedList<>();
        queue.add(departure);
        distance[0][0] = 1;
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            Point cur = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = cur.x + dx[i];
                int nextY = cur.y + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= maps[0].length || nextY >= maps.length || visited[nextY][nextX]) continue;

                if (maps[nextY][nextX] == 1) {
                    maps[cur.y][cur.x] = 0;
                    visited[nextY][nextX] = true;
                    distance[nextY][nextX] = distance[cur.y][cur.x] + 1;
                    queue.add(new Point(nextX, nextY));
                }
            }
        }

        if (distance[maps.length - 1][maps[0].length - 1] != 0) {
            result = distance[maps.length - 1][maps[0].length - 1];
        }

        return result;
    }
}