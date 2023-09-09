package cote.topcoder;

import java.util.Map;

public class InterestingParty {
    public int bestInvitation(String[] first, String[] second) {
        int answer = 0;

        for (int i = 0; i < first.length; i++) {
            String currentFirst = first[i];
            String currentSecond = second[i];

            int currentFirstCount = 0;
            int currentSecondCount = 0;

            for (int j = 0; j < first.length; j++) {
                if (currentFirst.equals(first[j])) currentFirstCount++;
                if (currentFirst.equals(second[j])) currentFirstCount++;
                if (currentSecond.equals(first[j])) currentSecondCount++;
                if (currentSecond.equals(second[j])) currentSecondCount++;
            }

            answer = Math.max(answer, currentFirstCount);
            answer = Math.max(answer, currentSecondCount);
        }

        return answer;
    }
}
