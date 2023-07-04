package book.ch11.rotate_wheel;

import java.util.Stack;

public class RotateWheelV0 implements RotateWheel{
    @Override
    public int solution(String s) {
        char[] str = s.toCharArray();
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if(isCorrect(str, i)) result++;
        }

        return result;
    }

    private boolean isCorrect(char[] str, int offset) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length; i++) {
            char c = str[(i + offset) % str.length];
            switch (c) {
                case '{' -> stack.push('}');
                case '[' -> stack.push(']');
                case '(' -> stack.push(')');
                case ')', ']', '}' -> {
                    if (stack.isEmpty()) return false;
                    if (stack.pop() != c) return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
