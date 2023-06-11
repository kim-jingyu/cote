package book.ch4.numberstringandwords;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class NumberStringAndWordsTest {
    NumberStringAndWords ns = new NumberStringAndWords();

    @Test
    void test1() {
        assertThat(ns.solution("one4seveneight")).isEqualTo(1478);
    }

    @Test
    void test2() {
        assertThat(ns.solution("23four5six7")).isEqualTo(234567);
    }

    @Test
    void test3() {
        assertThat(ns.solution("2three45sixseven")).isEqualTo(234567);
    }

    @Test
    void test4() {
        assertThat(ns.solution("123")).isEqualTo(123);
    }
}