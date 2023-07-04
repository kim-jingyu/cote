package book.ch7.menu_rewal;

import java.util.*;
import java.util.stream.Collectors;

public class MenuRenewalV1 implements MenuRenewal{
    private static class Course{
        String course;
        int occurrences;

        public Course(String course, int occurrences) {
            this.course = course;
            this.occurrences = occurrences;
        }

        @Override
        public String toString() {
            return "Course{" +
                    "course='" + course + '\'' +
                    ", occurrences=" + occurrences +
                    '}';
        }
    }

    private void getCourses(char nextMenu, Set<String> selectedMenus, List<Set<String>> orderList, Map<Integer, List<Course>> courses) {
        int occurrences = (int) orderList.stream()
                .filter(order -> order.containsAll(selectedMenus))
                .count();
        if (occurrences < 2) return;

        int size = selectedMenus.size();
        if (courses.containsKey(size)) {
            List<Course> courseList = courses.get(size);
            Course originalCourse = courseList.get(0);

            Course newCourse = new Course(selectedMenus.stream()
                    .sorted()
                    .collect(Collectors.joining("")), occurrences);

            if (originalCourse.occurrences < newCourse.occurrences) {
                courseList.clear();
                courseList.add(newCourse);
            } else if (originalCourse.occurrences == newCourse.occurrences) {
                courseList.add(newCourse);
            }
        }

        if (size >= 10) return;

        for (char menu = nextMenu; menu <= 'Z'; menu++) {
            String menuString = String.valueOf(menu);
            selectedMenus.add(menuString);
            getCourses((char) (menu +1), selectedMenus, orderList, courses);
            selectedMenus.remove(menuString);
        }
    }

    @Override
    public String[] solution(String[] orders, int[] course) {
        List<Set<String>> orderList = Arrays.stream(orders)
                .map(String::chars)
                .map(charStream -> charStream
                        .mapToObj(menu -> String.valueOf((char) menu))
                        .collect(Collectors.toSet()))
                .collect(Collectors.toList());

        Map<Integer, List<Course>> courses = new HashMap<>();
        for (int length : course) {
            List<Course> list = new ArrayList<>();
            list.add(new Course("", 0));
            courses.put(length, list);
        }
        getCourses('A', new HashSet<>(), orderList, courses);

        return courses.values().stream()
                .filter(list -> list.get(0).occurrences > 0)
                .flatMap(List::stream)
                .map(c -> c.course)
                .sorted()
                .toArray(String[]::new);
    }
}
