package book.ch4.makestrangewords;

class MakeStrangeWords {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isUpper = true;

        for (char c : s.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                answer.append(c);
                isUpper = true;
            } else {
                if (isUpper) {
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(Character.toLowerCase(c));
                }
                isUpper = !isUpper;
            }
        }

        return answer.toString();
    }
}
