package br.com.rpms.dailycodingproblem;

import br.com.rpms.dailycodingproblem.solution.Problem1;
import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class Problem1Test {

    @Test
    public void hasTwoNumbersAddingUpToK_shouldReturnTrue() {
        int[] array = {10, 15, 3, 7};
        Assert.assertTrue(new Problem1().hasTwoNumbersAddingUpToK(array, 17));
    }

    @Test
    public void hasTwoNumbersAddingUpToKWithOnePass_shouldReturnTrue() {
        int[] array = {1, 2, 3, 4, 5, 10};
        Assert.assertTrue(new Problem1().hasTwoNumbersAddingUpToKWithOnePass(array, 15));
    }

    @Test
    public void hasTwoNumbersAddingUpToKWithOnePass_shouldReturnFalse() {
        int[] array = IntStream.of(500).toArray();
        Assert.assertFalse(new Problem1().hasTwoNumbersAddingUpToKWithOnePass(array, 1000));
    }

}