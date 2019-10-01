package br.com.rpms.dailycodingproblem.solution;

import java.util.HashSet;
import java.util.Set;

/**
 * This problem was recently asked by Google.
 *
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 *
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 *
 * Bonus: Can you do this in one pass?
 */
public class Problem1 {

    /**
     * First implementation - O(n)
     */
    public boolean hasTwoNumbersAddingUpToK(int[] array, int desiredSumValue) {
        Set<Integer> intSet = new HashSet<>();
        for (int value : array) {
            intSet.add(value);
        }
        for (int value : array) {
            if (intSet.contains(desiredSumValue - value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Second implementation with one pass - O(n)
     */
    public boolean hasTwoNumbersAddingUpToKWithOnePass(int[] array, int desiredSumValue) {
        Set<Integer> intSet = new HashSet<>();
        for (int value : array) {
            if (intSet.contains(desiredSumValue - value)) {
                return true;
            }
            intSet.add(value);
        }
        return false;
    }
}
