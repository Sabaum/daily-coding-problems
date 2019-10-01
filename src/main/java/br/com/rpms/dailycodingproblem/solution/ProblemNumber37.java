package br.com.rpms.dailycodingproblem.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 * This problem was asked by Google.
 *
 * The power set of a set is the set of all its subsets. Write a function that, given a set, generates its power set.
 *
 * For example, given the set {1, 2, 3}, it should return {{}, {1}, {2}, {3}, {1, 2}, {1, 3}, {2, 3}, {1, 2, 3}}.
 *
 * You may also use a list or array to represent a set.
 */
public class ProblemNumber37 {

    public static List<List<Integer>> generatePowerSet(List<Integer> set) {

        List<List<Integer>> powerSet = new ArrayList<>();
        powerSet.add(new ArrayList<>());
        return process(set, 0, powerSet);
    }

    private static List<List<Integer>> process(List<Integer> set, int pos, List<List<Integer>> powerSet) {
        if (pos >= set.size()) {
            return new ArrayList<>();
        }

        for (int i = pos; i < set.size(); i++) {
            List<List<Integer>> newSubSet = new ArrayList<>();
            for (int j = 0; j < powerSet.size(); j++) {
                newSubSet.add(j, powerSet.get(j));
                newSubSet.get(j).add(set.get(i));
            }
        }
        return null;
    }

}