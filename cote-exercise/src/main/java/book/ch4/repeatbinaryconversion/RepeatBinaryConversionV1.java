package book.ch4.repeatbinaryconversion;

class RepeatBinaryConversionV1 {
    public int[] solution(String s) {
        int loop = 0;
        int removedZeros = 0;

        while (!s.equals("1")) {
            loop++;
            int zeros = getZeros(s);
            removedZeros += zeros;

            int ones = s.length() - zeros;
            s = Integer.toString(ones, 2);
        }

        return new int[]{loop, removedZeros};
    }

    private int getZeros(String s) {
        int zeros = 0;
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (c == '0') zeros++;
        }
        return zeros;
    }
}
