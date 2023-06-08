package book.ch2.trianglesnail;

public class TriangleSnailV0 {
    public int[] solution(int n) {
        int[][] triangle = new int[n][n];
        int x = 0;
        int y = 0;
        int snail = 1;

        while (true) {
            // 아래로 이동하면서 채우기
            while (true) {
                triangle[y][x] = snail++;
                if (y+1 == n || triangle[y+1][x] != 0) break;
                y++;
            }
            // 오른쪽으로 한칸 이동
            if (x + 1 == n || triangle[y][x + 1] != 0) break;
            x++;

            // 오른쪽으로 이동하면서 채우기
            while (true) {
                triangle[y][x] = snail++;
                if (x+1 == n || triangle[y][x+1] != 0) break;
                x++;
            }
            // 위쪽으로 한칸 이동
            if (triangle[y-1][x-1] != 0) break;
            y -= 1;
            x -= 1;

            // 위쪽으로 이동하면서 채우기
            while (true) {
                triangle[y][x] = snail++;
                if (triangle[y-1][x-1] != 0) break;
                y -= 1;
                x -= 1;
            }
            // 아래쪽으로 한칸 이동
            if (y+1 == n || triangle[y+1][x] != 0) break;
            y++;
        }

        int cnt = 0;
        int[] result = new int[snail - 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                result[cnt] = triangle[i][j];
                cnt++;
            }
        }

        return result;
    }
}
