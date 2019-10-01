package br.com.rpms.dailycodingproblem;

import br.com.rpms.dailycodingproblem.helper.Node;
import br.com.rpms.dailycodingproblem.solution.ProblemNumber3;
import org.junit.Assert;
import org.junit.Test;

public class ProblemNumber3Test {

    @Test
    public void serializationDeserialization() {
        Node node = new Node("root", new Node("left", new Node("left.left"), null), new Node("right"));
        Node processedNode = ProblemNumber3.deserialize(ProblemNumber3.serialize(node));
        Assert.assertEquals("left.left", processedNode.getLeft().getLeft().getVal());
        Assert.assertEquals("right", processedNode.getRight().getVal());
    }

    @Test
    public void serialize() {
        Node node = new Node("root", new Node("left", new Node("left.left"), null), new Node("right"));
        System.out.println(ProblemNumber3.serialize(node));
    }

    @Test
    public void deserialization() {
        String textNode = "root|left|left.left|null|null|null|right|null|null";
        System.out.println(ProblemNumber3.deserialize(textNode));
    }
}