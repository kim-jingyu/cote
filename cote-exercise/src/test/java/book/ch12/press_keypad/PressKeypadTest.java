package book.ch12.press_keypad;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class PressKeypadTest {
    PressKeypad pk = new PressKeypadV0();

    @Test
    void test1() {
        assertThat(pk.solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right")).isEqualTo("LRLLLRLLRRL");
    }
}