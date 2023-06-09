package book.ch2.matrixmultiplication;

public class MatrixMultiplication {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int y = arr1.length;
        int x = arr2[0].length;

        int[][] map = new int[y][x];

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = 0;
                for (int k = 0; k < arr1[i].length; k++) {
                    map[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return map;
    }
}
