package cote.baekjoon.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Point{
    int x,y;

    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
}

public class NO15686 {
    private static int n,m,chickenDistanceX,chickenDistanceY,cityDistance,chickenDistance,answer=Integer.MAX_VALUE;
    private static int[][] map;
    private static int[] combi;
    private static List<Point> houses = new ArrayList<>();
    private static List<Point> chickens = new ArrayList<>();

    public static void solution(int Level,int start){
        if(Level==m){
            cityDistance = 0;
            for(Point pHouse:houses){
                chickenDistance = Integer.MAX_VALUE;
                for(int i:combi){
                    chickenDistanceX = Math.abs(pHouse.x-chickens.get(i).x);
                    chickenDistanceY = Math.abs(pHouse.y-chickens.get(i).y);
                    chickenDistance = Math.min(chickenDistance,chickenDistanceX+chickenDistanceY);
                }
                cityDistance += chickenDistance;
            }
            answer = Math.min(cityDistance,answer);
        }
        else{
            for(int i=start;i<chickens.size();i++){
                combi[Level] = i;
                solution(Level+1,i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        combi = new int[m];

        map = new int[n+1][n+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                map[i][j] = sc.nextInt();
                if(map[i][j]==1) houses.add(new Point(i,j));
                if(map[i][j]==2) chickens.add(new Point(i,j));
            }
        }

        solution(0,0);

        System.out.println(answer);
    }
}

//5 2
//        0 2 0 1 0
//        1 0 1 0 0
//        0 0 0 0 0
//        2 0 0 1 1
//        2 2 0 1 2

//10