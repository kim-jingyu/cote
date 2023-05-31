package cote.programmers;

import java.util.*;

public class MiningMinerals {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;

        Queue<String> queue = new LinkedList<>();
        for (String mineral : minerals) {
            queue.offer(mineral);
        }

        for (int i = 0; i < picks.length; i++) {
            // 곡괭이가 dia 용 일때,
            if (i == 0) {
                for (int j = 0; j < picks[i]; j++) {
                    for (int k = 0; k < 5; k++) {
                        if (queue.isEmpty()) break;
                        String mineral = queue.poll();
                        answer++;
                    }
                    if (queue.isEmpty()) break;
                }
            } else if (i == 1) {
                for (int j = 0; j < picks[i]; j++) {
                    for (int k = 0; k < 5; k++) {
                        if (queue.isEmpty()) break;
                        String mineral = queue.poll();
                        if (mineral.equals("diamond")) {
                            answer += 5;
                        } else {
                            answer++;
                        }
                    }
                    if (queue.isEmpty()) break;
                }
            } else {
                for (int j = 0; j < picks[i]; j++) {
                    for (int k = 0; k < 5; k++) {
                        if (queue.isEmpty()) break;
                        String mineral = queue.poll();
                        if (mineral.equals("diamond")) {
                            answer += 25;
                        } else if (mineral.equals("iron")) {
                            answer += 5;
                        } else {
                            answer++;
                        }
                    }
                    if (queue.isEmpty()) break;
                }
            }
            if (queue.isEmpty()) break;
        }

        return answer;
    }
}