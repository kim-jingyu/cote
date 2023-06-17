package book.ch4.compressthestring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CompressStringTest {
    CompressString cs = new CompressStringV1();

    @Test
    void test1() {
        assertThat(cs.solution("aabbaccc")).isEqualTo(7);
    }

    @Test
    void test2() {
        assertThat(cs.solution("ababcdcdababcdcd")).isEqualTo(9);
    }

    @Test
    void test3() {
        assertThat(cs.solution("abcabcdede")).isEqualTo(8);
    }

    @Test
    void test4() {
        assertThat(cs.solution("abcabcabcabcdededededede")).isEqualTo(14);
    }

    @Test
    void test5() {
        assertThat(cs.solution("xababcdcdababcdcd")).isEqualTo(17);
    }

}