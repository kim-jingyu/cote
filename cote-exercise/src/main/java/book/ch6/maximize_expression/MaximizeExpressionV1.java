package book.ch6.maximize_expression;

import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class MaximizeExpressionV1 implements MaximizeExpression{
    private static final String[][] operations = {
            "+-*".split(""),
            "+*-".split(""),
            "-+*".split(""),
            "-*+".split(""),
            "*-+".split(""),
            "*+-".split("")
    };
    @Override
    public long solution(String expression) {
        long max = 0;

        StringTokenizer st = new StringTokenizer(expression, "+-*", true);
        List<String> originalTokens = new LinkedList<>();
        while (st.hasMoreTokens()) {
            originalTokens.add(st.nextToken());
        }

        for (String[] operation : operations) {
            List<String> tokens = new LinkedList<>(originalTokens);
            for (String op : operation) {
                for (int i = 0; i < tokens.size(); i++) {
                    if (tokens.get(i).equals(op)) {
                        long prev = Long.parseLong(tokens.get(i - 1));
                        long next = Long.parseLong(tokens.get(i + 1));
                        long result = calculate(prev, next, op);

                        tokens.remove(i-1);
                        tokens.remove(i-1);
                        tokens.remove(i-1);

                        tokens.add(i - 1, Long.toString(result));

                        i -= 2;
                    }
                }
            }
            long result = Math.abs(Long.parseLong(tokens.get(0)));
            if (result > max) {
                max = result;
            }
        }

        return max;
    }

    private long calculate(long prev, long next, String operation) {
        return switch (operation) {
            case "+" -> prev + next;
            case "-" -> prev - next;
            case "*" -> prev * next;
            default -> 0;
        };
    }
}
