package cote.inflearn.greedy;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge3 implements Comparable<Edge3>{
    int v,cost;

    Edge3(int v,int cost){
        this.v = v;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge3 o) {
        return this.cost - o.cost;
    }
}

public class WonderLandPRQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nodes = sc.nextInt();
        int edges = sc.nextInt();

        ArrayList<ArrayList<Edge3>> graph = new ArrayList<>();
        for(int i=0;i<=nodes;i++){
            graph.add(new ArrayList<Edge3>());
        }

        for(int i=0;i<edges;i++){
            int current = sc.nextInt();
            int v = sc.nextInt();
            int cost = sc.nextInt();
            graph.get(current).add(new Edge3(v,cost));
            graph.get(v).add(new Edge3(current,cost));
        }

        int[] ch = new int[nodes+1];

        int answer = 0;
        PriorityQueue<Edge3> pQ = new PriorityQueue<>();
        pQ.offer(new Edge3(1,0));
        while (!pQ.isEmpty()) {
            Edge3 tmp = pQ.poll();
            if(ch[tmp.v]==0){
                ch[tmp.v] = 1;
                answer += tmp.cost;
                for(Edge3 o:graph.get(tmp.v)){
                    if(ch[o.v]==0){
                        pQ.offer(o);
                    }
                }
            }
        }
        System.out.println(answer);
    }
}

//9 12
//        1 2 12
//        1 9 25
//        2 3 10
//        2 8 17
//        2 9 8
//        3 4 18
//        3 7 55
//        4 5 44
//        5 6 60
//        5 7 38
//        7 8 35
//        8 9 15
