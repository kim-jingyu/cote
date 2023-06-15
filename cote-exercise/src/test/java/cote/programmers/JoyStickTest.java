package cote.programmers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class JoyStickTest {
    JoyStick joyStick = new JoyStick();

    @Test
    void testcase1() {
        assertThat(joyStick.solution("JAZ")).isEqualTo(11);
    }

    @Test
    void testcase2() {
        assertThat(joyStick.solution("JEROEN")).isEqualTo(56);
    }

    @Test
    void testcase3() {
        assertThat(joyStick.solution("JAN")).isEqualTo(23);
    }
}