package book.ch4.makestrangewords;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MakeStrangeWordsTest {
    MakeStrangeWords ms = new MakeStrangeWords();

    @Test
    void test1() {
        assertThat(ms.solution("try hello world")).isEqualTo("TrY HeLlO WoRlD");
    }
}