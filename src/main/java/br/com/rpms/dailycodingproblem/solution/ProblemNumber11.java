package br.com.rpms.dailycodingproblem.solution;

import java.util.*;
import java.util.stream.Collectors;

/**
 * This problem was asked by Twitter.
 *
 * Implement an autocomplete system. That is, given a query string s and a set of all possible query strings,
 * return all strings in the set that have s as a prefix.
 *
 * For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].
 *
 * Hint: Try preprocessing the dictionary into a more efficient data structure to speed up queries.
 */
public class ProblemNumber11 {

    public static Set<String> autoComplete(String query, String[] possibleWords) {
        Map<Character, List<String>> map = new HashMap<>();
        for (int i = 0; i < possibleWords.length; i++) {
            String word = possibleWords[i];
            char firstChar = word.charAt(0);
            List<String> words;
            if (map.containsKey(firstChar)) {
                words = map.get(firstChar);
            } else {
                words = new ArrayList<>();
            }
            words.add(word);
            map.put(firstChar, words);
        }

        List<String> cachedWords = map.get(query.charAt(0));
        if (cachedWords.isEmpty()) {
            return new HashSet<>();
        }
        return cachedWords.parallelStream().filter(word -> word.startsWith(query)).collect(Collectors.toSet());
    }
}
