package cote.programmers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class FindPrimeNumberTest {
    FindPrimeNumber findPrimeNumber = new FindPrimeNumber();

    @Test
    void testcase1() {
        assertThat(findPrimeNumber.solution("17")).isEqualTo(3);
    }
    @Test
    void testcase2() {
        assertThat(findPrimeNumber.solution("011")).isEqualTo(2);
    }
}