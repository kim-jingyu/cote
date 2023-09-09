package cote.topcoder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class InterestingPartyTest {


    @Test
    void test1() {
        InterestingParty party = new InterestingParty();

        int answer = party.bestInvitation(new String[]{"fishing", "gardening", "swimming", "fishing"}, new String[]{"hunting", "fishing", "fishing", "biting"});

        assertThat(answer).isEqualTo(4);
    }

    @Test
    void test2() {
        InterestingParty party = new InterestingParty();

        int answer = party.bestInvitation(new String[]{"variety", "diversity", "loquacity", "courtesy"}, new String[]{"talking", "speaking", "discussion", "meeting"});

        assertThat(answer).isEqualTo(1);
    }

    @Test
    void test3() {
        InterestingParty party = new InterestingParty();

        int answer = party.bestInvitation(new String[]{"snakes", "programming", "cobra", "monty"}, new String[]{"python", "python", "anaconda", "python"});

        assertThat(answer).isEqualTo(3);
    }

    @Test
    void test4() {
        InterestingParty party = new InterestingParty();

        int answer = party.bestInvitation(new String[]{"t", "o", "p", "c", "o", "d", "e", "r", "s", "i", "n", "g", "l", "e", "r", "o", "u", "n", "d", "m", "a", "t", "c", "h", "f", "o", "u", "r", "n", "i"}, new String[]{"n", "e", "f", "o", "u", "r", "j", "a", "n", "u", "a", "r", "y", "t", "w", "e", "n", "t", "y", "t", "w", "o", "s", "a", "t", "u", "r", "d", "a", "y"});

        assertThat(answer).isEqualTo(6);
    }
}