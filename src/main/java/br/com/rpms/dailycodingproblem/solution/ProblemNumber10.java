package br.com.rpms.dailycodingproblem.solution;

import java.util.function.Function;

/**
 * This problem was asked by Apple.
 *
 * Implement a job scheduler which takes in a function f and an integer n, and calls f after n milliseconds.
 */
public class ProblemNumber10 {

    public static int callFunctionAfterSomeMillis(Function<Integer, Integer> f, int millis) throws InterruptedException {
        Thread.sleep(millis);
        return f.apply(millis);
    }
}
