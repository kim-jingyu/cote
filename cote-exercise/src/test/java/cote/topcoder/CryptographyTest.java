package cote.topcoder;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CryptographyTest {
    @Test
    void test1() {
        Cryptography cryptography = new Cryptography();

        long answer = cryptography.encrypt(new int[]{1, 2, 3});

        assertThat(answer).isEqualTo(12L);
    }

    @Test
    void test2() {
        Cryptography cryptography = new Cryptography();

        long answer = cryptography.encrypt(new int[]{1, 3, 2, 1, 1, 3});

        assertThat(answer).isEqualTo(36L);
    }

    @Test
    void test3() {
        Cryptography cryptography = new Cryptography();

        long answer = cryptography.encrypt(new int[]{1000, 999, 998, 997, 996, 995});

        assertThat(answer).isEqualTo(986074810223904000L);
    }

    @Test
    void test4() {
        Cryptography cryptography = new Cryptography();

        long answer = cryptography.encrypt(new int[]{1,1,1,1});

        assertThat(answer).isEqualTo(2L);
    }
}