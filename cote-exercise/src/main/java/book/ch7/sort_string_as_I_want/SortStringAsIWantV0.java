package book.ch7.sort_string_as_I_want;

import java.util.Arrays;

public class SortStringAsIWantV0 implements SortStringAsIWant{
    @Override
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            if (s1.charAt(n) != s2.charAt(n)) {
                return s1.charAt(n) - s2.charAt(n);
            }
            return s1.compareTo(s2);
        });

        return strings;
    }
}
