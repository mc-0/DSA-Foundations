package datastructures.stacks;

public class LinkedListBasedStack<T> {

    private class Node<T>{
        T value;
        Node next = null;

        Node(T value){
            this.value = value;
        }
    }

    private Node top;
    private int size = 0;

    public void push(T value){
        Node node = new Node(value);
        if(size == 0){
            top = node;
        }
        else{
            node.next = top;
            top = node;
        }
        size++;
    }

    public Object pop(){
        if(size == 0){
            throw new IllegalArgumentException("Stack is empty!");
        }
        Object value = top.value;
        top = top.next;
        size--;

        return value;
    }

    public Object peek(){
        if(top == null){
            throw new IndexOutOfBoundsException("The stack is empty! Nothing to see!");
        }
        return top.value;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }
}
