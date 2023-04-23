package cote.programmers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindPrimeNumber {
    public int solution(String numbers) {
        int answer = 0;

        Set<Integer> allNumbers = new HashSet<>();
        List<String> checked = new ArrayList<>();

        findAllNumbers("", numbers, allNumbers);

        for (Integer num: allNumbers) {
            if (isPrime(num)) answer++;
        }

        return answer;
    }

    private void findAllNumbers(String combination, String others, Set<Integer> allNumbers) {
        if (!combination.equals("")) {
            allNumbers.add(Integer.parseInt(combination));
        }
        for (int cur = 0; cur < others.length(); cur++) {
            findAllNumbers(combination+others.charAt(cur), others.substring(0,cur) + others.substring(cur+1), allNumbers);
        }
    }

    private boolean isPrime(Integer num) {
        boolean primeCheck = true;

        if (num == 0 || num == 1) return false;

        int sqrted = (int) Math.sqrt(num);

        for (int i = 2; i <= sqrted; i++) {
            if (num % i == 0) {
                primeCheck = false;
                break;
            }
        }

        return primeCheck;
    }
}
