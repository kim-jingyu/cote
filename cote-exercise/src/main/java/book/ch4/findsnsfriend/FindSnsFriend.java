package book.ch4.findsnsfriend;

import java.util.*;

public class FindSnsFriend {
    public String[] solution(String user, String[][] friends, String[] visitors) {

        // 1. user 친구 구하기
        List<String> userFriends = getUserFriends(user, friends);

        // 2. user 친구의 친구 구하기
        Map<String, Integer> friendFriends = getFriendFriends(user, friends, userFriends);

        // 3. 방문자들에게 점수 1점씩 부여하기
        for (String visitor : visitors) {
            boolean ch = false;
            for (String userFriend : userFriends) {
                if (visitor.equals(userFriend)) ch = true;
            }
            if (ch) continue;

            makeFriendFriends(friendFriends, visitor, 1);
        }

        List<Map.Entry<String, Integer>> entryList = getEntryList(friendFriends);

        ArrayList<String> answer = getAnswer(entryList);

        return answer.toArray(new String[0]);
    }

    private static List<String> getUserFriends(String user, String[][] friends) {
        List<String> userFriends = new ArrayList<>();

        for (String[] relation : friends) {
            if (relation[0].equals(user)) {
                userFriends.add(relation[1]);
            } else if (relation[1].equals(user)){
                userFriends.add(relation[0]);
            }
        }
        return userFriends;
    }

    private static Map<String, Integer> getFriendFriends(String user, String[][] friends, List<String> userFriends) {
        Map<String, Integer> friendFriends = new HashMap<>();

        for (String[] relation : friends) {
            if (relation[0].equals(user) || relation[1].equals(user)) continue;

            for (String userFriend : userFriends) {
                putValueToFriendFriends(friendFriends, relation, userFriend);
            }
        }
        return friendFriends;
    }

    private static void putValueToFriendFriends(Map<String, Integer> friendFriends, String[] relation, String userFriend) {
        if (userFriend.equals(relation[0])) {
            makeFriendFriends(friendFriends, relation[1], 10);
        } else if (userFriend.equals(relation[1])) {
            makeFriendFriends(friendFriends, relation[0], 10);
        }
    }

    private static void makeFriendFriends(Map<String, Integer> friendFriends, String relation, int value) {
        if (friendFriends.getOrDefault(relation, 0) == 0) {
            friendFriends.put(relation, value);
        } else {
            Integer tmp = friendFriends.get(relation);
            friendFriends.put(relation, tmp + value);
        }
    }

    private static List<Map.Entry<String, Integer>> getEntryList(Map<String, Integer> friendFriends) {
        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(friendFriends.entrySet());
        entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o2.getValue() == o1.getValue()) {
                    return o1.getKey().compareTo(o2.getKey());
                }
                return o2.getValue() - o1.getValue();
            }
        });
        return entryList;
    }

    private static ArrayList<String> getAnswer(List<Map.Entry<String, Integer>> entryList) {
        ArrayList<String> answer = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            answer.add(entry.getKey());
        }
        return answer;
    }
}
