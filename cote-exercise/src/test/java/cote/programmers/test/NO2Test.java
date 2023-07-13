package cote.programmers.test;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class NO2Test {
    NO2 no2 = new NO2();

    @Test
    void test1() {
        Assertions.assertThat(no2.solution(new int[][]{{1, 2}, {2, 3}, {2, 6}, {3, 4}, {4, 5}}, 2, 3)).isEqualTo(37);
    }

    @Test
    void test2() {
        Assertions.assertThat(no2.solution(new int[][]{{1, 2}, {2, 3}, {2, 6}, {3, 4}, {4, 5}}, 1, 2)).isEqualTo(27);
    }


}