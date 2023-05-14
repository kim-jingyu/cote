package cote.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class GameMapMinLengthTest {

    GameMapMinLength gameMapMinLength = new GameMapMinLength();

    @Test
    void testcase1() {
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        int answer = gameMapMinLength.solution(maps);

        assertThat(answer).isEqualTo(11);
    }

    @Test
    void testcase2() {
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {0, 0, 0, 0, 1}};
        int answer = gameMapMinLength.solution(maps);

        assertThat(answer).isEqualTo(-1);
    }
}