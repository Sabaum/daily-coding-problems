package br.com.rpms.dailycodingproblem.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * There's a staircase with N steps, and you can climb 1 or 2 steps at a time.
 * Given N, write a function that returns the number of unique ways you can climb the staircase.
 * The order of the steps matters.
 *
 * For example, if N is 4, then there are 5 unique ways:
 *
 * 1, 1, 1, 1
 * 2, 1, 1
 * 1, 2, 1
 * 1, 1, 2
 * 2, 2
 * What if, instead of being able to climb 1 or 2 steps at a time, you could climb any number from a set of positive integers X?
 * For example, if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time. Generalize your function to take in X.
 */
public class Sample {

    /**
     * First implementation - O(2^n)
     */
    public int numberOfUniqueWays(int remainingSteps) {
        if (remainingSteps < 2) {
            return 1;
        }
        return numberOfUniqueWays(remainingSteps - 1)
                + numberOfUniqueWays(remainingSteps - 2);
    }

    /**
     * Second implementation - O(n)
     */
    public int numberOfUniqueWaysOptimized(int remainingSteps) {
        return numberOfUniqueWaysBottomUp(remainingSteps, new HashMap<>());
    }

    private int numberOfUniqueWaysBottomUp(int remainingSteps, Map<Integer, Integer> memo) {
        if (memo.containsKey(remainingSteps)) {
            return memo.get(remainingSteps);
        }
        int result;
        if (remainingSteps < 2) {
            result = 1;
        } else {
            result = numberOfUniqueWaysBottomUp(remainingSteps - 1, memo)
                    + numberOfUniqueWaysBottomUp(remainingSteps - 2, memo);
        }
        memo.put(remainingSteps, result);
        return result;
    }


    /**
     * Third implementation for any number of step - O(n)
     */
    public int numberOfUniqueWaysAnyStep(int remainingSteps, int[] possibleSteps) {
        return numberOfUniqueWaysAnyStepBottomUp(remainingSteps, possibleSteps, new HashMap<>());
    }

    private int numberOfUniqueWaysAnyStepBottomUp(int remainingSteps, int[] possibleSteps, Map<Integer, Integer> memo) {
        if (memo.containsKey(remainingSteps)) {
            return memo.get(remainingSteps);
        }
        int result;
        if (remainingSteps < 0) {
            result = 0;
        } else if (remainingSteps < 2) {
            result = 1;
        } else {
            result = 0;
            for (int steps : possibleSteps) {
                result += numberOfUniqueWaysAnyStepBottomUp(remainingSteps - steps, possibleSteps, memo);
            }
        }
        memo.put(remainingSteps, result);
        return result;
    }

}
