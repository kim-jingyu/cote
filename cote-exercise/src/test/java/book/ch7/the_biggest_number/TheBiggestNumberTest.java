package book.ch7.the_biggest_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TheBiggestNumberTest {
    TheBiggestNumber theBiggestNumber = new TheBiggestNumberV0();

    @Test
    void test1() {
        assertThat(theBiggestNumber.solution(new int[]{6, 10, 2})).isEqualTo("6210");
    }

    @Test
    void test2() {
        assertThat(theBiggestNumber.solution(new int[]{3, 30, 34, 5, 9})).isEqualTo("9534330");
    }
}