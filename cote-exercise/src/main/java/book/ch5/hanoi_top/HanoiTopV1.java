package book.ch5.hanoi_top;

import java.util.ArrayList;
import java.util.List;

// (n, from, to)
public class HanoiTopV1 implements HanoiTop{

    @Override
    public int[][] solution(int n) {
        List<int[]> process = new ArrayList<>();
        getTop(n, 1, 3, process);

        return process.toArray(new int[0][]);
    }

    private void getTop(int n, int from, int to, List<int[]> process) {
        if (n == 1) {
            process.add(new int[]{from, to});
            return;
        }

        int empty = 6 - from - to;

        getTop(n - 1, 1, empty, process);
        getTop(1, 1, 3, process);
        getTop(n - 1, empty, 3, process);
    }
}
