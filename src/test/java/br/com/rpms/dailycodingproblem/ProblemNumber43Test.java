package br.com.rpms.dailycodingproblem;

import br.com.rpms.dailycodingproblem.solution.ProblemNumber43;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemNumber43Test {

    @Test
    public void test1() {
        ProblemNumber43.Stack stack = new ProblemNumber43.Stack();

        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(2);

        Assert.assertEquals(Integer.valueOf(5), stack.max());
        Assert.assertEquals(Integer.valueOf(2), stack.pop());
        Assert.assertEquals(Integer.valueOf(5), stack.max());
        Assert.assertEquals(Integer.valueOf(5), stack.pop());
        Assert.assertEquals(Integer.valueOf(3), stack.max());
        Assert.assertEquals(Integer.valueOf(3), stack.pop());
        Assert.assertEquals(Integer.valueOf(1), stack.max());
        Assert.assertEquals(Integer.valueOf(1), stack.pop());
        assertNull(stack.max());
    }

    @Test
    public void test2() {
        ProblemNumber43.Stack stack = new ProblemNumber43.Stack();

        stack.push(10);
        stack.push(4);
        stack.push(6);
        stack.push(1);

        Assert.assertEquals(Integer.valueOf(10), stack.max());
        Assert.assertEquals(Integer.valueOf(1), stack.pop());
        Assert.assertEquals(Integer.valueOf(10), stack.max());
        Assert.assertEquals(Integer.valueOf(6), stack.pop());
        Assert.assertEquals(Integer.valueOf(10), stack.max());
        Assert.assertEquals(Integer.valueOf(4), stack.pop());
        Assert.assertEquals(Integer.valueOf(10), stack.max());
        Assert.assertEquals(Integer.valueOf(10), stack.pop());
        assertNull(stack.max());
    }
}