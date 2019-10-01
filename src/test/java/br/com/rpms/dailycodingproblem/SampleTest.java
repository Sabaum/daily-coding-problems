package br.com.rpms.dailycodingproblem;

import br.com.rpms.dailycodingproblem.solution.Sample;
import org.junit.Assert;
import org.junit.Test;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class SampleTest {

    @Test
    public void numberOfUniqueWays() {
        Instant start = Instant.now();
        Assert.assertEquals(1836311903, new Sample().numberOfUniqueWays(45));
        System.out.format("numberOfUniqueWays took %d milliseconds to complete", start.until(Instant.now(), ChronoUnit.MILLIS));
    }

    @Test
    public void numberOfUniqueWaysOptimized() {
        Instant start = Instant.now();
        Assert.assertEquals(1836311903, new Sample().numberOfUniqueWaysOptimized(45));
        System.out.format("numberOfUniqueWaysOptimized took %d milliseconds to complete", start.until(Instant.now(), ChronoUnit.MILLIS));
    }

    @Test
    public void numberOfUniqueWaysAnyStepsOptimized() {
        int[] possibleSteps = {1, 3, 5};
        Instant start = Instant.now();
        Assert.assertEquals(339200673, new Sample().numberOfUniqueWaysAnyStep(45, possibleSteps));
        System.out.format("numberOfUniqueWaysAnyStepsOptimized took %d milliseconds to complete", start.until(Instant.now(), ChronoUnit.MILLIS));
    }

}