package cote.programmers;

import java.util.*;

import static java.util.Collections.*;

public class MiningMinerals {
    static class Mineral implements Comparable<Mineral>{
        List<String> minerals = new ArrayList<>();

        public Mineral() {
        }

        public List<String> getMinerals() {
            return minerals;
        }

        public void setMinerals(List<String> minerals) {
            this.minerals = minerals;
        }

        @Override
        public int compareTo(Mineral o) {
            if (frequency(this.minerals, "diamond") == frequency(o.minerals, "diamond")) {
                if (frequency(this.minerals, "iron") == frequency(o.minerals, "iron")) {
                    return frequency(o.minerals, "stone") - frequency(this.minerals, "stone");
                } else {
                    return frequency(o.minerals, "iron") - frequency(this.minerals, "iron");
                } 
            } else {
                return frequency(o.minerals, "diamond") - frequency(this.minerals, "diamond");
            } 
        }
    } 
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;

        // 전처리

        // 1. 광물을 5개씩 묶는다.
        List<Mineral> subsets = new ArrayList<>();
        for (int i = 0; i < minerals.length / 5 + 1; i++) {
            subsets.add(new Mineral());
        }

        for (int i = 0; i < minerals.length / 5 + 1; i++) {
            Mineral mineral = subsets.get(i);
            List<String> list = new ArrayList<>();
            for (int j = (i * 5); j < 5 + (i * 5); j++) {
                if (j == minerals.length) break;
                list.add(minerals[j]);
            }
            mineral.setMinerals(list);
        }

        // 2. 광물의 수가 5로 나누었을 때, 0으로 나누어 떨어지면 맨 뒤의 리스트는 필요 없으므로 삭제한다.
        if ((minerals.length % 5) == 0) {
            subsets.remove(subsets.size() - 1);
        }

        // 3. 자원의 개수 > 곡괭이 수일때, 캐지못하는 미네랄은 삭제한다.
        int pickaxes = picks[0] + picks[1] + picks[2]; // 곡괭이 수
        if (pickaxes < subsets.size()) {
            int restMinerals = subsets.size() - pickaxes;
            for (int i = 0; i < restMinerals; i++) {
                subsets.remove(subsets.size() - 1);
            }
        }

        // 4. 다이아, 철, 돌 개수 순으로 리스트를 내림차순으로 정렬한다.
        Collections.sort(subsets);

        // 후처리

        // 5. 다이아 곡괭이로 채광한다.
        for (int i = 0; i < picks[0]; i++) {
            if (subsets.isEmpty()) break;
            Mineral mineral = subsets.get(0);
            List<String> findMinerals = mineral.getMinerals();
            for (int j = 0; j < findMinerals.size(); j++) {
                answer++;
            }
            subsets.remove(0);
        }

        // 6. 철 곡괭이로 채광한다.
        for (int i = 0; i < picks[1]; i++) {
            if (subsets.isEmpty()) break;
            Mineral mineral = subsets.get(0);
            List<String> findMinerals = mineral.getMinerals();
            for (int j = 0; j < findMinerals.size(); j++) {
                if (findMinerals.get(j).equals("diamond")) {
                    answer += 5;
                } else {
                    answer++;
                }
            }
            subsets.remove(0);
        }

        // 7. 돌 곡괭이로 채광한다.
        for (int i = 0; i < picks[2]; i++) {
            if (subsets.isEmpty()) break;
            Mineral mineral = subsets.get(0);
            List<String> findMinerals = mineral.getMinerals();
            for (int j = 0; j < findMinerals.size(); j++) {
                if (findMinerals.get(j).equals("diamond")) {
                    answer += 25;
                } else if (findMinerals.get(j).equals("iron")) {
                    answer += 5;
                } else {
                    answer++;
                }
            }
            subsets.remove(0);
        }

        return answer;
    }
}