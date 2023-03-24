package cote.programmers;

class Network {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, visited, computers);
                answer++;
            }
        }

        return answer;
    }

    private void dfs(int cur, boolean[] visited, int[][] computers) {
        visited[cur] = true;
        for (int i = 0; i < visited.length; i++) {
            if (i == cur) {
                continue;
            }
            if (computers[cur][i] == 1 && !visited[i]) {
                dfs(i, visited, computers);
            }
        }
    }
}

//| n | computers | return |
//        | --- | --- | --- |
//        | 3 | [[1, 1, 0], [1, 1, 0], [0, 0, 1]] | 2 |
//        | 3 | [[1, 1, 0], [1, 1, 1], [0, 1, 1]] | 1 |