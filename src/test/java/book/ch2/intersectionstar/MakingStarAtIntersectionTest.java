package book.ch2.intersectionstar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MakingStarAtIntersectionTest {
    MakingStarAtIntersection intersection = new MakingStarAtIntersection();

    @Test
    void test1() {
        int[][] line = {
                {2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}
        };
        String[] result = {"....*....", ".........", ".........", "*.......*", ".........", ".........", ".........", ".........", "*.......*"};

        assertThat(intersection.solution(line)).isEqualTo(result);
    }

}