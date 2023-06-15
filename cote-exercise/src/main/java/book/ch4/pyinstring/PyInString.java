package book.ch4.pyinstring;

class PyInString {
    boolean solution(String s) {
        s = s.toLowerCase();

        int removingP = s.length() - s.replace("p", "").length();
        int removingY = s.length() - s.replace("y", "").length();

        return removingP == removingY;
    }
}
