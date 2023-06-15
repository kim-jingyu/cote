package cote.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class RicochetRobots {
    private int[] dx = {0, 1, 0, -1};
    private int[] dy = {1, 0, -1, 0};

    static class Position {
        int x;
        int y;
        int level;

        public Position(int x, int y, int level) {
            this.x = x;
            this.y = y;
            this.level = level;
        }
    }

    public int solution(String[] board) {
        int answer = -1;

        int yLength = board.length;       // 세로 길이
        int xLength = board[0].length();  // 가로 길이

        String[][] boards = new String[yLength][xLength];
        boolean[][] isVisited = new boolean[yLength][xLength];

        int[] startLocation = new int[2];
        int[] endLocation = new int[2];

        getLocation(board, yLength, xLength, boards, startLocation, endLocation);

        isVisited[startLocation[0]][startLocation[1]] = true;

        answer = getAnswer(answer, yLength, xLength, boards, isVisited, startLocation, endLocation);

        return answer;
    }

    private static void getLocation(String[] board, int yLength, int xLength, String[][] boards, int[] startLocation, int[] endLocation) {
        for (int i = 0; i < yLength; i++) {
            for (int j = 0; j < xLength; j++) {
                String str = String.valueOf(board[i].charAt(j));
                boards[i][j] = str;
                if (str.equals("R")) {
                    startLocation[0] = i;   // y
                    startLocation[1] = j;   // x
                }
                if (str.equals("G")) {
                    endLocation[0] = i;
                    endLocation[1] = j;
                }
            }
        }
    }

    private int getAnswer(int answer, int yLength, int xLength, String[][] boards, boolean[][] isVisited, int[] startLocation, int[] endLocation) {
        Queue<Position> queue = new LinkedList<>();
        queue.add(new Position(startLocation[1], startLocation[0],0));

        while (!queue.isEmpty()) {
            Position curPos = queue.poll();
            int curX = curPos.x;
            int curY = curPos.y;

            if (curY == endLocation[0] && curX == endLocation[1]) {
                answer = curPos.level;
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nextX = curX;
                int nextY = curY;

                while (true) {
                    nextX += dx[i];
                    nextY += dy[i];
                    if (nextX < 0 || nextX >= xLength || nextY < 0 || nextY >= yLength || boards[nextY][nextX].equals("D")) {
                        nextX -= dx[i];
                        nextY -= dy[i];
                        break;
                    }
                }

                if (isVisited[nextY][nextX]) continue;

                isVisited[nextY][nextX] = true;
                queue.add(new Position(nextX, nextY, curPos.level + 1));
            }
        }
        return answer;
    }
}
