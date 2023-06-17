package book.ch4.compressthestring;

import java.util.ArrayList;
import java.util.List;

class CompressStringV1 implements CompressString{
    public int solution(String s) {
        int answer = Integer.MAX_VALUE;

        for (int i = 1; i <= s.length(); i++) {
            List<String> tokens = getTokens(s, i);

            StringBuilder compressed = getCompressed(tokens);

            if (compressed.length() < answer) {
                answer = compressed.length();
            }
        }

        return answer;
    }

    private List<String> getTokens(String s, int length) {
        List<String> tokens = new ArrayList<>();
        for (int start = 0; start < s.length(); start += length) {
            int end = start + length;
            if (end > s.length()) {
                end = s.length();
            }
            tokens.add(s.substring(start, end));
        }
        return tokens;
    }

    private StringBuilder getCompressed(List<String> tokens) {
        StringBuilder sb = new StringBuilder();
        String last = "";
        int cnt = 0;
        for (String token : tokens) {
            if (token.equals(last)) {
                cnt++;
            } else {
                if (cnt > 1) sb.append(cnt);
                sb.append(last);
                last = token;
                cnt = 1;
            }
        }
        if (cnt > 1) sb.append(cnt);
        sb.append(last);
        return sb;
    }
}
