package book.ch4.naturalnumtoarr;

class NaturalNumToArrV1 {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder();
        return sb.append(Long.toString(n)).reverse().toString().chars()
                .map(c -> Integer.parseInt(String.valueOf(c - '0')))
                .toArray();
    }
}
