package cote.programmers;

import java.util.ArrayList;
import java.util.Collections;

public class MakeMaxNumber {
    public String solution(String number, int k) {
        boolean[] visited = new boolean[number.length()];
        ArrayList<Integer> values = new ArrayList<>();

        dfs(0, 0, number, k, visited, "", values);

        Collections.sort(values);

        return values.get(values.size()-1).toString();
    }

    private void dfs(int level, int cur, String number, int k, boolean[] visited, String tmpNum, ArrayList<Integer> values) {
        if (level == number.length() - k) {
            values.add(Integer.parseInt(tmpNum));
        }
        for (int i = cur; i < number.length(); i++) {
            if (visited[i]) continue;

            visited[i] = true;
            dfs(level+1, i, number, k, visited, tmpNum+number.charAt(i), values);
            visited[i] = false;
        }
    }
}
