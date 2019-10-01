package br.com.rpms.dailycodingproblem.helper;

public class Node {

    private String val;
    private Node left;
    private Node right;

    public Node(String val) {
        this.val = val;
    }

    public Node(String val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public String getVal() {
        return val;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}
