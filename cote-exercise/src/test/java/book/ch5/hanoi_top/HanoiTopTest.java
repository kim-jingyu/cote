package book.ch5.hanoi_top;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class HanoiTopTest {
    HanoiTop ht = new HanoiTop();

    @Test
    void test1() {
        assertThat(ht.solution(3)).isEqualTo(new int[][]{{1, 2}, {1, 3}, {2, 3}});
    }
}