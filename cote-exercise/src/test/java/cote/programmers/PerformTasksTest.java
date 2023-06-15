package cote.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PerformTasksTest {
    PerformTasks pt = new PerformTasks();

    @Test
    void test1() {
        assertThat(pt.solution(new String[][]{{"korean", "11:40", "30"}, {"english", "12:10", "20"}, {"math", "12:30", "40"}})).isEqualTo(new String[]{"korean", "english", "math"});
    }

    @Test
    void test2() {
        assertThat(pt.solution(new String[][]{{"science", "12:40", "50"}, {"music", "12:20", "40"}, {"history", "14:00", "30"}, {"computer", "12:30", "100"}})).isEqualTo(new String[]{"science", "history", "computer", "music"});
    }

    @Test
    void test3() {
        assertThat(pt.solution(new String[][]{{"aaa", "12:00", "20"}, {"bbb", "12:10", "30"}, {"ccc", "12:40", "10"}})).isEqualTo(new String[]{"bbb", "ccc", "aaa"});
    }
}