package main.datastructures.stacks;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedListBasedIStack<T> implements IStack<T>, Iterable<T> {

    private class Node {
        T value;
        Node next;

        Node(T value){
            this.value = value;
        }
    }

    private Node top;
    private int size = 0;

    @Override
    public void push(T value) {
        Node node = new Node(value);
        node.next = top; // Point new node to the current top
        top = node; // Update top to the new node
        size++;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = top.value; // Get the value from the top node
        top = top.next; // Update top to the next node
        size--;
        return value;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.value; // Return the value of the top node
    }

    @Override
    public boolean isEmpty() {
        return size == 0; // Check if the size is zero
    }

    @Override
    public int size() {
        return size; // Return the size of the stack
    }

    public Iterator<T> iterator() {
        return new LinkedIterator(top);
    }

    // the iterator
    private class LinkedIterator implements Iterator<T> {
        private Node current;

        public LinkedIterator(Node first) {
            current = first;
        }

        // is there a next item?
        public boolean hasNext() {
            return current != null;
        }

        // returns the next item
        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            T item = current.value;
            current = current.next;
            return item;
        }
    }
}
