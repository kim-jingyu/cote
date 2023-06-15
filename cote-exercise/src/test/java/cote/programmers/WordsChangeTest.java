package cote.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class WordsChangeTest {

    private WordsChange wordsChange;

    public WordsChangeTest() {
        wordsChange = new WordsChange();
    }

    @Test
    void 테스트케이스1() {
        String givenWord = "hit";
        String targetWord = "cog";
        String[] givenWords = {"hot","dot","dog","lot","log","cog"};

        assertThat(wordsChange.solution(givenWord, targetWord, givenWords)).isEqualTo(4);
    }

    @Test
    void 테스트케이스2() {
        String givenWord = "hit";
        String targetWord = "cog";
        String[] givenWords = {"hot","dot","dog","lot","log"};

        assertThat(wordsChange.solution(givenWord, targetWord, givenWords)).isEqualTo(0);
    }
}

//        | "hit" | "cog" | ["hot", "dot", "dog", "lot", "log", "cog"] | 4 |
//        | "hit" | "cog" | ["hot", "dot", "dog", "lot", "log"] | 0 |