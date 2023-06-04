package cote.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 영상처리
class NO21938 {
    /**
     * N: 세로
     * M: 가로
     * R,G,B
     * T: 경계값
     */
    private static int N;
    private static int M;
    private static int[][] map;
    private static boolean[][] visited;
    private static int[] dy = {1, 0, -1, 0};
    private static int[] dx = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        int answer = 0;
        input();

        visited = new boolean[N][M];

        System.out.println(getAnswer(answer));
    }

    private static int getAnswer(int answer) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 255) {
                    getAnswer(i, j);
                    answer++;
                }
            }
        }
        return answer;
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < 3; k++) {
                    int num = Integer.parseInt(st.nextToken());
                    map[i][j] += num;
                }
                map[i][j] /= 3;
            }
        }

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] >= T) {
                    map[i][j] = 255;
                } else {
                    map[i][j] = 0;
                }
            }
        }
    }

    private static void getAnswer(int y, int x) {
        for (int i = 0; i < 4; i++) {
            int nextY = y + dy[i];
            int nextX = x + dx[i];

            if (nextY < 0 || nextY >= N || nextX < 0 || nextX >= M || visited[nextY][nextX] || map[nextY][nextX]==0) continue;

            map[nextY][nextX] = 0;
            visited[nextY][nextX] = true;
            getAnswer(nextY,nextX);
        }
    }
}
