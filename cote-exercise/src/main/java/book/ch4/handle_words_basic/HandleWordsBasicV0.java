package book.ch4.handle_words_basic;

public class HandleWordsBasicV0 implements HandleWordsBasic {
    @Override
    public boolean solution(String s) {
        return s.matches("[0-9]{4}|[0-9]{6}");
    }
}
