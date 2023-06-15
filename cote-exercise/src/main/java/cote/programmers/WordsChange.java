package cote.programmers;

public class WordsChange {

    private int answer;
    private String begin, target;
    private String[] words;
    private boolean[] visited;

    private void init(String begin, String target, String[] words) {
        this.begin = begin;
        this.target = target;
        this.words = words;
        answer = 51;
        visited = new boolean[words.length];
    }

    private void dfs(String presentWord, int count) {
        if (presentWord.equals(target)) {
            answer = Math.min(count,answer);
        }
        else{
            for (int i = 0; i < words.length; i++) {
                if(visited[i]) continue;

                int differentWords = 0;
                for (int j = 0; j < begin.length(); j++) {
                    if(presentWord.charAt(j)!=words[i].charAt(j)) differentWords++;
                }

                if(differentWords == 1){
                    visited[i] = true;
                    dfs(words[i], count+1);
                    visited[i] = false;
                }
            }
        }
    }

    public int solution(String begin, String target, String[] words){
        init(begin, target, words);
        dfs(begin,0);
        return answer == 51 ? 0 : answer;
    }
}


//        | "hit" | "cog" | ["hot", "dot", "dog", "lot", "log", "cog"] | 4 |
//        | "hit" | "cog" | ["hot", "dot", "dog", "lot", "log"] | 0 |