package cote.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class NetworkTest {
    private final Network network = new Network();
    @Test
    void test1() {
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};


        assertThat(network.solution(3, computers)).isEqualTo(2);
    }

    @Test
    void test2() {
        int[][] computers = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};


        assertThat(network.solution(3, computers)).isEqualTo(1);
    }
}