package book.ch3.trianglesnail;

public class TriangleSnailV1 {
    private static final int[] dx = {0, 1, -1};
    private static final int[] dy = {1, 0, -1};
    public int[] solution(int n) {
        int[][] triangle = new int[n][n];
        int curX = 0;
        int curY = 0;
        int d = 0;  // 방향 변수. 0일때는 아래로 이동
        int snail = 1;

        while (true) {
            triangle[curY][curX] = snail++;
            // 한 방향으로 계속 이동
            int nx = curX + dx[d];
            int ny = curY + dy[d];

            // 끝에 도달하거나 다음 배열에 값이 차있을 경우
            if (nx == n || nx == -1 || ny == n || ny == -1 || triangle[ny][nx] != 0) {
                // 방향 전환
                d = (d + 1) % 3;
                nx = curX + dx[d];
                ny = curY + dy[d];

                // 방향 전환 후에도 다음 배열 값이 차있으면, 전체 루프 종료
                if (nx == n || nx == -1 || ny == n || ny == -1 || triangle[ny][nx] != 0) break;
            }

            curY = ny;
            curX = nx;
        }

        int cnt = 0;
        int[] result = new int[snail - 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                result[cnt++] = triangle[i][j];
            }
        }

        return result;
    }
}
