package com.BinaryTree;

public class MyBinaryTree <K extends Comparable<K>>{
    
    private MyBinaryNode<K> root;
    
    public void add(K key){
        this.root = this.addRecursively(root, key);
    }

    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> currentNode, K key) {
        if(currentNode == null){
            return new MyBinaryNode<K>(key);
        }
        int compareValue = key.compareTo(currentNode.key);

        if(compareValue == 0){
            return null;
        }
        else if(compareValue < 0){
            currentNode.setLeft(addRecursively(currentNode.getLeft(), key));

        }else {
            currentNode.setRight(addRecursively(currentNode.getRight(), key));
        }
        return currentNode;
    }
    public int bstSize(){
        return this.getSizeRecursive(root);
    }

    private int getSizeRecursive(MyBinaryNode<K> currentNode) {
        if(currentNode == null){
            return 0;
        }
        else {
            return 1+ this.getSizeRecursive(currentNode.getLeft()) + this.getSizeRecursive(currentNode.right);
        }
    }

    public  boolean search(K key) {
        if(searchRecursive(root, key) != null){
            return true;
        }
        return false;
    }

    private MyBinaryNode<K> searchRecursive(MyBinaryNode<K> currentNode, K key) {
        if(currentNode == null){
            return null;
        }
        int compareResult = key.compareTo(currentNode.key);
        if(compareResult == 0){
            return currentNode;
        }
        else if (compareResult < 0) {
            return searchRecursive(currentNode.getLeft(), key);
        }
        else {
            return searchRecursive(currentNode.getRight(), key);
        }
    }
}
