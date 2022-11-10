package cote.inflearn.greedy;

import java.util.*;

class Lecture implements Comparable<Lecture> {
    int money, date;

    Lecture(int money, int date) {
        this.money = money;
        this.date = date;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.date - this.date;
    }
}

public class MostIncomeSchedule {

    private static int n, max = Integer.MIN_VALUE;
    private PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

    public int solution(List<Lecture> list) {
        Collections.sort(list);
        int answer = 0;
        int j = 0;
        for (int i = max; i > 0; i--) {
            for (; j < n; j++) {
                if (i > list.get(j).date) break;
                priorityQueue.offer(list.get(j).money);
            }
            if (!priorityQueue.isEmpty()) answer += priorityQueue.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        MostIncomeSchedule mostIncomeSchedule = new MostIncomeSchedule();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        List<Lecture> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int money = sc.nextInt();
            int date = sc.nextInt();
            list.add(new Lecture(money, date));
            max = Math.max(date, max);
        }

        System.out.println(mostIncomeSchedule.solution(list));
    }
}
