package book.ch9.player_who_cant_finish;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerWhoCantFinishTest {
    PlayerWhoCantFinish pw = new PlayerWhoCantFinishV0();

    @Test
    void test1() {
        pw.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
    }
}