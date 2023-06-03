package cote.programmers;

import java.util.*;

public class HotelRoomOnHire {
    static class Booking implements Comparable<Booking>{
        int start, end;

        public Booking(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Booking o) {
            return this.start - o.start;
        }
    }
    public int solution(String[][] book_time) {
        int answer = 0;

        List<Booking> bookings = new ArrayList<>();

        for (String[] strings : book_time) {
            int start = getTime(strings[0].split(":"));
            int end = getTime(strings[1].split(":"));
            bookings.add(new Booking(start, end));
        }

        Collections.sort(bookings);

        boolean[] visited = new boolean[bookings.size()];
        int endTime = 24 * 60;

        for (int i = 0; i < bookings.size(); i++) {
            Booking curBooking = bookings.get(i);

            if (visited[i]) continue;


            // 새로운 객실을 사용해야 하는 경우
            if (curBooking.start < endTime + 10) {
                visited[i] = true;
                answer++;
                endTime = curBooking.end;
            }

            // 해당 객실에 다음 손님을 받을 수 있는 경우
            for (int j = i + 1; j < bookings.size(); j++) {
                Booking nextBooking = bookings.get(j);

                if (nextBooking.start >= endTime + 10){
                    visited[j] = true;
                    endTime = nextBooking.end;
                }
            }
        }

        return answer;
    }

    private int getTime(String[] split) {
        int hour = Integer.parseInt(split[0]) * 60;
        int min = Integer.parseInt(split[1]);
        return hour + min;
    }
}
