package br.com.rpms.dailycodingproblem;

import br.com.rpms.dailycodingproblem.solution.ProblemNumber45;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.junit.Assert.assertThat;

public class ProblemNumber45Test {

    @Test
    public void rand5() {
        int result = ProblemNumber45.rand5();
        assertBetween(result, 0, 5);
        result = ProblemNumber45.rand5();
        assertBetween(result, 0, 5);
        result = ProblemNumber45.rand5();
        assertBetween(result, 0, 5);
        result = ProblemNumber45.rand5();
        assertBetween(result, 0, 5);
    }

    @Test
    public void rand7() {
        int result = ProblemNumber45.rand7();
        assertBetween(result, 0, 7);
        result = ProblemNumber45.rand7();
        assertBetween(result, 0, 7);
        result = ProblemNumber45.rand7();
        assertBetween(result, 0, 7);
        result = ProblemNumber45.rand7();
        assertBetween(result, 0, 7);
    }

    private void assertBetween(int result, int lowerBound, int upperBound) {
        assertThat(result, allOf(greaterThanOrEqualTo(lowerBound), lessThanOrEqualTo(upperBound)));
    }
}