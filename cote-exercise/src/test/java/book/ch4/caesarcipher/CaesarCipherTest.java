package book.ch4.caesarcipher;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CaesarCipherTest {
    CaesarCipherV1 cc = new CaesarCipherV1();

    @Test
    void test1() {
        assertThat(cc.solution("AB", 1)).isEqualTo("BC");
    }

    @Test
    void test2() {
        assertThat(cc.solution("z", 1)).isEqualTo("a");
    }

    @Test
    void test3() {
        assertThat(cc.solution("a B z", 4)).isEqualTo("e F d");
    }
}