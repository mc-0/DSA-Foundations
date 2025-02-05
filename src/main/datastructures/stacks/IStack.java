package main.datastructures.stacks;

import java.util.EmptyStackException;

public interface IStack<E> {

    /**
     * Pushes an element onto the top of the stack.
     *
     * @param element the element to be pushed onto the stack
     */
    void push(E element);

    /**
     * Removes and returns the element at the top of the stack.
     *
     * @return the element at the top of the stack
     * @throws EmptyStackException if the stack is empty
     */
    E pop() throws EmptyStackException;

    /**
     * Returns the element at the top of the stack without removing it.
     *
     * @return the element at the top of the stack
     * @throws EmptyStackException if the stack is empty
     */
    E peek() throws EmptyStackException;

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Returns the number of elements in the stack.
     *
     * @return the size of the stack
     */
    int size();
}

