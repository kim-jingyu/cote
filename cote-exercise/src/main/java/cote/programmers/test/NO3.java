package cote.programmers.test;

public class NO3 {
    public String[] solution(String[] merchantNames) {
        String[] answer = {};

        for (String merchantName : merchantNames) {
            if (merchantName.contains("[&()\\.,\\-]")) {
                System.out.println("merchantName = " + merchantName);
            }

//            String[] split = merchantName.split("[&()\\.,-]");
//            System.out.println("split[0] = " + split[0]);
        }

        return answer;
    }
}
