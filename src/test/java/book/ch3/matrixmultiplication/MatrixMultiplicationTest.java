package book.ch3.matrixmultiplication;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MatrixMultiplicationTest {
    MatrixMultiplication mm = new MatrixMultiplication();

    @Test
    void test1() {
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};

        assertThat(mm.solution(arr1, arr2)).isEqualTo(new int[][]{{15, 15}, {15, 15}, {15, 15}});
    }

    @Test
    void test2() {
        int[][] arr1 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
        int[][] arr2 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};

        assertThat(mm.solution(arr1, arr2)).isEqualTo(new int[][]{{22, 22, 11}, {36, 28, 18}, {29, 20, 14}});
    }
}