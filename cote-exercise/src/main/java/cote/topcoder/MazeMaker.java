package cote.topcoder;

import java.util.LinkedList;
import java.util.Queue;

public class MazeMaker {
    public int longestPath(String[] maze, int startRow, int startCol, int[] moveRow, int[] moveCol) {
        int[][] board = new int[maze.length][maze[0].length()];
        boolean[][] isVisited = new boolean[maze.length][maze[0].length()];
        int height = maze.length, width = maze[0].length();

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length(); j++) {
                board[i][j] = -1;
            }
        }
        board[startRow][startCol] = 0;

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(startCol, startRow));
        isVisited[startRow][startCol] = true;

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            int x = point.x;
            int y = point.y;

            for (int i = 0; i < moveRow.length; i++) {
                int nextX = x + moveCol[i];
                int nextY = y + moveRow[i];

                if (nextX >= 0 && nextX < width && nextY >= 0 && nextY < height && !isVisited[nextY][nextX] && maze[nextY].charAt(nextX) == '.' && board[nextY][nextX] == -1) {
                    board[nextY][nextX] = board[y][x] + 1;
                    isVisited[nextY][nextX] = true;
                    queue.add(new Point(nextX, nextY));
                }
            }
        }

        int answer = 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (board[i][j] == -1 && maze[i].charAt(j) == '.') {
                    return -1;
                }
                answer = Math.max(answer, board[i][j]);
            }

        }

        return answer;
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

}
