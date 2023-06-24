package book.ch7.h_index;

import java.util.Arrays;

public class HIndexV0 implements HIndex{
    @Override
    public int solution(int[] citations) {
        int count = 0;
        Arrays.sort(citations);
        for (int i = 1; i <= citations.length; i++) {
            int cur = citations.length - i;
            if (citations[cur] >= i) count++;
        }
        return count;
    }
}
