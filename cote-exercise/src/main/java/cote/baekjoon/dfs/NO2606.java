package cote.baekjoon.dfs;

import java.util.Scanner;

public class NO2606 {
    private static int computers,edges,answer=0;
    private static int[] ch;
    private static int[][] map;

    private static void solution(int start){
        for(int i=1;i<=computers;i++){
            if(map[start][i]==1 && ch[i]!=1){
                ch[i] = 1;
                answer++;
                solution(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        computers = sc.nextInt();
        edges = sc.nextInt();

        map = new int[computers+1][computers+1];
        for(int i=1;i<=edges;i++){
            int y = sc.nextInt();
            int x = sc.nextInt();
            map[y][x]=map[x][y]=1;
        }

        ch = new int[computers+1];
        ch[1] = 1;
        solution(1);

        System.out.println(answer);
    }
}

//7
//        6
//        1 2
//        2 3
//        1 5
//        5 2
//        5 6
//        4 7
//
//4