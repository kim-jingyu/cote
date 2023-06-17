package book.ch4.pyinstring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PyInStringTest {
    PyInStringV1 py = new PyInStringV1();

    @Test
    void test1() {
        assertThat(py.solution("pPoooyY")).isEqualTo(true);
    }

    @Test
    void test2() {
        assertThat(py.solution("Pyy")).isEqualTo(false);
    }
}