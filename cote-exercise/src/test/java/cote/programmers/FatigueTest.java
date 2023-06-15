package cote.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FatigueTest {
    Fatigue fatigue = new Fatigue();

    @Test
    void testcase1() {
        assertThat(fatigue.solution(80, new int[][]{{80, 20}, {50, 40}, {30, 10}})).isEqualTo(3);
    }
}