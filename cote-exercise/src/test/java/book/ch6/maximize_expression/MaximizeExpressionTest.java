package book.ch6.maximize_expression;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaximizeExpressionTest {
    MaximizeExpression me = new MaximizeExpression();

    @Test
    void test1() {
        assertThat(me.solution("100-200*300-500+20")).isEqualTo(60420);
    }

    @Test
    void test2() {
        assertThat(me.solution("50*6-3*2")).isEqualTo(300);
    }

}