package book.ch4.pyinstring;

class PyInStringV1 {
    boolean solution(String s) {
        s.toLowerCase();

        int p = s.length() - s.replace("p", "").length();
        int y = s.length() - s.replace("y", "").length();

        return p == y;
    }
}
