package book.ch3.trianglesnail;

class TriangleSnailV2 {
    private static final int[] dx = {0, 1, -1};
    private static final int[] dy = {1, 0, -1};

    public int[] solution(int n) {
        int[][] map = new int[n][n];
        int x = 0;
        int y = 0;
        int v = 1;
        int d = 0;

        while (true) {
            map[y][x] = v++;
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (nx == n || nx == -1 || ny == n || ny == -1 | map[ny][nx] != 0) {
                d = (d + 1) % 3;

                nx = x + dx[d];
                ny = y + dy[d];

                if (nx == n || nx == -1 || ny == n || ny == -1 | map[ny][nx] != 0) break;
            }
            y = ny;
            x = nx;
        }

        int[] answer = new int[v-1];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                answer[cnt++] = map[i][j];
            }
        }

        return answer;
    }
}
