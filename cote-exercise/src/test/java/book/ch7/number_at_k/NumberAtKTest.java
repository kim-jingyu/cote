package book.ch7.number_at_k;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
class NumberAtKTest {
    NumberAtK numberAtK = new NumberAtKV0();

    @Test
    void 테스트케이스1() {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result = {5, 6, 3};

        assertThat(numberAtK.solution(array, commands)).isEqualTo(result);
    }
}