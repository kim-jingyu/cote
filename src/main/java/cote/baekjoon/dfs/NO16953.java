package cote.baekjoon.dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NO16953 {
    private static int Level = 1;
    private static long end;

    public static int bfs(long start) {
        Queue<Long> queue = new LinkedList<>();
        queue.offer(start);
        while (!queue.isEmpty()) {
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                long x = queue.poll();
                if (x * 2 == end || x * 10 + 1 == end) return ++Level;
                if (x * 2 < end) queue.offer(x * 2);
                if (x * 10 + 1 < end) queue.offer(x * 10 + 1);
            }
            Level++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start = sc.nextInt();
        end = sc.nextInt();

        System.out.println(bfs(start));
    }
}

//2 162
//
//5