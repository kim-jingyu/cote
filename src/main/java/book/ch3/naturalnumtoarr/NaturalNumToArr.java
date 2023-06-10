package book.ch3.naturalnumtoarr;

public class NaturalNumToArr {
    public int[] solution(long n) {
        String str = Long.toString(n);
        String reversed = new StringBuilder(str).reverse().toString();

        int[] answer = new int[reversed.length()];

        for (int i = 0; i < reversed.length(); i++) {
            answer[i] = Character.getNumericValue(reversed.charAt(i));
        }

        return answer;
    }
}
