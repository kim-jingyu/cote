package cote.inflearn.greedy;

import java.util.Scanner;

class Edge implements Comparable<Edge>{
    int vex,cost;

    Edge(int vex,int cost){
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}

public class Dijkstra {

    public static void main(String[] args) {
        Dijkstra dijkstra = new Dijkstra();
        Scanner sc = new Scanner(System.in);
        int nodes = sc.nextInt();
        int edges = sc.nextInt();

    }
}

//6 9
//        1 2 12 //1번 정점에서 2번 정점으로 가는데 12의 비용이 든다.
//        1 3 4
//        2 1 2
//        2 3 5
//        2 5 5
//        3 4 5
//        4 2 2
//        4 5 5
//        6 4 5

//2 : 11
//        3 : 4
//        4 : 9
//        5 : 14
//        6 : Impossible