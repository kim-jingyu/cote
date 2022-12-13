package cote.baekjoon.dfs;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NO12851 {
    private static int end;
    private static int[] ch= new int[100001];
    public static void bfs(int start){
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(start,0));

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int start = sc.nextInt();
        end = sc.nextInt();

        bfs(start);

    }
}

//5 17
//
//4
//2