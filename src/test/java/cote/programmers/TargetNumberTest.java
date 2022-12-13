package cote.programmers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class TargetNumberTest {

    private TargetNumber targetNumber;

    public TargetNumberTest() {
        targetNumber = new TargetNumber();
    }

    @Test
    void 솔루션1() {
        int[] input1 = new int[]{1, 1, 1, 1, 1};
        int target1 = 3;
        assertThat(targetNumber.solution(input1, target1)).isEqualTo(5);
    }

    @Test
    void 솔루션2(){
        int[] input2 = new int[]{4, 1, 2, 1};
        int target2 = 4;
        assertThat(targetNumber.solution(input2, target2)).isEqualTo(2);
    }
}