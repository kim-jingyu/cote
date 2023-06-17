package book.ch4.flipternarynotation;

public class FlipTernaryNotationV1 implements FlipTernaryNotation{
    public int solution(int n) {
        String reversed = new StringBuilder(Integer.toString(n, 3)).reverse().toString();
        return Integer.parseInt(reversed, 3);
    }
}
