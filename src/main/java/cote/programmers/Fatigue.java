package cote.programmers;

public class Fatigue {
    private int answer = 0;
    /**
     * @param k, 현재 피로도
     * @param dungeons, 각 던전별 "최소 필요 피로도", "소모 피로도"
     * @return 유저가 탐험할 수 있는 최대 던전 수
     */
    public int solution(int k, int[][] dungeons) {
        boolean[] check = new boolean[dungeons.length];

        findMaxDungeons(0, k, dungeons, check);

        return answer;
    }

    private void findMaxDungeons(int level, int fatigue, int[][] dungeons, boolean[] check) {
        if (answer == dungeons.length) return;
        if (fatigue < 0) return;
        if (level > answer) {
            answer = level;
            System.out.println("answer = " + answer);
        }
        for (int cur = 0; cur < dungeons.length; cur++) {
            if (!check[cur] && dungeons[cur][0] <= fatigue) {
                check[cur] = true;
                findMaxDungeons(level + 1, fatigue - dungeons[cur][1], dungeons, check);
                check[cur] = false;
            }
        }
    }
}
