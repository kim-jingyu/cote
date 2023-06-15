package cote.inflearn.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Time implements Comparable<Time> {
    int start, end;

    Time(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Time o) {
        if (this.end == o.end) return this.start - o.start;
        else return this.end - o.end;
    }
}

public class ConferenceRoom {
    public int solution(List<Time> list) {
        int cnt = 0;
        int end = Integer.MIN_VALUE;
        Collections.sort(list);
        for (Time time : list) {
            if (time.start >= end) {
                end = time.end;
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        ConferenceRoom conferenceRoom = new ConferenceRoom();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Time> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            list.add(new Time(start, end));
        }

        System.out.println(conferenceRoom.solution(list));
    }
}

//5
//        1 4
//        2 3
//        3 5
//        4 6
//        5 7
