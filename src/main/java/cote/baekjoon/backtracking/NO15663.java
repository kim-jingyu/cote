package cote.baekjoon.backtracking;

import java.util.*;
import java.util.stream.Collectors;

public class NO15663 {
    private static int n,m;
    private static int[] arr,ch;
    private static List<Integer> list = new ArrayList<>();

    public static void solution(int Level){
        if(Level == m){
            for(int i:arr) System.out.print(i+" ");
            System.out.println();
        }
        else{
            int past = 0;
            for(int i=0;i<n;i++){
                if(ch[i]==1)
                    continue;
                if(past != list.get(i)){
                    past = list.get(i);
                    ch[i] = 1;
                    arr[Level] = list.get(i);
                    solution(Level+1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];
        ch = new int[n];

        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        solution(0);
    }
}

//4 2
//        9 7 9 1
//
//        1 7
//        1 9
//        7 1
//        7 9
//        9 1
//        9 7
//        9 9