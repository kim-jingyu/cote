package cote.inflearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Point{
    int x,y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
}

public class Main {
    private static int n,m,len,answer=Integer.MAX_VALUE;
    private static int[] combi;
    private static List<Point> house;
    private static List<Point> pizza;

    public void solution(int Level, int startNumber){
        if(Level==m){
            //도시의 피자배달거리
            int cityPizzaDelivery=0;
            for(Point hs:house){
                //각 집마다의 피자배달거리
                int pizzaDelivery = Integer.MAX_VALUE;
                for(int x:combi){
                    pizzaDelivery = Math.min(
                            pizzaDelivery,
                            Math.abs(hs.x-pizza.get(x).x)+Math.abs(hs.y-pizza.get(x).y)
                    );
                }
                cityPizzaDelivery += pizzaDelivery;
            }
            answer = Math.min(cityPizzaDelivery,answer);
        }
        else{
            for(int i=startNumber;i<len;i++){
                combi[Level]=i;
                solution(Level+1,i+1);
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        house = new ArrayList<>();
        pizza = new ArrayList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int tmp = sc.nextInt();
                if(tmp==1) house.add(new Point(i,j));
                else if(tmp==2) pizza.add(new Point(i,j));
            }
        }

        len = pizza.size();
        combi = new int[m];

        main.solution(0,0);

        System.out.println(answer);
    }
}