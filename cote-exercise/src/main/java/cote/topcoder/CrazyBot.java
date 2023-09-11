package cote.topcoder;

public class CrazyBot {
    private int[] dx = {1, -1, 0, 0};
    private int[] dy = {0, 0, 1, -1};
    private boolean[][] isVisited = new boolean[100][100];
    private double[] probabilities = new double[4];

    public double getProbability(int n, int east, int west, int south, int north) {
        probabilities[0] = east / 100.0;
        probabilities[1] = west * 0.01;
        probabilities[2] = (double) south / 100;
        probabilities[3] = north * 0.01;

        return dfs(50, 50, n);
    }

    private double dfs(int x, int y, int n) {
        if (isVisited[x][y]) return 0;
        if (n == 0) return 1;

        double answer = 0;
        for (int i = 0; i < 4; i++) {
            isVisited[x][y] = true;
            answer += dfs(x + dx[i], y + dy[i], n - 1) * probabilities[i];
            isVisited[x][y] = false;
        }

        return answer;
    }
}
