package cote.programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class GameMapMinLengthTest {

    private GameMapMinLength gameMapMinLength;

    public GameMapMinLengthTest() {
        gameMapMinLength = new GameMapMinLength();
    }

    @Test
    void 솔루션1() {
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        int answer = gameMapMinLength.solution(maps);

        assertThat(answer).isEqualTo(11);
    }

    @Test
    void 솔루션2() {
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {0, 0, 0, 0, 1}};
        int answer = gameMapMinLength.solution(maps);

        assertThat(answer).isEqualTo(-1);
    }
}

//    maps	answer
//[[1,0,1,1,1],[1,0,1,0,1],[1,0,1,1,1],[1,1,1,0,1],[0,0,0,0,1]]	11
//        [[1,0,1,1,1],[1,0,1,0,1],[1,0,1,1,1],[1,1,1,0,0],[0,0,0,0,1]]	-1