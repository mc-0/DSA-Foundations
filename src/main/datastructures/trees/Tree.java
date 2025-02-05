package main.datastructures.trees;

public class Tree<T> {

    private Node root;

    Tree(T value) {
        root = new Node<>(value);
    }

    private class Node<T>{
        private T value;
        private Node lChild;
        private Node rChild;

        Node(T value){
            this.value = value;
            this.lChild = null;
            this.rChild = null;
        }
    }

    public void setLeftChild(Node node, T value) {
        Node newNode = new Node(value);
        node.lChild = newNode;
    }

    public void setRightChild(Node node, T value) {
        Node newNode = new Node(value);
        node.rChild = newNode;
    }
}
