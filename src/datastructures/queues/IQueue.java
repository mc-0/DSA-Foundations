package datastructures.queues;

public interface IQueue<T> {
    // Adds an element to the end of the queue
    void enqueue(T element);

    // Removes and returns the front element of the queue
    T dequeue();

    // Returns (but does not remove) the front element of the queue
    T peek();

    // Returns the number of elements in the queue
    int size();

    // Returns true if the queue is empty, false otherwise
    boolean isEmpty();

    // Clears all elements in the queue
    void clear();
}

