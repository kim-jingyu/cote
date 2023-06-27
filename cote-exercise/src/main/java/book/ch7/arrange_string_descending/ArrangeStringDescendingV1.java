package book.ch7.arrange_string_descending;

import java.util.stream.Collectors;

public class ArrangeStringDescendingV1 implements ArrangeStringDescending{
    @Override
    public String solution(String s) {
        return s.chars()
                .boxed()
                .sorted((v1,v2) -> v2 - v1)
                .map(c -> String.valueOf((char) c.intValue()))
                .collect(Collectors.joining(""));
    }
}
