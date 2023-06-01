package cote.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RicochetRobotsTest {
    RicochetRobots rr = new RicochetRobots();

    @Test
    void test1() {
        assertThat(rr.solution(new String[]{"...D..R", ".D.G...", "....D.D", "D....D.", "..D...."})).isEqualTo(7);
    }

    @Test
    void test2() {
        assertThat(rr.solution(new String[]{".D.R", "....", ".G..", "...D"})).isEqualTo(-1);
    }
}