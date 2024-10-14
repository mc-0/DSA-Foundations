package datastructures.stacks;

import java.util.EmptyStackException;

public class ArrayBasedStack<T> implements Stack<T> {

    private T[] items;
    private int top;
    private int capacity;

    @SuppressWarnings("unchecked")
    public ArrayBasedStack() {
        this.capacity = 2;
        this.items = (T[]) new Object[capacity];
        this.top = -1; // Use -1 to indicate an empty stack
    }

    @Override
    public void push(T element) {
        if (size() == capacity) {
            resize(capacity * 2);
        }
        items[++top] = element; // Increment top and add the element
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T popped = items[top];
        items[top--] = null; // Clear the reference and decrement top

        // Resize down if necessary
        if (size() > 0 && size() <= capacity / 4) {
            resize(capacity / 2);
        }
        return popped;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return items[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1; // Stack is empty if top is -1
    }

    @Override
    public int size() {
        return top + 1; // Size is top index + 1
    }

    @SuppressWarnings("unchecked")
    private void resize(int newCapacity) {
        T[] newArray = (T[]) new Object[newCapacity];
        System.arraycopy(items, 0, newArray, 0, size());
        items = newArray;
        capacity = newCapacity;
    }
}
