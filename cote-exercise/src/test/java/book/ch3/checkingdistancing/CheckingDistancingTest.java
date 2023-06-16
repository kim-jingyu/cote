package book.ch3.checkingdistancing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CheckingDistancingTest {
    CheckingDistancingV1 cd = new CheckingDistancingV1();

    @Test
    void test1() {
        String[][] places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
        assertThat(cd.solution(places)).isEqualTo(new int[]{1, 0, 1, 1, 1});
    }
}