package cote.inflearn.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Body implements Comparable<Body>{
    int height,weight;

    Body(int height,int weight){
        this.height=height;
        this.weight=weight;
    }

    @Override
    public int compareTo(Body o) {
        return o.height - this.height;
    }
}

public class Ssireum {
    public int solution(List<Body> list){
        int cnt=0;
        int max=Integer.MIN_VALUE;
        Collections.sort(list);
        for(Body body:list){
            if(body.weight>max){
                max=body.weight;
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args){
        Ssireum ssireum = new Ssireum();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Body> list = new ArrayList<>();
        int height;
        int weight;

        for(int i=0;i<n;i++){
            height = sc.nextInt();
            weight = sc.nextInt();
            list.add(new Body(height,weight));
        }

        System.out.println(ssireum.solution(list));
    }
}

//5
//        172 67
//        183 65
//        180 70
//        170 72
//        181 60
//
//3