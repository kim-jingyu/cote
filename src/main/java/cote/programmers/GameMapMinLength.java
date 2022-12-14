package cote.programmers;

import java.util.LinkedList;
import java.util.Queue;

class Point{
    int y;
    int x;

    public Point(int y, int x) {
        this.y = y;
        this.x = x;
    }
}
public class GameMapMinLength {
    int[] dy = {1,0,-1,0};
    int[] dx = {0,1,0,-1};
    private int[][] maps, dis;
    private boolean[][] visited;

    private void bfs(int cur_y,int cur_x) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(cur_y, cur_x));
        dis[cur_y][cur_x] = 1;
        visited[cur_y][cur_x] = true;
        while (!queue.isEmpty()) {
            Point point = queue.poll();

            if(dis[maps.length-1][maps[0].length-1]>0) return;

            for (int i = 0; i < 4; i++) {
                int ny = point.y + dy[i];
                int nx = point.x + dx[i];

                if(ny < 0 || ny > maps.length-1 || nx < 0 || nx > maps[0].length-1 || maps[ny][nx] == 0 || visited[ny][nx]){
                    continue;
                }

                maps[point.y][point.x] = 0;
                visited[ny][nx] = true;
                queue.offer(new Point(ny, nx));
                dis[ny][nx] = dis[point.y][point.x] + 1;
            }
        }
    }
    public int solution(int[][] maps){
        this.maps = maps;
        dis = new int[maps.length][maps[0].length];
        visited = new boolean[maps.length][maps[0].length];
        bfs(0,0);
        if(dis[maps.length-1][maps[0].length-1]>0) return dis[maps.length-1][maps[0].length-1];
        return -1;
    }
}
