package book.ch7.arrange_string_descending;

public class ArrangeStringDescendingV0 implements ArrangeStringDescending{
    @Override
    public String solution(String s) {
        return s.chars()
                .boxed()
                .sorted((v1, v2) -> v2 - v1)
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }
}
