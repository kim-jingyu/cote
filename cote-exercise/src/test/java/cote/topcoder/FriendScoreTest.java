package cote.topcoder;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class FriendScoreTest {
    FriendScore f = new FriendScore();

    @Test
    void test1() {
        int answer = f.highestScore(new String[]{"NNN", "NNN", "NNN"});

        assertThat(answer).isEqualTo(0);
    }

    @Test
    void test2() {
        int answer = f.highestScore(new String[]{"NYNNN", "YNYNN", "NYNYN", "NNYNY", "NNNYN"});

        assertThat(answer).isEqualTo(4);
    }

    @Test
    void test3() {
        int answer = f.highestScore(new String[]{"NYY", "YNY", "YYN"});

        assertThat(answer).isEqualTo(2);
    }

    @Test
    void test4() {
        int answer = f.highestScore(new String[]{"NNNNYNNNNN", "NNNNYNYYNN", "NNNYYYNNNN", "NNYNNNNNNN", "YYYNNNNNNY", "NNYNNNNNYN", "NYNNNNNYNN", "NYNNNNYNNN", "NNNNNYNNNN", "NNNNYNNNNN"});

        assertThat(answer).isEqualTo(8);
    }

    @Test
    void test5() {
        int answer = f.highestScore(new String[]{"NNNNNNNNNNNNNNY", "NNNNNNNNNNNNNNN", "NNNNNNNYNNNNNNN", "NNNNNNNYNNNNNNY", "NNNNNNNNNNNNNNY", "NNNNNNNNYNNNNNN", "NNNNNNNNNNNNNNN", "NNYYNNNNNNNNNNN", "NNNNNYNNNNNYNNN", "NNNNNNNNNNNNNNY", "NNNNNNNNNNNNNNN", "NNNNNNNNYNNNNNN", "NNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNN", "YNNYYNNNNYNNNNN"});

        assertThat(answer).isEqualTo(6);
    }
}