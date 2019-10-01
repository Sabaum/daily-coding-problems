package br.com.rpms.dailycodingproblem;

import br.com.rpms.dailycodingproblem.solution.ProblemNumber27;
import org.junit.Assert;
import org.junit.Test;

public class ProblemNumber27Test {

    @Test
    public void isExpressionBalanced() {
        String expression = "([])[]({})";
        Assert.assertTrue(ProblemNumber27.isExpressionBalanced(expression));
    }

    @Test
    public void isExpressionBalancedWithMessedUpOrder_shouldReturnFalse() {
        String expression = "([)]";
        Assert.assertFalse(ProblemNumber27.isExpressionBalanced(expression));
    }

    @Test
    public void isExpressionBalancedUnbalanced_shouldReturnFalse() {
        String expression = "((()";
        Assert.assertFalse(ProblemNumber27.isExpressionBalanced(expression));
    }
}