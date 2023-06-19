package book.ch6.bad_user;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BadUserV0 implements BadUser{
    @Override
    public int solution(String[] user_id, String[] banned_id) {
        Set<List<String>> block_ids = new HashSet<>();
        calculate(user_id, banned_id, new ArrayList<>(), block_ids, new boolean[user_id.length]);

        return 0;
    }

    private void calculate(String[] user_id, String[] banned_id, List<String> blockUsers, Set<List<String>> block_ids, boolean[] isVisited) {
        if (blockUsers.size() == 5) {
            block_ids.add(blockUsers);
            for (String blockUser : blockUsers) {
                System.out.print(blockUser + " ");
            }
            return;
        }

        for (int user = 0; user < user_id.length; user++) {
            if (isVisited[user]) continue;
            for (int banned = 0; banned < banned_id.length; banned++) {
                if (user_id[user].length() == banned_id[banned].length() && isMatch(user_id[user], banned_id[banned])) {
                    isVisited[user] = true;
                    blockUsers.add(user_id[user]);
                    calculate(user_id, banned_id, blockUsers, block_ids, isVisited);
                    isVisited[user] = false;
                }
            }
        }
    }

    private boolean isMatch(String user, String banned) {
        char[] userCharArray = user.toCharArray();
        char[] bannedCharArray = banned.toCharArray();
        for (int i = 0; i < banned.length(); i++) {
            if (bannedCharArray[i] == '*' && userCharArray[i] == 'i') {
                return true;
            }
        }
        return false;
    }
}
