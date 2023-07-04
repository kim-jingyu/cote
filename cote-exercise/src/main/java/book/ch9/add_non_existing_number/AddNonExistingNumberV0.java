package book.ch9.add_non_existing_number;

import java.util.HashSet;
import java.util.Set;

public class AddNonExistingNumberV0 implements AddNonExistingNumber{
    @Override
    public int solution(int[] numbers) {
        int result = 0;
        Set<Integer> set = getSet(numbers);

        for (int i = 0; i <= 9; i++) {
            if (!set.contains(i)) {
                result += i;
            }
        }

        return result;
    }

    private Set<Integer> getSet(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for (int number : numbers) {
            set.add(number);
        }

        return set;
    }
}
