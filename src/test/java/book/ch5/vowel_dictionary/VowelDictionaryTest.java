package book.ch5.vowel_dictionary;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class VowelDictionaryTest {
    VowelDictionary vd = new VowelDictionary();

    @Test
    void test1() {
        assertThat(vd.solution("AAAAE")).isEqualTo(6);
    }

    @Test
    void test2() {
        assertThat(vd.solution("AAAE")).isEqualTo(10);
    }

    @Test
    void test3() {
        assertThat(vd.solution("I")).isEqualTo(1563);
    }

    @Test
    void test4() {
        assertThat(vd.solution("EIO")).isEqualTo(1189);
    }
}