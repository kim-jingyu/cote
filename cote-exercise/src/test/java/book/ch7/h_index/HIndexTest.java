package book.ch7.h_index;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class HIndexTest {
    HIndex hIndex = new HIndexV0();

    @Test
    void test1() {
        assertThat(hIndex.solution(new int[]{3, 0, 6, 1, 5})).isEqualTo(3);
    }
}