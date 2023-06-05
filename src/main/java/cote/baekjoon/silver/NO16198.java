package cote.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 에너지 모으기
class NO16198 {
    /**
     * N: 에너지 구슬의 개수
     * W: 에너지 구슬의 무게
     */
    private static int answer = 0;
    public static void main(String[] args) throws IOException {
        getAnswer(getEnergies(), 0);

        System.out.println(answer);
    }

    private static List<Integer> getEnergies() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> energies = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            energies.add(Integer.parseInt(st.nextToken()));
        }

        br.close();
        return energies;
    }

    private static void getAnswer(List<Integer> energies, int result) {
        if (energies.size() == 2) {
            answer = Math.max(answer, result);
            return;
        }
        for (int i = 1; i < energies.size() - 1; i++) {
            int tempResult = energies.get(i - 1) * energies.get(i + 1);
            int removed = energies.remove(i);
            getAnswer(energies, result + tempResult);
            energies.add(i, removed);
        }

    }
}
