package cote.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TravelPath {
    List<String> result;
    String[][] tickets;
    boolean[] visited;

    private void init(String[][] tickets) {
        this.tickets = tickets;
        visited = new boolean[tickets.length];
        result = new ArrayList<>();
    }

    private void dfs(int Level,String departure,String path) {
        if (Level == tickets.length) {
            result.add(path);
            return;
        }
        for (int i = 0; i < tickets.length; i++) {
            if(visited[i]) continue;

            if (departure.equals(tickets[i][0])) {
                visited[i] = true;
                dfs(Level + 1, tickets[i][1], path + " " + tickets[i][1]);
                visited[i] = false;
            }
        }
    }

    public String[] solution(String[][] tickets) {
        init(tickets);
        dfs(0, "ICN", "ICN");
        Collections.sort(result);
        return result.get(0).split(" ");
    }
}
//
//[["ICN", "JFK"], ["HND", "IAD"], ["JFK", "HND"]]	["ICN", "JFK", "HND", "IAD"]
//        [["ICN", "SFO"], ["ICN", "ATL"], ["SFO", "ATL"], ["ATL", "ICN"], ["ATL","SFO"]]	["ICN", "ATL", "ICN", "SFO", "ATL", "SFO"]
