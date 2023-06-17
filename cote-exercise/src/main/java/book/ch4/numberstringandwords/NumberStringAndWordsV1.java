package book.ch4.numberstringandwords;

public class NumberStringAndWordsV1 implements NumberStringAndWords{
    private static final String[] numbers = {
            "zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };
    @Override
    public int solution(String s) {
        for (int i = 0; i < 10; i++) {
            s = s.replace(numbers[i], Integer.toString(i));
        }

        return Integer.valueOf(s);
    }
}
