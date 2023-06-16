package book.ch3.checkingdistancing;

class CheckingDistancingV1 {
    private static final int[] dx = {0, 1, -1, 0};
    private static final int[] dy = {1, 0, 0, -1};

    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        int cnt = 0;

        for (String[] place : places) {
            if (isAnswer(place)) {
                answer[cnt] = 1;
            } else {
                answer[cnt] = 0;
            }
            cnt++;
        }

        return answer;
    }

    private boolean isAnswer(String[] place) {
        char[][] map = new char[place.length][place[0].length()];

        for (int i = 0; i < place[0].length(); i++) {
            map[i] = place[i].toCharArray();
        }

        for (int y = 0; y < place.length; y++) {
            for (int x = 0; x < place[y].length(); x++) {
                if (map[y][x] == 'P') {
                    for (int i = 0; i < 4; i++) {
                        int nx = x + dx[i];
                        int ny = y + dy[i];

                        if (nx == -1 || ny == -1 || nx == place[0].length() || ny == place.length) continue;

                        if (map[ny][nx] == 'O') {
                            if (isNextP(place, map, i, nx, ny)) {
                                return false;
                            }

                        }

                        if (map[ny][nx] == 'P') return false;
                    }
                }
            }
        }

        return true;
    }

    private boolean isNextP(String[] place, char[][] map, int i, int nx, int ny) {
        for (int j = 0; j < 4; j++) {
            int nnx = nx + dx[j];
            int nny = ny + dy[j];

            if (nnx == -1 || nny == -1 || nnx == place[0].length() || nny == place.length || i +j == 3) continue;

            if (map[nny][nnx] == 'P') return true;
        }
        return false;
    }
}
