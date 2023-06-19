package book.ch6.find_prime;

import java.util.HashSet;
import java.util.Set;

public class FindPrimeV1 implements FindPrime{
    @Override
    public int solution(String numbers) {
        Set<Integer> primes = new HashSet<>();
        int[] arr = numbers.chars().map(i -> i - '0').toArray();
        calculate(primes, 0, arr, new boolean[numbers.length()]);

        return primes.size();
    }

    private void calculate(Set<Integer> primes, int curNumber, int[] numbers, boolean[] isVisited) {
        if (isPrime(curNumber)) primes.add(curNumber);

        for (int i = 0; i < numbers.length; i++) {
            if (isVisited[i]) continue;
            int number = curNumber * 10 + numbers[i];
            isVisited[i] = true;
            calculate(primes, number, numbers, isVisited);
            isVisited[i] = false;
        }
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
