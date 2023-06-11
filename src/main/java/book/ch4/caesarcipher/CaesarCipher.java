package book.ch4.caesarcipher;

class CaesarCipher {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (char value : s.toCharArray()) {
            answer.append(push(n, value));
        }

        return answer.toString();
    }

    private char push(int n, char value) {
        if (!Character.isAlphabetic(value)) {
            return value;
        }

        int offset = Character.isLowerCase(value) ? 'a' : 'A';
        int position = value - offset;

        position = (position + n) % 26;

        return (char) (offset + position);
    }
}
