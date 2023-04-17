package cote.programmers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MakeMaxNumberTest {
    MakeMaxNumber makeMaxNumber = new MakeMaxNumber();

    @Test
    void testcase1() {
        assertThat(makeMaxNumber.solution("1924", 2)).isEqualTo("94");
    }

    @Test
    void testcase2() {
        assertThat(makeMaxNumber.solution("1231234", 3)).isEqualTo("3234");
    }

    @Test
    void testcase3() {
        assertThat(makeMaxNumber.solution("4177252841", 4)).isEqualTo("775841");
    }
}