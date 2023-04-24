package cote.programmers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RPowerGridDivisionTest {
    PowerGridDivision powerGridDivision = new PowerGridDivision();

    @Test
    void testcase1() {
        assertThat(powerGridDivision.solution(9, new int[][]{{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}})).isEqualTo(3);
    }

    @Test
    void testcase2() {
        assertThat(powerGridDivision.solution(4, new int[][]{{1, 2}, {2, 3}, {3, 4}})).isEqualTo(0);
    }

    @Test
    void testcase3() {
        assertThat(powerGridDivision.solution(7, new int[][]{{1, 2}, {2, 7}, {3, 7}, {3, 4}, {4, 5}, {6, 7}})).isEqualTo(1);
    }
}