package br.com.rpms.dailycodingproblem.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * This problem was asked by Amazon.
 *
 * Implement a stack that has the following methods:
 *
 * push(val), which pushes an element onto the stack
 * pop(), which pops off and returns the topmost element of the stack. If there are no elements in the stack, then it should throw an error or return null.
 * max(), which returns the maximum value in the stack currently. If there are no elements in the stack, then it should throw an error or return null.
 * Each method should run in constant time.
 */
public class ProblemNumber43 {

    static class Stack {

        private List<Integer> objects = new ArrayList<>();
        private List<Integer> max = new ArrayList<>();

        public void push(Integer current) {
            objects.add(current);
            if (max.isEmpty() || max.get(max.size()-1) <= current) {
                max.add(current);
            }
        }

        public Integer pop() {
            if (objects.isEmpty()) {
                return null;
            }
            Integer removed = objects.remove(objects.size() - 1);
            if (removed.equals(max())) {
                max.remove(max.size()-1);
            }
            return removed;
        }

        public Integer max() {
            if (max.isEmpty()) {
                return null;
            }
            return max.get(max.size()-1);
        }

    }

}