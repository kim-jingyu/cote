package cote.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class NO18232 {
    /**
     * N: 정거장 개수
     * M: 텔레포트 정보 개수
     * S: 출발 위치
     * E: 도착 위치
     */
    static int N,M,S, E;
    static boolean[] visited;

    static class Position{
        int now;
        int level;

        public Position(int now, int level) {
            this.now = now;
            this.level = level;
        }
    }
    public static void main(String[] args) throws IOException {
        Map<Integer, List<Integer>> teleport = getTeleport();

        System.out.println(getAnswer(teleport));
    }

    private static Map<Integer, List<Integer>> getTeleport() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        Map<Integer, List<Integer>> teleport = new HashMap<>();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int port1 = Integer.parseInt(st.nextToken());
            int port2 = Integer.parseInt(st.nextToken());

            teleport.computeIfAbsent(port1, k -> new ArrayList<>());
            teleport.get(port1).add(port2);
            teleport.computeIfAbsent(port2, k -> new ArrayList<>());
            teleport.get(port2).add(port1);
        }

        br.close();
        return teleport;
    }

    private static int getAnswer(Map<Integer, List<Integer>> teleport) {
        visited = new boolean[N + 1];
        Queue<Position> queue = new LinkedList<>();
        queue.add(new Position(S, 0));
        while (!queue.isEmpty()) {
            Position position = queue.poll();
            int now = position.now;

            if (now == E) {
                return position.level;
            }

            for (int link : getLinks(teleport, now)) {
                if (visited[link]) continue;

                visited[link] = true;
                queue.add(new Position(link, position.level + 1));
            }
        }

        return 0;
    }

    private static List<Integer> getLinks(Map<Integer, List<Integer>> teleport, int now) {
        List<Integer> links = teleport.getOrDefault(now, new ArrayList<>());
        if (now - 1 >= 1) {
            links.add(now - 1);
        }
        if (now + 1 <= N) {
            links.add(now + 1);
        }
        return links;
    }
}