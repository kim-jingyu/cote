package book.ch12.target_number;

public class TargetNumberV0 implements TargetNumber{
    private int[] numberList;
    private int cnt = 0;
    @Override
    public int solution(int[] numbers, int target) {
        numberList = numbers;
        calculate(0, target, 0);
        return cnt;
    }

    private void calculate(int level, int target, int sum) {
        if (level == numberList.length) {
            if (sum == target) {
                cnt++;
            }
            return;
        }

        calculate(level + 1, target, sum + numberList[level]);
        calculate(level + 1, target, sum - numberList[level]);
    }
}
