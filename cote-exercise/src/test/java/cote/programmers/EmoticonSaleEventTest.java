package cote.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class EmoticonSaleEventTest {
    EmoticonSaleEvent event = new EmoticonSaleEvent();

    @Test
    void testcase1() {
        int[][] users = {{40, 10000}, {25, 10000}};
        int[] emoticons = {7000, 9000};
        int[] result = {1, 5400};

        assertThat(event.solution(users, emoticons)).isEqualTo(result);
    }

    @Test
    void testcase2() {
        int[][] users = {{40, 2900}, {23, 10000}, {11, 5200}, {5, 5900}, {40, 3100}, {27, 9200}, {32, 6900}};
        int[] emoticons = {1300, 1500, 1600, 4900};
        int[] result = {4, 13860};

        assertThat(event.solution(users, emoticons)).isEqualTo(result);
    }

}