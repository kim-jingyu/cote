package cote.programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PowerGridDivision {
    private int[][] map;
    private List<Integer>[] adjacencyList;
    public int solution(int n, int[][] wires) {
        int answer = getAnswerByAdjacencyList(n, wires);

        return answer;
    }

    private int getAnswerByAdjacencyList(int n, int[][] wires) {
        int answer = n;

        // 인접 리스트 선언
        adjacencyList = new ArrayList[n +1];
        for (int i = 1; i <= n; i++) {
            adjacencyList[i] = new ArrayList<>();
        }

        // 인접 리스트 값 할당
        for (int i = 0; i < wires.length; i++) {
            adjacencyList[wires[i][0]].add(wires[i][1]);
            adjacencyList[wires[i][1]].add(wires[i][0]);    // 양방향 할당
        }

        for (int i = 0; i < wires.length; i++) {
            int leftNodes = getConnectedNodes(wires[i][0], wires[i][1], n);
            int rightNodes = getConnectedNodes(wires[i][1], wires[i][0], n);

            answer = Math.min(answer, Math.abs(leftNodes - rightNodes));
        }
        return answer;
    }

    private int getConnectedNodes(int start, int end, int totalNodes) {
        int count = 0;
        boolean[] check = new boolean[totalNodes + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        check[start] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            count++;

            for (int next : adjacencyList[now]) {
                if (!check[next] && next != end) {
                    queue.offer(next);
                    check[next] = true;
                }
            }
        }

        return count;
    }

    private int getAnswerByAdjacencyMatrix(int n, int[][] wires) {
        int answer = n;

        // 인접행렬 선언
        map = new int[n + 1][n + 1];

        // 인접행렬 값 채우기
        for (int i = 0; i < wires.length; i++) {
            int start = wires[i][0];
            int end = wires[i][1];

            map[start][end] = 1;
            map[end][start] = 1;
        }

        // 선 하나씩 끊으면서 bfs 탐색
        for (int i = 0; i < wires.length; i++) {
            int start = wires[i][0];
            int end = wires[i][1];

            // 선 끊기
            map[start][end] = 0;
            map[end][start] = 0;

            answer = Math.min(answer, bfsOfAdjacencyMatrix(start, n));

            // 선 복구
            map[start][end] = 1;
            map[end][start] = 1;
        }
        return answer;
    }

    private int bfsOfAdjacencyMatrix(int start, int total) {
        int cnt = 1;
        boolean[] check = new boolean[total+1];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);

        while (!queue.isEmpty()) {
            int now = queue.poll();
            check[now] = true;

            for (int i = 1; i <= total; i++) {
                if (map[now][i] == 1 && !check[i]) {
                    queue.offer(i);
                    cnt++;
                }
            }
        }

        return Math.abs(cnt - (total - cnt));
    }
}