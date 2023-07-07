package book.ch12.network;

public class NetworkV0 implements Network{
    private boolean[] isVisited;
    @Override
    public int solution(int n, int[][] computers) {
        isVisited = new boolean[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (isVisited[i]) continue;
            calculate(i, computers);
            cnt++;
        }

        return cnt;
    }

    private void calculate(int current, int[][] computers) {
        isVisited[current] = true;

        for (int next = 0; next < computers[current].length; next++) {
            if (isVisited[next] || computers[current][next] == 0) continue;
            calculate(next, computers);
        }
    }
}
