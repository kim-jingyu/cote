package cote.inflearn.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class WeddingTime implements Comparable<WeddingTime> {
    int time;
    char state;

    WeddingTime(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(WeddingTime o) {
        if (this.time == o.time) return this.state - o.state;
        else return this.time - o.time;
    }
}

public class Wedding {
    public int solution(List<WeddingTime> list) {
        Collections.sort(list);
        int cnt = 0;
        int max = Integer.MIN_VALUE;
        for (WeddingTime weddingTime : list) {
            if (weddingTime.state == 's') cnt++;
            else cnt--;
            max = Math.max(max, cnt);
        }
        return max;
    }

    public static void main(String[] args) {
        Wedding wedding = new Wedding();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<WeddingTime> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            list.add(new WeddingTime(start, 's'));
            list.add(new WeddingTime(end, 'e'));
        }
        System.out.println(wedding.solution(list));
    }
}
