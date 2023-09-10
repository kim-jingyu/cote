package cote.topcoder;

public class FriendScore {
    public int highestScore(String[] friends) {
        int answer = 0;

        for (int i = 0; i < friends.length; i++) {
            int score = 0;
            for (int j = 0; j < friends.length; j++) {
                if (i == j) continue;

                if (friends[i].charAt(j) == 'Y') {
                    score++;
                } else {
                    for (int k = 0; k < friends.length; k++) {
                        if (friends[k].charAt(i) == 'Y' && friends[j].charAt(k) == 'Y') {
                            score++;
                            break;
                        }
                    }
                }
            }
            answer = Math.max(answer, score);
        }

        return answer;
    }
}
