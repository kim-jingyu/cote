package cote.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerGridDivision {
    private int result;
    public int solution(int n, int[][] wires) {
        int answer = -1;
        // 결과 리스트
        List<Integer> results = new ArrayList<>();

        // for 문 돌려서 리스트로 만듦
        for (int i = 0; i < wires.length; i++) {
            List<int[]> newWires = new ArrayList<>(Arrays.asList(wires));
            boolean[] checkWires = new boolean[wires.length];
            boolean[] checkTowers = new boolean[n];
            result = 0;
            // 전선 끊음
            newWires.remove(i);
            results.add(findLeastNumberOfTower(0, newWires, checkWires, checkTowers));
        }

//        for (Integer result : results) {
//            System.out.println("result = " + result);
//        }

        return answer;
    }

    private int findLeastNumberOfTower(int level, List<int[]> wires, boolean[] check, boolean[] checkTowers) {
        if (level > result) {
            result = Math.max(result, level);
            System.out.println("result = " + result);
        }
        else {
            for (int cur = 0; cur < wires.size(); cur++) {
                if (!check[cur] && !checkTowers[wires.get(cur)[0]]) {
                    check[cur] = true;
                    checkTowers[wires.get(cur)[0]] = true;
                    int next = wires.get(cur)[1];
                    findLeastNumberOfTower(level + 1, wires, check, checkTowers);
                    check[cur] = false;
                }
            }
        }
        return result;
    }

}
