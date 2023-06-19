package book.ch6.find_prime;

import java.util.HashSet;
import java.util.Set;

public class FindPrimeV0 {
    public int solution(String numbers) {
        Set<Integer> answer = new HashSet<>();
        int[] nums = numbers.chars().map(c -> c - '0').toArray();
        getPrime(0, nums, new boolean[nums.length], answer);
        return answer.size();
    }

    private void getPrime(int curNum, int[] numbers, boolean[] isUsed, Set<Integer> primes) {
        if(isPrime(curNum)) primes.add(curNum);

        for (int i = 0; i < numbers.length; i++) {
            if (isUsed[i]) continue;

            int nextNum = curNum * 10 + numbers[i];
            isUsed[i] = true;
            getPrime(nextNum, numbers, isUsed, primes);
            isUsed[i] = false;
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
