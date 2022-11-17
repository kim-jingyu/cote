package cote.baekjoon.dfs;

import java.util.HashMap;
import java.util.Scanner;

public class NO1303 {
    private static int width, height, N, answer = 0;
    private static String[][] map;
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static HashMap<String, Integer> hashMap = new HashMap<>();

    public static void dfs(int x, int y, String s) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx > 0 && ny > 0 && nx <= height && ny <= width && map[nx][ny].equals(s)) {
                map[nx][ny] = "";
                hashMap.put(s, hashMap.get(s) + 1);
                dfs(nx, ny, s);
            }
        }
    }

    public static void solution(String s) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (map[i][j].equals(s)) {
                    hashMap.put(s, 1);
                    map[i][j] = "";
                    dfs(i, j, s);
                    N = hashMap.get(s);
                    answer += N * N;
                    hashMap.put(s, 0);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        width = sc.nextInt();
        height = sc.nextInt();

        map = new String[height+1][width+1];
        for (int i = 1; i <= height; i++) {
            String[] arr = sc.next().split("");
            for(int j=1;j<=width;j++){
                map[i][j]=arr[j-1];
            }
        }

        solution("W");
        System.out.print(answer + " ");
        answer = 0;
        solution("B");
        System.out.println(answer);
    }
}

//5 5
//        WBWWW
//        WWWWW
//        BBBBB
//        BBBWW
//        WWWWW
//
//        130 65