package cote.baekjoon.dfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NO1260 {
    private static int nodes;
    private static int[] ch;
    private static int[][] map;
    public static void dfs(int start){
        for(int i=1;i<=nodes;i++){
            if(map[start][i]==1 && ch[i]!=1){
                ch[i]=1;
                System.out.print(i+" ");
                dfs(i);
            }
        }
    }

    public static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        ch[start] = 1;
        queue.offer(start);

        while(!queue.isEmpty()){
            int tmp = queue.poll();
            System.out.print(tmp+" ");
            for(int i=1;i<=nodes;i++){
                if(map[tmp][i]==1 && ch[i]!=1){
                    ch[i]=1;
                    queue.offer(i);
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nodes = sc.nextInt();
        int edges = sc.nextInt();
        int start = sc.nextInt();
        ch = new int[nodes+1];

        map = new int[nodes+1][nodes+1];
        for(int i=0;i<edges;i++){
            int node1 = sc.nextInt();
            int node2 = sc.nextInt();
            map[node1][node2]=map[node2][node1]=1;
        }

        ch[start] = 1;
        System.out.print(start+" ");
        dfs(start);
        Arrays.fill(ch,0);
        System.out.println();

        bfs(start);
    }
}

//4 5 1
//        1 2
//        1 3
//        1 4
//        2 4
//        3 4
//
//        1 2 4 3
//        1 2 3 4