package cote.programmers;

import java.util.PriorityQueue;
import java.util.Stack;

class PerformTasks{
    static class Task implements Comparable<Task>{
        private String name;
        private Integer start;
        private Integer playtime;

        public Task(String name, Integer start, Integer playtime) {
            this.name = name;
            this.start = start;
            this.playtime = playtime;
        }

        @Override
        public int compareTo(Task o) {
            return this.start - o.start;
        }
    }
    public String[] solution(String[][] plans) {
        String[] answer = {};

        // 시작시간 기준 오름차순 우선순위 큐
        PriorityQueue<Task> pq = new PriorityQueue<>();

        // 멈춰둔 과제가 여러 개일 경우, 가장 최근에 멈춘 과제부터 시작한다. -> Stack
        Stack<Task> remainingTasks = new Stack<>();

        // plans 배열값 큐에 할당
        for (String[] plan : plans) {
            String name = plan[0];

            String[] split = plan[1].split(":");
            int hour = Integer.parseInt(split[0]);
            int min = Integer.parseInt(split[1]);
            Integer start = hour * 60 + min;

            Integer playtime = Integer.valueOf(plan[2]);

            pq.add(new Task(name, start, playtime));
        }

        while (!pq.isEmpty()) {
            Task currentTask = pq.poll();


        }


        return answer;
    }
}
