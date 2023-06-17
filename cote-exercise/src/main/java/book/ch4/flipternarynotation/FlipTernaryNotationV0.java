package book.ch4.flipternarynotation;

class FlipTernaryNotationV0 {
    public int solution(int n) {
        String reversed = new StringBuilder(Integer.toString(n, 3)).reverse().toString();
        return Integer.valueOf(reversed, 3);
    }
}
