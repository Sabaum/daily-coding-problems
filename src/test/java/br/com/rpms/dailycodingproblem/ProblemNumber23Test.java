package br.com.rpms.dailycodingproblem;

import br.com.rpms.dailycodingproblem.solution.ProblemNumber23;
import org.junit.Assert;
import org.junit.Test;

public class ProblemNumber23Test {

    @Test
    public void minimumNumberOfSteps() {
        boolean[][] field = {
                {false, false, false, false},
                {true, true, false, true},
                {false, false, false, false},
                {false, false, false, false}};

        int expected = 7;
        Assert.assertEquals(expected, ProblemNumber23.minimumNumberOfSteps(field, 3, 0, 0, 0));
    }
}