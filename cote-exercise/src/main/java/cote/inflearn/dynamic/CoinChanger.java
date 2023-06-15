package cote.inflearn.dynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CoinChanger {
    private static int n,target;
    private static int[] dy;

    public static int solution(List<Integer> list){
        Arrays.fill(dy,Integer.MAX_VALUE);
        dy[0]=0;
        for(int i:list){
            for(int j=i;j<=target;j++){
                dy[j] = Math.min(dy[j],dy[j-i] + 1);
            }
        }
        return dy[target];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int tmp = sc.nextInt();
            list.add(tmp);
        }
        target = sc.nextInt();
        dy = new int[target+1];
        System.out.println(solution(list));
    }
}

//3
//        1 2 5
//        15

//3