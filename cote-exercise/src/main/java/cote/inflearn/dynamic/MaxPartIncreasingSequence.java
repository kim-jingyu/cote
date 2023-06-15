package cote.inflearn.dynamic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxPartIncreasingSequence {
    private static int n;
    private static int[] dy;
    public static int solution(List<Integer> list){
        dy[0] = 1;
        int answer = dy[0];
        for(int i=1;i<n;i++){
            int max = 0;
            for(int j=i-1;j>=0;j--){
                if(list.get(i)>list.get(j) && dy[j]>max){
                    max=dy[j];
                }
            }
            dy[i] = max+1;
            answer = Math.max(answer,dy[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dy = new int[n];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int tmp = sc.nextInt();
            list.add(tmp);
        }

        System.out.println(solution(list));
    }
}