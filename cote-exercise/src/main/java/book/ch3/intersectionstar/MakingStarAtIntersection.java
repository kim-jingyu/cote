package book.ch3.intersectionstar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class MakingStarAtIntersection {
    private static class Point{
        long x, y;

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    public String[] solution(int[][] line) {
        Set<Point> intersections = getIntersections(line);

        Point maxIntersection = getMaxIntersection(intersections);
        Point minIntersection = getMinIntersection(intersections);


        int width = (int) (maxIntersection.x - minIntersection.x + 1);
        int height = (int) (maxIntersection.y - minIntersection.y + 1);

        char[][] rectangle = makeStars(makeRectangle(width, height), intersections, minIntersection, maxIntersection);

        String[] answer = new String[rectangle.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = new String(rectangle[i]);
        }

        return answer;
    }

    private char[][] makeStars(char[][] rectangle, Set<Point> intersections, Point minIntersection, Point maxIntersection) {
        for (Point intersection : intersections) {
            int x = (int) (intersection.x - minIntersection.x);
            int y = (int) (maxIntersection.y - intersection.y);

            rectangle[y][x] = '*';
        }

        return rectangle;
    }

    private Set<Point> getIntersections(int[][] line) {
        Set<Point> intersections = new HashSet<>();

        for (int cur = 0; cur < line.length; cur++) {
            for (int next = cur + 1; next < line.length; next++) {
                Point intersection = getIntersection(line[cur][0], line[cur][1], line[cur][2], line[next][0], line[next][1], line[next][2]);

                if (intersection == null) continue;

                intersections.add(intersection);
            }
        }

        return intersections;
    }

    private Point getIntersection(long a, long b, long e, long c, long d, long f) {
        double x = (double) (b * f - e * d) / (a * d - b * c);
        double y = (double) (e * c - a * f) / (a * d - b * c);

        if ((x % 1 != 0) || (y % 1 != 0)) return null;

        return new Point((long) x, (long) y);
    }

    private Point getMaxIntersection(Set<Point> intersections) {
        long maxX = Long.MIN_VALUE;
        long maxY = Long.MIN_VALUE;

        for (Point intersection : intersections) {
            if (intersection.x > maxX) maxX = intersection.x;
            if (intersection.y > maxY) maxY = intersection.y;
        }

        return new Point(maxX, maxY);
    }

    private Point getMinIntersection(Set<Point> intersections) {
        long minX = Long.MAX_VALUE;
        long minY = Long.MAX_VALUE;

        for (Point intersection : intersections) {
            if (intersection.x < minX) minX = intersection.x;
            if (intersection.y < minY) minY = intersection.y;
        }

        return new Point(minX, minY);
    }


    private char[][] makeRectangle(int width, int height) {
        char[][] arr = new char[height][width];

        for (char[] row : arr) {
            Arrays.fill(row, '.');
        }

        return arr;
    }

}