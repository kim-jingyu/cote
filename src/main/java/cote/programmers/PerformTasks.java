package cote.programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

class PerformTasks{
    static class Task implements Comparable<Task>{
        private String name;
        private Integer start;
        private Integer playtime;

        public Task(String name, String start, String playtime) {
            this.name = name;
            String[] splitStart = start.split(":");
            this.start = Integer.parseInt(splitStart[0]) * 60 + Integer.parseInt(splitStart[1]);
            this.playtime = Integer.parseInt(playtime);
        }

        public Task(String name, Integer playtime) {
            this.name = name;
            this.playtime = playtime;
        }

        public Task(String[] plan) {
            this(plan[0], plan[1], plan[2]);
        }

        @Override
        public int compareTo(Task o) {
            return this.start - o.start;
        }
    }
    public String[] solution(String[][] plans) {
        List<String> answer = new ArrayList<>();

        // 잠시 멈춘 과제들
        Stack<Task> remainingTasks = new Stack<>();

        // 시작시간 기준 오름차순 우선순위 큐
        PriorityQueue<Task> pq = new PriorityQueue<>();

        for (String[] plan : plans) {
            Task task = new Task(plan);
            pq.add(task);
        }

        while (!pq.isEmpty()) {
            Task curTask = pq.poll();

            int currentTime = curTask.start;

            // 새로운 과제가 남아있는 경우
            if (!pq.isEmpty()) {
                Task nextTask = pq.peek();

                // 과제 진행중에 새로운 과제 시작시간이 된 경우, (새로운 과제 시작시간 < 지금 과제가 끝나는 시간)
                if (nextTask.start < curTask.start + curTask.playtime) {
                    // 현재 진행중인 과제를 잠시 멈춘다.
                    int gap = nextTask.start - currentTime;
                    remainingTasks.add(new Task(curTask.name, curTask.playtime - gap));
                }
                // 지금 과제가 끝나면 새로운 과제를 시작할 시간인 경우
                else if (nextTask.start == curTask.start + curTask.playtime) {
                    // 과제 완료
                    answer.add(curTask.name);
                }
                // 진행중인 과제와 새로운 과제의 시간이 겹치지 않는 경우, (새로운 과제 시작시간 > 지금 과제가 끝나는 시간)
                else {
                    // 과제 완료
                    answer.add(curTask.name);
                    currentTime += curTask.playtime;

                    // 잠시 멈춘 과제가 있는 경우, 남는 시간동안 멈췄던 과제를 해결한다.
                    while (!remainingTasks.isEmpty()) {
                        Task remainingTask = remainingTasks.pop();

                        // 다음 새로운 과제 시작전까지 다 끝낼 수 있는 경우, 과제 완료
                        if (remainingTask.playtime + currentTime <= nextTask.start) {
                            answer.add(remainingTask.name);
                            currentTime += remainingTask.playtime;
                        }
                        // 다음 새로운 과제 시작전까지 못 끝내는 경우, 추가로 진행한 시간만 빼서 다시 stack 에 추가
                        else {
                            int gap = nextTask.start - currentTime;
                            remainingTasks.add(new Task(remainingTask.name, remainingTask.playtime - gap));
                            break;
                        }
                    }
                }
            }
            // 새로운 과제가 더이상 없는 경우
            else {
                // 잠시 멈춘 과제도 없는 경우,
                if (remainingTasks.isEmpty()) {
                    answer.add(curTask.name);
                    currentTime += curTask.playtime;
                }
                // 남아있는 과제는 있는 경우,
                else {
                    answer.add(curTask.name);

                    while (!remainingTasks.isEmpty()) {
                        Task remainingTask = remainingTasks.pop();
                        answer.add(remainingTask.name);
                    }
                }
            }
        }

        return answer.toArray(String[]::new);
    }
}
