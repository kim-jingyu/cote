package cote.topcoder;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CrazyBotTest {
    CrazyBot c = new CrazyBot();

    @Test
    void test1() {
        double answer = c.getProbability(14, 25, 25, 25, 25);

        assertThat(answer).isEqualTo(0.008845493197441101);
    }

    @Test
    void test2() {
        double answer = c.getProbability(2, 25, 25, 25, 25);

        assertThat(answer).isEqualTo(0.75);
    }

    @Test
    void test3() {
        double answer = c.getProbability(1, 25, 25, 25, 25);

        assertThat(answer).isEqualTo(1.0);
    }
}