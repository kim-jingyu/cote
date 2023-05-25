package cote.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class InterceptionSystemTest {
    InterceptionSystem is = new InterceptionSystem();

    @Test
    void test1() {
        int[][] targets = {{4, 5}, {4, 8}, {10, 14}, {11, 13}, {5, 12}, {3, 7}, {1, 4}};

        assertThat(is.solution(targets)).isEqualTo(3);
    }
}