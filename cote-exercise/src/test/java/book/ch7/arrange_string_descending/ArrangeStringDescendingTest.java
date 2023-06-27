package book.ch7.arrange_string_descending;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ArrangeStringDescendingTest {
    ArrangeStringDescending asd = new ArrangeStringDescendingV1();

    @Test
    void test1() {
        assertThat(asd.solution("Zbcdefg")).isEqualTo("gfedcbZ");
    }
}