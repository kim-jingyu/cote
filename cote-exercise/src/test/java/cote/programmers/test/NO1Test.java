package cote.programmers.test;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class NO1Test {
    NO1 n = new NO1();

    @Test
    void test1() {
        assertThat(n.solution("1451232125", 2)).isEqualTo(21);
    }

    @Test
    void test2() {
        assertThat(n.solution("313253123", 3)).isEqualTo(321);
    }

    @Test
    void test3() {
        assertThat(n.solution("12412415", 4)).isEqualTo(-1);
    }


}