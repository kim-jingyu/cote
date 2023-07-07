package book.ch12.target_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TargetNumberTest {
    TargetNumber t = new TargetNumberV0();

    @Test
    void test1() {
        assertThat(t.solution(new int[]{1, 1, 1, 1, 1}, 3)).isEqualTo(5);
    }
}