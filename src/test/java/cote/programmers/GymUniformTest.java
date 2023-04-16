package cote.programmers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class GymUniformTest {
    GymUniform gymUniform = new GymUniform();

    @Test
    void testcase1() {
        assertThat(gymUniform.solution(5, new int[]{2, 4}, new int[]{1, 3, 5})).isEqualTo(5);
    }

    @Test
    void testcase2() {
        assertThat(gymUniform.solution(5, new int[]{2, 4}, new int[]{3})).isEqualTo(4);
    }

    @Test
    void testcase3() {
        assertThat(gymUniform.solution(3, new int[]{3}, new int[]{1})).isEqualTo(2);
    }
}