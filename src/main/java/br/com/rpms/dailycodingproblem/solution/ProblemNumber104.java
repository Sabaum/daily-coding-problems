package br.com.rpms.dailycodingproblem.solution;

import br.com.rpms.dailycodingproblem.helper.SinglyLinkedList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

/**
 * This problem was asked by Google.
 *
 * Determine whether a doubly linked list is a palindrome. What if it’s singly linked?
 *
 * For example, 1 -> 4 -> 3 -> 4 -> 1 returns True while 1 -> 4 returns False.
 */
public class ProblemNumber104 {

    private ProblemNumber104() {
    }

    public static boolean isPalindrome(LinkedList<Integer> list) {
        while (!list.isEmpty()) {
            Integer first = list.pollFirst();
            if (!list.isEmpty() && !first.equals(list.pollLast())) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeSinglyLinkedList(SinglyLinkedList<Integer> list) {
        SinglyLinkedList<Integer>.Node<Integer> node = list.getHead();
        int halfListSize = list.getSize() / 2;
        boolean listHasOddElements = list.getSize() % 2 == 1;
        Stack<Integer> stack = new Stack<>();
        int counter = 1;
        do {
            Integer currentValue = node.getData();
            if (counter <= halfListSize) {
                stack.push(currentValue);
            } else {
                if (!listHasOddElements && !stack.pop().equals(currentValue)) {
                    return false;
                }
            }
            counter++;
            node = node.getNext();
        } while (node != null);
        return true;
    }

}