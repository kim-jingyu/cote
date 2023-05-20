package cote.swea;

import java.util.Arrays;
import java.util.Scanner;

public class HarvestCrop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();

        for (int i = 1; i <= testcase; i++) {
            int sizeOfFarm = scanner.nextInt();
            int[][] map = new int[sizeOfFarm][sizeOfFarm];
            int answer = 0;

            fillMap(scanner, sizeOfFarm, map);

            answer = getAnswer(sizeOfFarm, map, answer);

            System.out.println("#" + i + " " + answer);
        }
    }

    private static void fillMap(Scanner scanner, int sizeOfFarm, int[][] map) {
        for (int j = 0; j < sizeOfFarm; j++) {
            String next = scanner.next();
            map[j] = Arrays.stream(next.split("")).mapToInt(x -> Integer.parseInt(x)).toArray();
        }
    }

    private static int getAnswer(int sizeOfFarm, int[][] map, int answer) {
        answer = getAnswerOfMiddleLine(sizeOfFarm, map, answer);
        answer = getAnswerOfUpperLine(sizeOfFarm, map, answer);
        answer = getAnswerOfDownLine(sizeOfFarm, map, answer);
        return answer;
    }

    private static int getAnswerOfDownLine(int sizeOfFarm, int[][] map, int answer) {
        int downCount = 1;
        for (int col = sizeOfFarm / 2 + 1; col < sizeOfFarm; col++) {
            for (int row = downCount; row <= sizeOfFarm - 1 - downCount; row++) {
                answer += map[col][row];
            }
            downCount++;
        }
        return answer;
    }

    private static int getAnswerOfUpperLine(int sizeOfFarm, int[][] map, int answer) {
        int upCount = 1;
        for (int col = sizeOfFarm / 2 - 1; col >= 0; col--) {
            for (int row = upCount; row <= sizeOfFarm - 1 - upCount; row++) {
                answer += map[col][row];
            }
            upCount++;
        }
        return answer;
    }

    private static int getAnswerOfMiddleLine(int sizeOfFarm, int[][] map, int answer) {
        for (int value : map[sizeOfFarm / 2]) {
            answer += value;
        }
        return answer;
    }
}
