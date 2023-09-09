package cote.topcoder;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class InterestingDigitsTest {
    InterestingDigits ig = new InterestingDigits();

    @Test
    void test1() {
        int[] answer = ig.digits(10);

        assertThat(answer).isEqualTo(new int[]{3, 9});
    }

    @Test
    void test2() {
        int[] answer = ig.digits(3);

        assertThat(answer).isEqualTo(new int[]{2});
    }

    @Test
    void test3() {
        int[] answer = ig.digits(9);

        assertThat(answer).isEqualTo(new int[]{2, 4, 8});
    }

    @Test
    void test4() {
        int[] answer = ig.digits(26);

        assertThat(answer).isEqualTo(new int[]{5, 25});
    }

    @Test
    void test5() {
        int[] answer = ig.digits(30);

        assertThat(answer).isEqualTo(new int[]{29});
    }
}