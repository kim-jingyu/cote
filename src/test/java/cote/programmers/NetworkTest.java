package cote.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class NetworkTest {
    private Network network;

    public NetworkTest() {
        network = new Network();
    }

    @Test
    void 테스트케이스1(){
        int n = 3;
        int[][] computers = {{1,1,0},{1,1,0},{0,0,1}};

        assertThat(network.solution(n,computers)).isEqualTo(2);
    }

    @Test
    void 테스트케이스2(){
        int n = 3;
        int[][] computers = {{1,1,0},{1,1,1},{0,1,1}};

        assertThat(network.solution(n,computers)).isEqualTo(1);
    }
}

//| n | computers | return |
//        | --- | --- | --- |
//        | 3 | [[1, 1, 0], [1, 1, 0], [0, 0, 1]] | 2 |
//        | 3 | [[1, 1, 0], [1, 1, 1], [0, 1, 1]] | 1 |