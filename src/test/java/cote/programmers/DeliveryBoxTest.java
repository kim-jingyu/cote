package cote.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DeliveryBoxTest {
    DeliveryBox db = new DeliveryBox();

    @Test
    void test1() {
        assertThat(db.solution(new int[]{4, 3, 1, 2, 5})).isEqualTo(2);
    }

    @Test
    void test2() {
        assertThat(db.solution(new int[]{5, 4, 3, 2, 1})).isEqualTo(5);
    }

    @Test
    void test3() {
        assertThat(db.solution(new int[]{2, 1, 4, 3, 6, 5, 8, 7, 10, 9})).isEqualTo(10);
    }

    @Test
    void test4() {
        assertThat(db.solution(new int[]{2, 1, 6, 7, 5, 8, 4, 9, 3, 10})).isEqualTo(10);
    }


}