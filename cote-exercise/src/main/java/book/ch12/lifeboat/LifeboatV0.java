package book.ch12.lifeboat;

import java.util.Arrays;

public class LifeboatV0 implements Lifeboat{
    @Override
    public int solution(int[] people, int limit) {
        Arrays.sort(people);

        int cnt = 0;
        int left = 0;
        int right = people.length - 1;

        while (left<=right) {
            if (people[left] + people[right] <= limit) left++;
            right--;
            cnt++;
        }

        return cnt;
    }
}
