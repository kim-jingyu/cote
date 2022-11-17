package cote.baekjoon.dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point{
    int x,y;
    Point(int y,int x){
        this.y=y;
        this.x=x;
    }
}
public class NO2178 {
    private static int width,height;
    private static int[][] map,dis;
    private static int[] dy = {-1,0,1,0};
    private static int[] dx = {0,1,0,-1};

    public static void solution(int y,int x){
        Queue<Point> queue = new LinkedList<>();
        map[1][1] = 0;
        queue.offer(new Point(y,x));
        dis[1][1] = 1;
        while(!queue.isEmpty()){
            Point tmp = queue.poll();
            for(int i=0;i<4;i++){
                int ny = tmp.y + dy[i];
                int nx = tmp.x + dx[i];
                if(ny>0 && ny<=height && nx>0 && nx<=width && map[ny][nx]!=0){
                    map[ny][nx]=0;
                    dis[ny][nx]=dis[tmp.y][tmp.x]+1;
                    queue.offer(new Point(ny,nx));
                }
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
        width = sc.nextInt();

        map = new int[height+1][width+1];
        for(int i=1;i<=height;i++){
            String[] arr = sc.next().split("");
            for(int j=1;j<=width;j++){
                map[i][j] = Integer.valueOf(arr[j-1]);
            }
        }
        dis = new int[height+1][width+1];

        solution(1,1);

        if(dis[height][width]==0) System.out.println(-1);
        else System.out.println(dis[height][width]);
    }
}

//4 6
//        110110
//        110110
//        111111
//        111101