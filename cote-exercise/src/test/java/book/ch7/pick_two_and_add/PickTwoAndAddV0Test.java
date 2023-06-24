package book.ch7.pick_two_and_add;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PickTwoAndAddV0Test {
    PickTwoAndAdd pw = new PickTwoAndAddV0();

    @Test
    void test1() {
        assertThat(pw.solution(new int[]{2, 1, 3, 4, 1})).isEqualTo(new int[]{2, 3, 4, 5, 6, 7});
    }

    @Test
    void test2() {
        assertThat(pw.solution(new int[]{5, 0, 2, 7})).isEqualTo(new int[]{2, 5, 7, 9, 12});
    }
}