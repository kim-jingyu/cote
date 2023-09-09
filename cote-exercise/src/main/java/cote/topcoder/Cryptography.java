package cote.topcoder;

import java.util.Arrays;

public class Cryptography {
    public long encrypt(int[] numbers) {
        long answer = 1L;

        Arrays.sort(numbers);
        numbers[0]++;

        for (int number : numbers) {
            answer *= number;
        }

        return answer;
    }
}
