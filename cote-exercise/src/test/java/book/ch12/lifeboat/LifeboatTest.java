package book.ch12.lifeboat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LifeboatTest {
    Lifeboat lifeboat = new LifeboatV0();

    @Test
    void test1() {
        assertThat(lifeboat.solution(new int[]{70, 50, 80, 50}, 100)).isEqualTo(3);
    }

    @Test
    void test2() {
        assertThat(lifeboat.solution(new int[]{70, 80, 50}, 100)).isEqualTo(3);
    }
}