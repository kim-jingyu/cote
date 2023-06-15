package cote.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class HotelRoomOnHireTest {
    HotelRoomOnHire hr = new HotelRoomOnHire();

    @Test
    void test1() {
        assertThat(hr.solution(new String[][]{{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}})).isEqualTo(3);
    }

    @Test
    void test2() {
        assertThat(hr.solution(new String[][]{{"09:10", "10:10"}, {"10:20", "12:20"}})).isEqualTo(1);
    }

    @Test
    void test3() {
        assertThat(hr.solution(new String[][]{{"10:20", "12:30"}, {"10:20", "12:30"}, {"10:20", "12:30"}})).isEqualTo(3);
    }

    @Test
    void test4() {
        assertThat(hr.solution(new String[][]{{"08:00", "08:30"}, {"08:00", "13:00"}, {"12:30", "13:30"}})).isEqualTo(2);
    }

    @Test
    void test5() {
        assertThat(hr.solution(new String[][]{{"05:57", "06:02"}, {"04:00", "06:59"}, {"03:56", "07:57"}, {"06:12", "08:55"}, {"07:09", "07:11"}})).isEqualTo(3);
    }
}