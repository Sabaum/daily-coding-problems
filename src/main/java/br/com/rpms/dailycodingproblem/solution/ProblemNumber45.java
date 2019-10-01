package br.com.rpms.dailycodingproblem.solution;

import java.util.Random;

/**
 * This problem was asked by Two Sigma.
 *
 * Using a function rand5() that returns an integer from 1 to 5 (inclusive) with uniform probability,
 * implement a function rand7() that returns an integer from 1 to 7 (inclusive).
 */
public class ProblemNumber45 {

    private ProblemNumber45() {
    }

    public static int rand7() {
        return (rand5() + rand5() + rand5() + rand5() + rand5() + rand5() + rand5()) % 7 + 1;
    }

    public static int rand5() {
        return new Random().nextInt(5) % 5 + 1;
    }

}