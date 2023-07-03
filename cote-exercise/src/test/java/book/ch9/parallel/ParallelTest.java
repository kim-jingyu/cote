package book.ch9.parallel;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ParallelTest {
    Parallel p = new ParallelV0();

    @Test
    void test1() {
        assertThat(p.solution(new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}})).isEqualTo(1);
    }
}