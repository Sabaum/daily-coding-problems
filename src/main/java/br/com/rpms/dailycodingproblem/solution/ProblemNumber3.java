package br.com.rpms.dailycodingproblem.solution;

import br.com.rpms.dailycodingproblem.helper.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This problem was asked by Google.
 *
 * Given the root to a binary tree, implement serialize(root), which serializes the tree into a string,
 * and deserialize(s), which deserializes the string back into the tree.
 */
public class ProblemNumber3 {

    public static String serialize(Node node) {
        if (node == null) {
            return "null";
        }
        String result = node.getVal();
        result += "|" + serialize(node.getLeft());
        result += "|" + serialize(node.getRight());
        return result;
    }

    public static Node deserialize(String string) {
        List<String> parsedString = new ArrayList<>(Arrays.asList(string.split("\\|")));
        if (parsedString.size() == 0 || parsedString.get(0).equals("null")) {
            return null;
        }
        String nodeValue = parsedString.remove(0);
        return new Node(nodeValue, recursiveDeserialize(parsedString), recursiveDeserialize(parsedString));
    }

    private static Node recursiveDeserialize(List<String> parsedString) {
        String nodeValue = parsedString.remove(0);
        if (nodeValue.equals("null")) {
            return null;
        }
        return new Node(nodeValue, recursiveDeserialize(parsedString), recursiveDeserialize(parsedString));
    }

}