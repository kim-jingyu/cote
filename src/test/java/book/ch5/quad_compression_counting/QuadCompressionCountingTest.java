package book.ch5.quad_compression_counting;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class QuadCompressionCountingTest {
    QuadCompressionCounting qc = new QuadCompressionCounting();

    @Test
    void test1() {
        assertThat(qc.solution(new int[][]{{1, 1, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 1}, {1, 1, 1, 1}})).isEqualTo(new int[]{4, 9});
    }

    @Test
    void test2() {
        assertThat(qc.solution(new int[][]{{1, 1, 1, 1, 1, 1, 1, 1}, {0, 1, 1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 1, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 1, 0, 0, 1}, {0, 0, 0, 0, 1, 1, 1, 1}})).isEqualTo(new int[]{10, 15});
    }
}