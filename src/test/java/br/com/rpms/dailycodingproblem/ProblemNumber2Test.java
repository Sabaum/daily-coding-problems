package br.com.rpms.dailycodingproblem;

import br.com.rpms.dailycodingproblem.solution.Problem2;
import org.junit.Assert;
import org.junit.Test;

public class ProblemNumber2Test {

    @Test
    public void findProductExceptForIndex() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expectedArray = {120, 60, 40, 30, 24};
        Assert.assertArrayEquals(expectedArray, new Problem2().findProductExceptForIndex(array));
    }
}