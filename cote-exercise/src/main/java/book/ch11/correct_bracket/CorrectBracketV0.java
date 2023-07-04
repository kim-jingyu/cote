package book.ch11.correct_bracket;

import java.util.Stack;

public class CorrectBracketV0 implements CorrectBracket{
    @Override
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            }
            if (c == ')') {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
