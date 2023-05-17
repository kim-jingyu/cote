package cote.swea;

import java.util.Scanner;

public class NQueen {
    private static int answer;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();          // 테스트케이스 개수 T

        for (int i = 1; i <= T; i++) {
            int N = scanner.nextInt();      // 퀸 N개 (1~10)
            int[] row = new int[N];
            answer = 0;

            dfs(0, row, N);

            System.out.println("#"+ i + " " + answer);
        }
    }

    private static void dfs(int level, int[] row, int N) {
        if (level == N) {
            answer++;
            return;
        }
        for (int i = 0; i < N; i++) {
            row[level] = i;

            if (isPromising(level, row)){
                dfs(level + 1, row, N);
            }
        }
    }

    private static boolean isPromising(int next, int[] row) {
        for (int i = 0; i < next; i++) {
            if (row[i] == row[next] || Math.abs(row[i]-row[next]) == next - i) return false;
        }
        return true;
    }
}
