package cote.programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 2023 KAKAO BLIND RECRUITMENT
 * 개인정보 수집 유효기간
 */
public class PrivacyCollectionExDate {
    public int[] solution(String today, String[] terms, String[] privacies) {
        HashMap<String, Integer> arrangedTerm = getArrangedTerm(terms);
        int todayDate = getDate(today);
        List<Integer> answer = getAnswer(privacies, arrangedTerm, todayDate);

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private int getDate(String today) {
        String[] date = today.split("\\.");
        int year = Integer.parseInt(date[0]) * 12 * 28;
        int month = Integer.parseInt(date[1]) * 28;
        int day = Integer.parseInt(date[2]);
        return year + month + day;
    }

    private HashMap<String, Integer> getArrangedTerm(String[] terms) {
        HashMap<String, Integer> arrangedTerm = new HashMap<>();

        for (String term : terms) {
            String[] termData = term.split(" ");
            arrangedTerm.put(termData[0], Integer.parseInt(termData[1]));
        }
        return arrangedTerm;
    }

    private List<Integer> getAnswer(String[] privacies, HashMap<String, Integer> arrangedTerm, int todayDate) {
        List<Integer> answer = new ArrayList<>();
        int counter = 1;
        for (String privacy : privacies) {
            String[] prData = privacy.split(" ");
            int prDate = getDate(prData[0]);
            int termDate = arrangedTerm.get(prData[1]) * 28;

            if (prDate + termDate - 1 < todayDate) {
                answer.add(counter);
            }
            counter++;
        }
        return answer;
    }
}
