package book.ch6.bad_user;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class BadUserTest {
    BadUser bu = new BadUserV0();

    @Test
    void test1() {
        assertThat(bu.solution(new String[]{"frodo", "fradi", "crodo", "abc123", "frodoc"}, new String[]{"fr*d*", "abc1**"})).isEqualTo(2);
    }

    @Test
    void test2() {
        assertThat(bu.solution(new String[]{"frodo", "fradi", "crodo", "abc123", "frodoc"}, new String[]{"*rodo", "*rodo", "******"})).isEqualTo(2);
    }

    @Test
    void test3() {
        assertThat(bu.solution(new String[]{"frodo", "fradi", "crodo", "abc123", "frodoc"}, new String[]{"fr*d*", "*rodo", "******", "******"})).isEqualTo(3);
    }
}