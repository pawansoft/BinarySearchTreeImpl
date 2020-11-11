package com.BinaryTree.Test;

import com.BinaryTree.MyBinaryNode;
import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTest {

    @Test
    public void Provide3Number_WhenAddedToBinaryTree_ShouldReturnAddedNode(){
        MyBinaryNode<Integer> fNode = new MyBinaryNode<>(56);
        MyBinaryNode<Integer> sNode = new MyBinaryNode<>(30);
        MyBinaryNode<Integer> tNode = new MyBinaryNode<>(70);
        fNode.setLeft(sNode);
        fNode.setRight(tNode);

        boolean isAddedNodeToBST = fNode.getLeft().equals(sNode) &&
                fNode.getRight().equals(tNode);
        Assert.assertTrue(isAddedNodeToBST);
    }


    @Test
    public void Provide3Number_WhenAddedNotAddedProperly_TestCaseShouldPass(){
        MyBinaryNode<Integer> fNode = new MyBinaryNode<>(56);
        MyBinaryNode<Integer> sNode = new MyBinaryNode<>(30);
        MyBinaryNode<Integer> tNode = new MyBinaryNode<>(70);
        fNode.setLeft(sNode);
        fNode.setRight(tNode);

        boolean isAddedNodeToBST = fNode.getLeft().equals(tNode) &&
                fNode.getRight().equals(sNode);
        Assert.assertFalse(isAddedNodeToBST);
    }
}
