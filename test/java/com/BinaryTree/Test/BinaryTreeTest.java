package com.BinaryTree.Test;

import com.BinaryTree.MyBinaryNode;
import com.BinaryTree.MyBinaryTree;
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

    @Test
    public void ProvideNumbers_WhenAddedInBST_ShouldReturnSize(){
        MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);
        binaryTree.add(22);
        binaryTree.add(40);
        binaryTree.add(60);
        binaryTree.add(95);
        binaryTree.add(11);
        binaryTree.add(65);
        binaryTree.add(3);
        binaryTree.add(16);
        binaryTree.add(63);
        binaryTree.add(67);

        int size = binaryTree.bstSize();
        Assert.assertEquals(13, size);
    }

    @Test
    public void ProvideNumbers_WhenNotAddedInBST_TestCaseShouldPass(){
        MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);
        binaryTree.add(22);
        binaryTree.add(40);
        binaryTree.add(60);
        binaryTree.add(95);
        binaryTree.add(11);
        binaryTree.add(65);
        binaryTree.add(3);
        binaryTree.add(16);
        binaryTree.add(63);
        binaryTree.add(67);

        int size = binaryTree.bstSize();
        Assert.assertNotEquals(0, size);
    }

    @Test
    public void checkSearchValues_PresentInBST_ShouldReturnTrue() {
        MyBinaryTree<Integer> binarySearchTree = new MyBinaryTree<>();
        binarySearchTree.add(56);
        binarySearchTree.add(30);
        binarySearchTree.add(70);
        binarySearchTree.add(22);
        binarySearchTree.add(40);
        binarySearchTree.add(60);
        binarySearchTree.add(95);
        binarySearchTree.add(11);
        binarySearchTree.add(65);
        binarySearchTree.add(3);
        binarySearchTree.add(16);
        binarySearchTree.add(63);
        binarySearchTree.add(67);
        boolean isFound = binarySearchTree.search(63);
        Assert.assertTrue(isFound);
    }

    @Test
    public void checkSearchValues_WhenNotPresentInBST_TestCaseShouldPass() {
        MyBinaryTree<Integer> binarySearchTree = new MyBinaryTree<>();
        binarySearchTree.add(56);
        binarySearchTree.add(30);
        binarySearchTree.add(70);
        binarySearchTree.add(22);
        binarySearchTree.add(40);
        binarySearchTree.add(60);
        binarySearchTree.add(95);
        binarySearchTree.add(11);
        binarySearchTree.add(65);
        binarySearchTree.add(3);
        binarySearchTree.add(16);
        binarySearchTree.add(63);
        binarySearchTree.add(67);
        boolean isFound = binarySearchTree.search(4);
        Assert.assertFalse(isFound);
    }
}
