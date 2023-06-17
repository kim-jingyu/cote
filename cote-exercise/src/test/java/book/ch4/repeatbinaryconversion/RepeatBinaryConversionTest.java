package book.ch4.repeatbinaryconversion;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RepeatBinaryConversionTest {
    RepeatBinaryConversionV1 rc = new RepeatBinaryConversionV1();

    @Test
    void test1() {
        assertThat(rc.solution("110010101001")).isEqualTo(new int[]{3, 8});
    }

    @Test
    void test2() {
        assertThat(rc.solution("01110")).isEqualTo(new int[]{3, 3});
    }

    @Test
    void test3() {
        assertThat(rc.solution("1111111")).isEqualTo(new int[]{4, 1});
    }
}