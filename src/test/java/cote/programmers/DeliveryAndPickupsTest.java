package cote.programmers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryAndPickupsTest {
    DeliveryAndPickups deliveryAndPickups = new DeliveryAndPickups();

    @Test
    void testcase1() {
        long result = deliveryAndPickups.solution(4, 5, new int[]{1, 0, 3, 1, 2}, new int[]{0, 3, 0, 4, 0});

        Assertions.assertThat(result).isEqualTo(16);
    }

    @Test
    void testcase2() {
        long result = deliveryAndPickups.solution(2, 7, new int[]{1, 0, 2, 0, 1, 0, 2}, new int[]{0, 2, 0, 1, 0, 2, 0});

        Assertions.assertThat(result).isEqualTo(30);
    }
}