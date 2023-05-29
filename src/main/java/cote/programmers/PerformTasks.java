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

        public String getName() {
            return name;
        }

        public Integer getStart() {
            return start;
        }

        public Integer getPlaytime() {
            return playtime;
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

        // 잠시 멈춘 과
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

            String curName = currentTask.name;
            Integer curStart = currentTask.start;
            Integer curPlaytime = currentTask.playtime;

            // 새로운 과제를 시작할 시각이 되었을 때, 기존에 진행 중이던 과제가 있다면 진행 중이던 과제를 멈추고 새로운 과제를 시작합니다.

            // 다음 과제가 있으면
            if (!pq.isEmpty()) {
                Task nextTask = pq.poll();

                String nextName = nextTask.name;
                Integer nextStart = nextTask.start;
                Integer nextPlaytime = nextTask.playtime;


            }


        }


        return answer;
    }
}
