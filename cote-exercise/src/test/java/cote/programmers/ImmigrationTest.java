package cote.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ImmigrationTest {
    Immigration immigration = new Immigration();

    @Test
    void testcase1() {
        assertThat(immigration.solution(6, new int[]{7, 10})).isEqualTo(28);
    }
}