package cote.programmers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
class NumberAtKTest {
    private NumberAtK numberAtK;

    public NumberAtKTest() {
        numberAtK = new NumberAtK();
    }

    @Test
    void 테스트케이스1() {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result = {5, 6, 3};

        assertThat(numberAtK.solution(array, commands)).isEqualTo(result);
    }
}

//[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]