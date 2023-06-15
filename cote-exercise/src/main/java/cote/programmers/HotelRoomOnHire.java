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
        List<Booking> bookings = new ArrayList<>();

        for (String[] strings : book_time) {
            int start = getTime(strings[0].split(":"));
            int end = getTime(strings[1].split(":"));
            bookings.add(new Booking(start, end));
        }

        Collections.sort(bookings);

        PriorityQueue<Integer> rooms = new PriorityQueue<>();

        for (int i = 0; i < bookings.size(); i++) {
            Booking curBooking = bookings.get(i);

            if (rooms.isEmpty()) {
                rooms.add(curBooking.end);
                continue;
            }

            int earliestEmptyRoom = rooms.peek();
            if (curBooking.start >= earliestEmptyRoom + 10) {
                rooms.poll();
                rooms.add(curBooking.end);
            } else {
                rooms.add(curBooking.end);
            }
        }

        return rooms.size();
    }

    private int getTime(String[] split) {
        int hour = Integer.parseInt(split[0]) * 60;
        int min = Integer.parseInt(split[1]);
        return hour + min;
    }
}
