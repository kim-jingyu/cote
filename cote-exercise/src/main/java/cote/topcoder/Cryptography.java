package cote.topcoder;

public class Cryptography {
    public long encrypt(int[] numbers) {
        long answer = 0L;

        for (int i = 0; i < numbers.length; i++) {
            long currentNumber = numbers[i] + 1;
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) continue;
                currentNumber *= numbers[j];
            }
            answer = Math.max(answer, currentNumber);
        }

        return answer;
    }
}
