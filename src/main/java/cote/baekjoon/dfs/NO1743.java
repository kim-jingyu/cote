package cote.baekjoon.dfs;

import java.util.Scanner;

public class NO1743 {
    private static int height,width,n,answer,max=Integer.MIN_VALUE;
    private static int[][] map;
    private static int[] dy = {-1,0,1,0};
    private static int[] dx = {0,1,0,-1};

    public static void dfs(int y,int x){
        for(int i=0;i<4;i++){
            int ny = y + dy[i];
            int nx = x + dx[i];
            if(ny<0 || nx<0) continue;
            if(nx>=0 && ny>=0 && nx<width && ny<height && map[ny][nx]!=0){
                map[ny][nx] = 0;
                answer++;
                dfs(ny,nx);
            }
        }
    }

    public static void solution(){
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                if(map[i][j]==1){
                    answer=1;
                    map[i][j]=0;
                    dfs(i,j);
                    max = Math.max(max,answer);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
        width = sc.nextInt();
        n = sc.nextInt();

        map = new int[height][width];
        for(int i=0;i<n;i++){
            int y = sc.nextInt();
            int x = sc.nextInt();
            map[y-1][x-1] = 1;
        }

        solution();

        System.out.println(max);
    }
}

//3 4 5
//        3 2
//        2 2
//        3 1
//        2 3
//        1 1
//
//4