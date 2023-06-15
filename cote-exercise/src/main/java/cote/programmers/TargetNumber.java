package cote.programmers;

public class TargetNumber {
    private int answer = 0;
    private int[] numbers;
    private int target;

    private void dfs(int Level, int sum) {
        if(Level==numbers.length){
            System.out.println(sum);
            if (sum == target) {
                answer++;
            }
        }
        else{
            dfs(Level + 1, sum + numbers[Level]);
            dfs(Level + 1, sum - numbers[Level]);
        }
    }
    public int solution(int[] numbers,int target){
        this.numbers = numbers;
        this.target = target;
        dfs(0, 0);
        return answer;
    }
}

//    numbers	target	return
//        [1, 1, 1, 1, 1]	3	5
//        [4, 1, 2, 1]	4	2