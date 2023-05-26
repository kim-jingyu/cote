package cote.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SumOfContinuedSubSequenceTest {
    SumOfContinuedSubSequence sc = new SumOfContinuedSubSequence();

    @Test
    void test1() {
        assertThat(sc.solution(new int[]{1, 2, 3, 4, 5}, 7)).isEqualTo(new int[]{2, 3});
    }

    @Test
    void test2() {
        assertThat(sc.solution(new int[]{1, 1, 1, 2, 3, 4, 5}, 5)).isEqualTo(new int[]{6, 6});
    }

    @Test
    void test3() {
        assertThat(sc.solution(new int[]{2, 2, 2, 2, 2}, 6)).isEqualTo(new int[]{0, 2});
    }

}