package book.ch4.makestrangewords;

class MakeStrangeWordsV1 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        boolean isUpper = true;

        for (char c : arr) {
            if (Character.isSpaceChar(c)) {
                sb.append(c);
                isUpper = true;
                continue;
            }

            if (isUpper) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
            isUpper = !isUpper;
        }

        return sb.toString();
    }
}
