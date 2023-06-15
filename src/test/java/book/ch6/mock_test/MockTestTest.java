package book.ch6.mock_test;

import book.ch6.mock_test.MockTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MockTestTest {
    MockTest mt = new MockTest();

    @Test
    void test1() {
        assertThat(mt.solution(new int[]{1, 2, 3, 4, 5})).isEqualTo(new int[]{1});
    }

    @Test
    void test2() {
        assertThat(mt.solution(new int[]{1,3,2,4,2})).isEqualTo(new int[]{1,2,3});
    }
}