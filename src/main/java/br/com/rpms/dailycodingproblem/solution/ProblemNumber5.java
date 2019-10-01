package br.com.rpms.dailycodingproblem.solution;

import br.com.rpms.dailycodingproblem.helper.Pair;

/**
 * This problem was asked by Jane Street.
 *
 * cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair.
 * For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.
 *
 * Implement car and cdr
 */
public class ProblemNumber5 {

    public static Pair cons(int a, int b) {
        return new Pair(a, b);
    }

    public static int car(Pair pair) {
        return left(pair);
    }

    public static int cdr(Pair pair) {
        return right(pair);
    }

    private static int left(Pair pair) {
        return pair.getA();
    }

    private static int right(Pair pair) {
        return pair.getB();
    }

}
