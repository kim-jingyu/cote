package book.ch5.hanoi_top;

import java.util.ArrayList;
import java.util.List;

class HanoiTop {
    public int[][] solution(int n) {
        List<int[]> process = new ArrayList<>();
        getAnswer(n, 1, 3, process);

        return process.toArray(new int[0][]);
    }

    private void getAnswer(int n, int from, int to, List<int[]> process) {
        if (n == 1) {
            process.add(new int[]{from, to});
            return;
        }

        int empty = 6 - from - to;

        getAnswer(n - 1, from, empty, process);
        getAnswer(1, from, to, process);
        getAnswer(n-1, empty, to, process);
    }
}