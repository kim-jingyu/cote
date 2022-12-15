package cote.programmers;

class Network {
    private int n;
    private int[][] computers;
    private boolean[] visited;

    private void init(int n, int[][] computers) {
        this.n = n;
        this.computers = computers;
    }

    private void dfs(int cur) {
        visited[cur] = true;
        for (int next = 0; next < n; next++) {
            if(cur!=next && computers[cur][next]==1 && !visited[next]){
                dfs(next);
            }
        }
    }

    public int solution(int n, int[][] computers){
        init(n, computers);
        int answer = 0;
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if(!visited[i]){
                dfs(i);
                answer++;
            }
        }

        return answer;
    }
}

//| n | computers | return |
//        | --- | --- | --- |
//        | 3 | [[1, 1, 0], [1, 1, 0], [0, 0, 1]] | 2 |
//        | 3 | [[1, 1, 0], [1, 1, 1], [0, 1, 1]] | 1 |