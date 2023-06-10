package book.ch3.findsnsfriend;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FindSnsFriendTest {
    FindSnsFriend fsf = new FindSnsFriend();

    @Test
    void test1() {
        String[][] friends = {{"donut", "andole"}, {"donut", "jun"}, {"donut", "mrko"}, {"shakevan", "andole"}, {"shakevan", "jun"}, {"shakevan", "mrko"}};
        String[] visitors = {"bedi", "bedi", "donut", "bedi", "shakevan"};
        assertThat(fsf.solution("mrko", friends, visitors)).isEqualTo(new String[]{"andole", "jun", "bedi"});
    }
}