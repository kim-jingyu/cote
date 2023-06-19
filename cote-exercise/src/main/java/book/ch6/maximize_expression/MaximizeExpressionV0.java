package book.ch6.maximize_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class MaximizeExpressionV0 {
    private static final String[][] precedences = {
            "*-+".split(""),
            "*+-".split(""),
            "-*+".split(""),
            "-+*".split(""),
            "+*-".split(""),
            "+-*".split("")
    };
    public long solution(String expression) {
        long answer = 0;

        StringTokenizer st = new StringTokenizer(expression, "+-*", true);
        List<String> tokens = new ArrayList<>();
        while (st.hasMoreTokens()) {
            tokens.add(st.nextToken());
        }

        for (String[] precedence : precedences) {
            long value = Math.abs(calculate(new ArrayList<>(tokens), precedence));
            if (value > answer) {
                answer = value;
            }
        }

        return answer;
    }

    private long calculate(ArrayList<String> tokens, String[] precedence) {
        for (String operation : precedence) {
            for (int i = 0; i < tokens.size(); i++) {
                if (tokens.get(i).equals(operation)) {
                    long left = Long.parseLong(tokens.get(i - 1));
                    long right = Long.parseLong(tokens.get(i + 1));
                    long result = calculate(left, right, operation);
                    tokens.remove(i-1);
                    tokens.remove(i-1);
                    tokens.remove(i-1);
                    tokens.add(i - 1, String.valueOf(result));
                    i -= 2;
                }
            }
        }
        return Long.parseLong(tokens.get(0));
    }

    private long calculate(long left, long right, String operation) {
        return switch (operation) {
            case "+" -> left + right;
            case "-" -> left - right;
            case "*" -> left * right;
            default -> throw new IllegalStateException("Unexpected value: " + operation);
        };
    }
}
