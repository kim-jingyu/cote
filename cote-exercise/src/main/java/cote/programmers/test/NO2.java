package cote.programmers.test;

public class NO2 {
    private boolean[] isVisited = new boolean[100];
    private int[][] relationshipMap;
    private int answer = 0;
    public int solution(int[][] relationships, int target, int limit) {
        relationshipMap = relationships;

        for (int i = 0; i < relationshipMap.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (relationshipMap[i][j] == target) {
                    int friend1 = relationshipMap[i][1-j];
                    if (isVisited[friend1]) continue;
                    answer += 5;
                    isVisited[friend1] = true;
                    calculate(i + 1, 1, friend1, limit);
                }
            }
        }

        return answer;
    }

    private void calculate(int current, int level, int target, int limit) {
        if (level == limit) {
            return;
        }
        for (int i = current; i < relationshipMap.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (relationshipMap[i][j] == target) {
                    int friend2 = relationshipMap[i][1-j];
                    if (isVisited[friend2]) continue;
                    answer += 11;
                    isVisited[friend2] = true;
                    calculate(i + 1, level + 1, friend2, limit);
                }
            }
        }
    }


}
