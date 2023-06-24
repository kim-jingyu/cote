package book.ch7.sort_string_as_I_want;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SortStringAsIWantTest {
    SortStringAsIWant ss = new SortStringAsIWantV0();

    @Test
    void test1() {
        assertThat(ss.solution(new String[]{"sun", "bed", "car"}, 1)).isEqualTo(new String[]{"car", "bed", "sun"});
    }

    @Test
    void test2() {
        assertThat(ss.solution(new String[]{"abce", "abcd", "cdx"}, 2)).isEqualTo(new String[]{"abcd", "abce", "cdx"});
    }
}