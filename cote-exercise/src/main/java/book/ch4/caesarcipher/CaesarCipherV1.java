package book.ch4.caesarcipher;

class CaesarCipherV1 {
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : arr) {
            if (Character.isSpaceChar(c)) {
                sb.append(c);
                continue;
            }

            char offset = (Character.isUpperCase(c)) ? 'A' : 'a';
            int curPos = (c - offset + n) % 26;
            char curChar = (char) (offset + curPos);

            sb.append(curChar);
        }

        return sb.toString();
    }
}
