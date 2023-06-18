package book.ch6.carpet;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CarpetTest {
    Carpet carpet = new CarpetV1();

    @Test
    void test1() {
        assertThat(carpet.solution(10, 2)).isEqualTo(new int[]{4, 3});
    }

    @Test
    void test2() {
        assertThat(carpet.solution(8, 1)).isEqualTo(new int[]{3, 3});
    }

    @Test
    void test3() {
        assertThat(carpet.solution(24, 24)).isEqualTo(new int[]{8, 6});
    }
}