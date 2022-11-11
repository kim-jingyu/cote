package cote.inflearn.dynamic;

import java.util.*;

class Brick implements Comparable<Brick>{
    int baseArea,high,weight;

    Brick(int baseArea, int high, int weight){
        this.baseArea=baseArea;
        this.high=high;
        this.weight=weight;
    }

    @Override
    public int compareTo(Brick o) {
        return o.baseArea-this.baseArea;
    }
}

public class TheHighestTop {
    private static int n;
    private static int[] dy;
    public static int solution(List<Brick> list){
        Collections.sort(list);
        dy[0] = list.get(0).high;
        int answer = dy[0];
        for(int i=1;i<n;i++){
            int max=0;
            for(int j=i-1;j>=0;j--){
                if(list.get(i).weight<list.get(j).weight && dy[j]>max){
                    max = dy[j];
                }
            }
            dy[i] = max + list.get(i).high;
            answer = Math.max(answer,dy[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dy = new int[n];
        List<Brick> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int baseArea = sc.nextInt();
            int high = sc.nextInt();
            int weight = sc.nextInt();
            list.add(new Brick(baseArea,high,weight));
        }
        System.out.println(solution(list));
    }
}

//5
//        25 3 4
//        4 4 6
//        9 2 3
//        16 2 5
//        1 5 2

//10