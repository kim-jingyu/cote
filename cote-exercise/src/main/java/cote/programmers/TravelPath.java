package cote.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TravelPath {
    public String[] solution(String[][] tickets) {
        List<String> result = new ArrayList<>();
        boolean[] isVisited = new boolean[tickets.length];

        dfs(0, "ICN", "ICN", tickets, isVisited, result);

        Collections.sort(result);

        return result.get(0).split(" ");
    }

    private void dfs(int level, String departure, String path, String[][] tickets, boolean[] isVisited, List<String> answer) {
        if (level == tickets.length) {
            answer.add(path);
            return;
        }
        for (int i = 0; i < tickets.length; i++) {
            if (isVisited[i]) continue;

            if (tickets[i][0].equals(departure)) {
                isVisited[i] = true;
                dfs(level+1, tickets[i][1], path + " " + tickets[i][1], tickets, isVisited, answer);
                isVisited[i] = false;
            }
        }
    }
}