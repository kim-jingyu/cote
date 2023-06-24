package book.ch7.pick_two_and_add;

import java.util.HashSet;
import java.util.Set;

public class PickTwoAndAddV0 implements PickTwoAndAdd{
    @Override
    public int[] solution(int[] numbers) {
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                result.add(numbers[i] + numbers[j]);
            }
        }

        return result.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}