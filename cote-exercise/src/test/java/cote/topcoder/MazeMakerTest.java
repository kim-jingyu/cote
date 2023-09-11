package cote.topcoder;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MazeMakerTest {
    MazeMaker m = new MazeMaker();

    @Test
    void test1() {
        int answer = m.longestPath(new String[]{"...", "...", "..."}, 0, 1, new int[]{1, 0, -1, 0}, new int[]{0, 1, 0, -1});

        assertThat(answer).isEqualTo(3);
    }

    @Test
    void test2() {
        int answer = m.longestPath(new String[]{"...", "...", "..."}, 0, 1, new int[]{1, 0, -1, 0, 1, 1, -1, -1}, new int[]{0, 1, 0, -1, 1, -1, 1, -1});

        assertThat(answer).isEqualTo(2);
    }

    @Test
    void test3() {
        int answer = m.longestPath(new String[]{"X.X", "...", "XXX", "X.X"}, 0, 1, new int[]{1, 0, -1, 0}, new int[]{0, 1, 0, -1});

        assertThat(answer).isEqualTo(-1);
    }

    @Test
    void test4() {
        int answer = m.longestPath(new String[]{".......", "X.X.X..", "XXX...X", "....X..", "X....X.", "......."}, 5, 0, new int[]{1, 0, -1, 0,-2, 1}, new int[]{0, -1, 0, 1, 3, 0});

        assertThat(answer).isEqualTo(7);
    }
}