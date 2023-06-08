package book.ch2.intersectionstar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MakingStarAtIntersection {
    private static class Point {
        public final long x, y;

        private Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    public String[] solution(int[][] line) {
        List<Point> points = getPoints(line);

        // 2. 저장된 정수들 중 최대, 최소값 구하기
        Point minimumPoint = getMinimumPoint(points);
        Point maximumPoint = getMaximumPoint(points);

        char[][] arr = getArr(minimumPoint, maximumPoint);

        makeStars(points, minimumPoint, maximumPoint, arr);

        String[] result = getResult(arr);

        return result;
    }

    private List<Point> getPoints(int[][] line) {
        List<Point> points = new ArrayList<>();
        // 1. 모든 직선 쌍에 대해 반복
        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {
                // A. 교점 좌표 구하기
                Point intersection = intersection(line[i][0], line[i][1], line[i][2], line[j][0], line[j][1], line[j][2]);

                // B. 정수 좌표만 저장하기
                if (intersection == null) continue;
                points.add(intersection);
            }
        }
        return points;
    }

    private Point intersection(long a1, long b1, long c1, long a2, long b2, long c2) {
        // 교점 구해서 반환하기
        double x = (double) ((b1 * c2) - (b2 * c1)) / ((a1 * b2) - (b1 * a2));
        double y = (double) ((a2 * c1) - (a1 * c2)) / ((a1 * b2) - (b1 * a2));

        // 정수일 때만 반환하기
        if (x%1 != 0 || y%1 != 0) return null;

        return new Point((long) x, (long) y);
    }

    private Point getMaximumPoint(List<Point> points) {
        long maxX = Long.MIN_VALUE;
        long maxY = Long.MIN_VALUE;

        for (Point p : points) {
            if (p.x > maxX) maxX = p.x;
            if (p.y > maxY) maxY = p.y;
        }

        return new Point(maxX, maxY);
    }

    private Point getMinimumPoint(List<Point> points) {
        long minX = Long.MAX_VALUE;
        long minY = Long.MAX_VALUE;

        for (Point p : points) {
            if (p.x < minX) minX = p.x;
            if (p.y < minY) minY = p.y;
        }

        return new Point(minX, minY);
    }

    private char[][] getArr(Point minimumPoint, Point maximumPoint) {
        // 3. 구한 최대, 최소값을 이용하여 2차원 배열의 크기 결정
        int width = (int) (maximumPoint.x - minimumPoint.x + 1);
        int height = (int) (maximumPoint.y - minimumPoint.y + 1);

        char[][] arr = new char[height][width];
        for (char[] row : arr) {
            Arrays.fill(row, '.');
        }
        return arr;
    }

    private void makeStars(List<Point> points, Point minimumPoint, Point maximumPoint, char[][] arr) {
        // 4. 2차원 배열에 * 표시
        for (Point p : points) {
            int x = (int) (p.x - minimumPoint.x);
            int y = (int) (maximumPoint.y - p.y);

            arr[y][x] = '*';
        }
    }
    private String[] getResult(char[][] arr) {
        // 5. 문자열 배열로 변환 후 반환
        int i = 0;
        String[] result = new String[arr.length];
        for (char[] chars : arr) {
            result[i] = new String(chars);
            i++;
        }
        return result;
    }
}