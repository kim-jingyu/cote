package book.ch12.enforcement_camera;

import java.util.Arrays;
import java.util.Comparator;

public class EnforcementCameraV0 implements EnforcementCamera{
    @Override
    public int solution(int[][] routes) {
        Arrays.sort(routes, Comparator.comparingInt(r -> r[1]));

        int cnt = 0;
        int last = Integer.MAX_VALUE;

        for (int[] route : routes) {
            if (route[0] <= last && last <= route[1]) continue;
            last = route[1];
            cnt++;
        }

        return cnt;
    }
}
