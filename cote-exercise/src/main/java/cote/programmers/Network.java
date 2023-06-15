package cote.programmers;

import java.util.ArrayList;
import java.util.List;

class Network {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n + 1];

        // 인접 리스트 선언
        List<Integer>[] connections = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            connections[i] = new ArrayList<>();
        }

        // 인접 리스트 채우기
        for (int i = 0; i < computers[0].length; i++) {
            for (int j = 0; j < computers.length; j++) {
                if (i > j && computers[i][j] == 1) {
                    connections[j+1].add(i+1);
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                getConnectionOfSolution2(visited, i, connections);
                answer++;
            }
        }

        return answer;
    }

    private void getConnectionOfSolution2(boolean[] visited, int cur, List<Integer>[] connections) {
        visited[cur] = true;
        for (Integer next : connections[cur]) {
            getConnectionOfSolution2(visited, next, connections);
        }
    }

    private int getAnswerBySolution1(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                getConnectionOfSolution1(i, visited, computers);
                answer++;
            }
        }
        return answer;
    }

    private void getConnectionOfSolution1(int cur, boolean[] visited, int[][] computers) {
        visited[cur] = true;
        for (int i = 0; i < visited.length; i++) {
            if (i == cur) {
                continue;
            }
            if (computers[cur][i] == 1 && !visited[i]) {
                getConnectionOfSolution1(i, visited, computers);
            }
        }
    }
}

//| n | computers | return |
//        | --- | --- | --- |
//        | 3 | [[1, 1, 0], [1, 1, 0], [0, 0, 1]] | 2 |
//        | 3 | [[1, 1, 0], [1, 1, 1], [0, 1, 1]] | 1 |