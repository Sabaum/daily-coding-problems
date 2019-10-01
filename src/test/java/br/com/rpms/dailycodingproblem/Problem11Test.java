package br.com.rpms.dailycodingproblem;

import br.com.rpms.dailycodingproblem.solution.ProblemNumber11;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem11Test {

    @Test
    public void autoComplete() {
        String query = "de";
        String[] possibleWords = { "dog", "deer", "deal" };
        Set<String> expected = new HashSet<>(Arrays.asList("deer", "deal"));
        Assert.assertEquals(expected, ProblemNumber11.autoComplete(query, possibleWords));
    }

    @Test
    public void autoComplete_withLargerDictionary() {
        String query = "de";
        String[] possibleWords = largerDictionary();
        Set<String> expected = new HashSet<>(Arrays.asList("deer", "deal"));
        Assert.assertEquals(expected, ProblemNumber11.autoComplete(query, possibleWords));
    }

    private String[] largerDictionary() {
        return new String[]{"cat", "bear", "bird", "dolphin", "tortoise", "dog", "deer", "deal", "horse", "shark",
                "whale", "zebra", "giraffe", "elephant", "donkey", "bat", "lion", "tiger", "monkey", "snake", "rabbit",
                "fox", "chicken", "pig", "wolf", "cheetah", "penguin", "cow", "alligator", "crocodile", "rhino", "rat",
                "eagle", "lizard", "owl", "puma", "buffalo", "duck", };
    }
}