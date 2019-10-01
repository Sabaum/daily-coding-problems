package br.com.rpms.dailycodingproblem;

import br.com.rpms.dailycodingproblem.solution.ProblemNumber5;
import org.junit.Assert;
import org.junit.Test;

public class ProblemNumber5Test {

    @Test
    public void car() {
        Assert.assertEquals(3, ProblemNumber5.car(ProblemNumber5.cons(3, 4)));
    }

    @Test
    public void cdr() {
        Assert.assertEquals(4, ProblemNumber5.cdr(ProblemNumber5.cons(3, 4)));
    }
}