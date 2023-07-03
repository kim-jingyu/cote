package book.ch7.menu_rewal;

import java.util.*;
import java.util.stream.Collectors;

public class MenuRenewalV0 implements MenuRenewal{
    private static class Course {
        String course;
        int occurrences;

        public Course(String course, int occurrences) {
            this.course = course;
            this.occurrences = occurrences;
        }
    }

    /**
     * @param nextMenu          포함 여부를 결정할 메뉴
     * @param selectedMenus     현재까지 선택한 메뉴 정보
     * @param orderList         주문 목록 -> 메뉴 조합이 주문 목록에서 얼마나 등장하는지
     * @param courses           코스 저장
     */
    private void getCourse(char nextMenu, Set<String> selectedMenus, List<Set<String>> orderList, Map<Integer, List<Course>> courses) {
        // 현재까지 조합한 메뉴들의 등장 횟수
        int occurrences = (int) orderList.stream()
                .filter(order -> order.containsAll(selectedMenus)) // 이 검사를 통과한 주문 목록들의 개수가 현재까지 구한 메뉴 조합의 등장 횟수가 된다.
                .count();
        if (occurrences < 2) return;

        int size = selectedMenus.size();
        if (size > 10) return;

        if (courses.containsKey(size)) {
            List<Course> courseList = courses.get(size);
            Course course = new Course(selectedMenus.stream().sorted().collect(Collectors.joining("")), occurrences);
            Course original = courseList.get(0);
            if (original.occurrences < occurrences) {
                courseList.clear();
                courseList.add(course);
            } else if (original.occurrences == occurrences) {
                courseList.add(course);
            }
        }

        for (char menuChar = nextMenu; menuChar <= 'Z'; menuChar++) {
            String menu = String.valueOf(menuChar);
            selectedMenus.add(menu);
            getCourse((char) (menuChar + 1), selectedMenus, orderList, courses);
            selectedMenus.remove(menu);
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

        getCourse('A', new HashSet<>(), orderList, courses);

        return courses.values().stream()
                .filter(list -> list.get(0).occurrences > 0)
                .flatMap(List::stream)
                .map(c -> c.course)
                .sorted()
                .toArray(String[]::new);
    }
}
