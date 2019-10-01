package br.com.rpms.dailycodingproblem.solution;

import java.util.*;
import java.util.stream.Collectors;

/**
 * This problem was asked by Facebook.
 *
 * Given a string of round, curly, and square open and closing brackets, return whether the brackets are balanced (well-formed).
 *
 * For example, given the string "([])[]({})", you should return true.
 *
 * Given the string "([)]" or "((()", you should return false.
 */
public class ProblemNumber27 {

    public static boolean isExpressionBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            Character currentChar = expression.charAt(i);
            if (!stack.empty()) {
                Character topChar = stack.peek();
                if (validateBalancedChars(topChar, currentChar)) {
                    stack.pop();
                } else {
                    stack.add(currentChar);
                }
            } else {
                stack.add(currentChar);
            }
        }
        return stack.empty();
    }

    private static boolean validateBalancedChars(Character firstChar, Character secondChar) {

        boolean balancedBrackets = secondChar.equals(']') && firstChar.equals('[');
        boolean balancedParenthesis = secondChar.equals(')') && firstChar.equals('(');
        boolean balancedCurlyBrackets = secondChar.equals('}') && firstChar.equals('{');

        return balancedBrackets || balancedParenthesis || balancedCurlyBrackets;
    }

}