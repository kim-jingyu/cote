package cote.swea;

import java.util.*;
class GivingPresent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        int answer;

        for (int i = 1; i <= testcase; i++) {
            int n = scanner.nextInt();
            answer = 0;

            List<List<Integer>> list = new ArrayList<>();

            for (int j = 1; j <= n; j++) {
                int len = scanner.nextInt();

                if (j + len <= 0 || j + len > n) continue;

                List<Integer> tmp = new ArrayList<>();
                tmp.add(j);
                tmp.add(j + len);
                list.add(tmp);
            }

            for (int k = 0; k < list.size(); k++) {
                List<Integer> t1 = list.get(k);
                Collections.reverse(t1);
                for (int m = k+1; m < list.size(); m++) {
                    if (t1.equals(list.get(m))) answer++;
                }
            }

            System.out.println("#" + i + " " + answer);
        }
    }
}