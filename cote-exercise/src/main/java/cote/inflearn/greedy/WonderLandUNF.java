package cote.inflearn.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Edge2 implements Comparable<Edge2>{
    int v1,v2,cost;

    Edge2(int v1,int v2,int cost){
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge2 o) {
        return this.cost-o.cost;
    }
}

public class WonderLandUNF {
    private static int[] unf;

    public static int Find(int v){
        if(v==unf[v]) return unf[v];
        else return unf[v] = Find(unf[v]);
    }

    public static void Union(int v1,int v2){
        int fv1 = Find(v1);
        int fv2 = Find(v2);
        if(fv1!=fv2) unf[fv1]=fv2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nodes = sc.nextInt();
        int edges = sc.nextInt();

        unf = new int[nodes+1];
        for (int i=1;i<=nodes;i++) unf[i]=i;

        ArrayList<Edge2> arr = new ArrayList<>();
        for(int i=1;i<=edges;i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int cost = sc.nextInt();
            arr.add(new Edge2(v1,v2,cost));
        }
        int answer = 0;
        Collections.sort(arr);
        for(Edge2 o:arr){
            int fv1 = Find(o.v1);
            int fv2 = Find(o.v2);
            if(fv1!=fv2){
                answer += o.cost;
                Union(o.v1,o.v2);
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

//196
