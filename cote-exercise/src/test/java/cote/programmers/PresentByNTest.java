package cote.programmers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class PresentByNTest {
    PresentByN presentByN = new PresentByN();

    @Test
    void testcase1() {
        assertThat(presentByN.solution(5, 12)).isEqualTo(4);
    }

    @Test
    void testcase2() {
        assertThat(presentByN.solution(2, 11)).isEqualTo(3);
    }
}