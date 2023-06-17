package book.ch4;

import book.ch4.repeatbinaryconversion.HandleWordsBasicV0;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class HandleWordsBasicTest {
    HandleWordsBasic hw = new HandleWordsBasicV0();

    @Test
    void test1() {
        assertThat(hw.solution("a234")).isFalse();
    }

    @Test
    void test2() {
        assertThat(hw.solution("1234")).isTrue();
    }
}