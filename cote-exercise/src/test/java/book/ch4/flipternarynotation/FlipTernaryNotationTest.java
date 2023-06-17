package book.ch4.flipternarynotation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FlipTernaryNotationTest {
    FlipTernaryNotation fn = new FlipTernaryNotationV1();

    @Test
    void test1() {
        assertThat(fn.solution(45)).isEqualTo(7);
    }

    @Test
    void test2() {
        assertThat(fn.solution(125)).isEqualTo(229);
    }
}