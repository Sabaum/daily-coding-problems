package br.com.rpms.dailycodingproblem;

import br.com.rpms.dailycodingproblem.solution.ProblemNumber4;
import org.junit.Assert;
import org.junit.Test;

public class ProblemNumber4Test {

    @Test
    public void test1() {
        int[] array = {3, 4, -1, 1};
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, new ProblemNumber4().find(array));
    }

    @Test
    public void test2() {
        int[] array = {1, 2, 0};
        int expectedResult = 3;
        Assert.assertEquals(expectedResult, new ProblemNumber4().find(array));
    }

    @Test
    public void complexTest() {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 0, -1, 2};
        int expectedResult = 1;
        Assert.assertEquals(expectedResult, new ProblemNumber4().find(array));
    }
}