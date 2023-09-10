package cote.topcoder;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class ThePalindromeTest {
    ThePalindrome p = new ThePalindrome();

    @Test
    void test1() {
        int answer = p.find("abab");

        assertThat(answer).isEqualTo(5);
    }

    @Test
    void test2() {
        int answer = p.find("abacaba");

        assertThat(answer).isEqualTo(7);
    }

    @Test
    void test3() {
        int answer = p.find("qwerty");

        assertThat(answer).isEqualTo(11);
    }
}