package cote.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class IntergersBetweenTwoCirclesTest {
    IntergersBetweenTwoCircles ic = new IntergersBetweenTwoCircles();

    @Test
    void test1() {
        assertThat(ic.solution(1, 3)).isEqualTo(28L);
    }
}