package cote.programmers;

import java.util.Scanner;
import java.util.logging.Level;

public class TargetNumber {
    private static int sum = 0;
    static int answer = 0;
    private static void dfs(int Level, int[] numbers, int target) {
        if(Level==numbers.length){
            if (sum == target) {
                answer++;
            }
            sum = 0;
        }
        else{
            for(int i=0;i<2;i++){
                if(i==0) sum += numbers[Level];
                if(i==1) sum -= numbers[Level];
                dfs(Level+1,numbers,target);
            }
        }
    }
    public static int solution(int[] numbers,int target){
        dfs(0, numbers, target);
        return answer;
    }
}

//    numbers	target	return
//        [1, 1, 1, 1, 1]	3	5
//        [4, 1, 2, 1]	4	2