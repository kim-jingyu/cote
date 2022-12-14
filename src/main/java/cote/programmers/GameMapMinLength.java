package cote.programmers;

public class GameMapMinLength {
    int[] dy = {1,0,-1,0};
    int[] dx = {0,1,0,-1};
    private int[][] maps;
    private int min = Integer.MAX_VALUE, cnt = 1;
    private boolean flag = false;

    private void dfs(int cur_y,int cur_x) {
        if(cur_y == maps.length-1 && cur_x == maps[0].length-1){
            min = Math.min(cnt, min);
            flag = true;
        }
        else{
            for (int i = 0; i < 4; i++) {
                int ny = cur_y + dy[i];
                int nx = cur_x + dx[i];

                if (ny < 0 || nx < 0 || ny > maps.length-1 || nx > maps[0].length-1) {
                    continue;
                }

                if (maps[ny][nx] == 1) {
                    cnt++;
                    maps[cur_y][cur_x] = 0;
                    dfs(ny,nx);
                    maps[cur_y][cur_x] = 1;
                }
            }
        }
    }
    public int solution(int[][] maps){
        this.maps = maps;
        dfs(0, 0);
        if(flag) return min;
        return -1;
    }
}

//    maps	answer
//[[1,0,1,1,1],[1,0,1,0,1],[1,0,1,1,1],[1,1,1,0,1],[0,0,0,0,1]]	11
//        [[1,0,1,1,1],[1,0,1,0,1],[1,0,1,1,1],[1,1,1,0,0],[0,0,0,0,1]]	-1
