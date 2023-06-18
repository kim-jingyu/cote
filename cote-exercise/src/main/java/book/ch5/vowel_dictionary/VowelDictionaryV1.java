package book.ch5.vowel_dictionary;

import java.util.ArrayList;
import java.util.List;

public class VowelDictionaryV1 implements VowelDictionary{
    private static final char[] CHARS = "AEIOU".toCharArray();
    @Override
    public int solution(String word) {
        List<String> words = new ArrayList<>();
        getWord("", words);
        return words.indexOf(word) + 1;
    }

    private void getWord(String word, List<String> words) {
        if (word.length() == 5) return;

        for (char c : CHARS) {
            words.add(word+c);
            getWord(word + c, words);
        }
    }
}
