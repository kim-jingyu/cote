package cote.programmers;

import book.ch6.find_prime.FindPrime;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FindPrimeNumberTest {
    FindPrime findPrimeNumber = new FindPrime();

    @Test
    void testcase1() {
        assertThat(findPrimeNumber.solution("17")).isEqualTo(3);
    }
    @Test
    void testcase2() {
        assertThat(findPrimeNumber.solution("011")).isEqualTo(2);
    }
}