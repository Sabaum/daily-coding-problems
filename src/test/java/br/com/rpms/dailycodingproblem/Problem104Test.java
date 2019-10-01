package br.com.rpms.dailycodingproblem;

import br.com.rpms.dailycodingproblem.helper.SinglyLinkedList;
import br.com.rpms.dailycodingproblem.solution.ProblemNumber104;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class Problem104Test {

    @Test
    public void isPalindrome_shouldReturnTrue() {
        Assert.assertTrue(ProblemNumber104.isPalindrome(new LinkedList<>(Arrays.asList(1,4,3,4,1))));
    }

    @Test
    public void isPalindrome_shouldReturnFalse() {
        Assert.assertFalse(ProblemNumber104.isPalindrome(new LinkedList<>(Arrays.asList(1,4))));
    }

    @Test
    public void isPalindromeSinglyLinkedList_shouldReturnTrue() {
        Assert.assertTrue(ProblemNumber104.isPalindromeSinglyLinkedList(new SinglyLinkedList<>(1,4,3,4,1)));
    }

    @Test
    public void isPalindromeSinglyLinkedList_shouldReturnFalse() {
        Assert.assertFalse(ProblemNumber104.isPalindromeSinglyLinkedList(new SinglyLinkedList<>(1,4)));
    }
}