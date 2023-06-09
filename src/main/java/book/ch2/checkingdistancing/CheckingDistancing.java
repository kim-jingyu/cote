package book.ch2.checkingdistancing;

class CheckingDistancing {
    // 상, 좌, 우 , 하
    private static final int[] dx = {0, -1, 1, 0};
    private static final int[] dy = {1, 0, 0, -1};
    public int[] solution(String[][] places) {
        int waitingRooms = places.length;   // 대기실 개수
        int roomSize = places[0].length;    // 대기실 크기

        int[] answer = new int[waitingRooms];

        for (int i = 0; i < waitingRooms; i++) {
            char[][] room = new char[roomSize][roomSize];
            String[] rows = places[i];

            for (int j = 0; j < roomSize; j++) {
                room[j] = rows[j].toCharArray();
            }

            if (isDistance(room)) {
                answer[i] = 1;
            } else {
                answer[i] = 0;
            }
        }

        return answer;
    }

    private boolean isDistance(char[][] room) {
        for (int y = 0; y < room.length; y++) {
            for (int x = 0; x < room[y].length; x++) {
                if (room[y][x] != 'P') continue;
                if(!isDistance(room, x, y)) return false;
            }
        }
        return true;
    }

    private boolean isDistance(char[][] room, int x, int y) {
        // 맨해튼 거리가 1일때,
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (ny== room.length || ny < 0 || nx == room[ny].length || nx < 0) continue;

            switch (room[ny][nx]) {
                case 'P':   // P가 있으면 거리두기 실패!
                    return false;
                case 'O':   // 빈 테이블이 있으면, 인접한 곳에 다른 응시자가 있는지 검사
                    if(isNextToVolunteer(room, nx, ny, 3-d)) return false;
            }
        }
        return true;
    }

    private boolean isNextToVolunteer(char[][] room, int x, int y, int exclude) {
        // 맨해튼 거리가 2일때,
        for (int d = 0; d < 4; d++) {
            if (d == exclude) continue;

            int nx = x + dx[d];
            int ny = y + dy[d];

            if (ny == room.length || ny < 0 || nx == room[ny].length || nx < 0) continue;

            if (room[ny][nx] == 'P') return true;
        }
        return false;
    }
}
