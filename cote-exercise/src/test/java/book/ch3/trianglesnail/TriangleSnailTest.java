package book.ch3.trianglesnail;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TriangleSnailTest {
    TriangleSnailV2 tV2 = new TriangleSnailV2();

    @Test
    void test1() {
        assertThat(tV2.solution(4)).isEqualTo(new int[]{1, 2, 9, 3, 10, 8, 4, 5, 6, 7});
    }

    @Test
    void test2() {
        assertThat(tV2.solution(5)).isEqualTo(new int[]{1,2,12,3,13,11,4,14,15,10,5,6,7,8,9});
    }

    @Test
    void test3() {
        assertThat(tV2.solution(6)).isEqualTo(new int[]{1,2,15,3,16,14,4,17,21,13,5,18,19,20,12,6,7,8,9,10,11});
    }
}