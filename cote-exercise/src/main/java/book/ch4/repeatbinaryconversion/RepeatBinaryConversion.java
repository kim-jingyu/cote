package book.ch4.repeatbinaryconversion;

class RepeatBinaryConversion {
    public int[] solution(String s) {
        int removedZeros = 0;
        int level = 0;

        while (!s.equals("1")) {
            StringBuilder sb = new StringBuilder();
            level++;

            // 1. s 문자열의 모든 0을 제거
            for (char c : s.toCharArray()) {
                if (c == '0') removedZeros++;
                else sb.append(c);
            }

            // 2. 문자열의 길이를 구해서 2진법으로 표현하도록 s를 바꾼다.
            int length = sb.length();
            s = Integer.toBinaryString(length);
        }

        // 3. 제거된 0의 개수, s가 1이 될때까지의 변환 과정의 단계를 반환한다.
        return new int[]{level, removedZeros};
    }
}
