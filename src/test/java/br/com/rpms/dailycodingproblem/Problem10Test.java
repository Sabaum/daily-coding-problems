package br.com.rpms.dailycodingproblem;

import br.com.rpms.dailycodingproblem.solution.ProblemNumber10;
import org.junit.Assert;
import org.junit.Test;

public class Problem10Test {

    @Test
    public void callFunctionAfterSomeMilis() throws InterruptedException {
        Assert.assertEquals(4, ProblemNumber10.callFunctionAfterSomeMillis(x -> x * 2, 100));
    }
}