package main.datastructures.heaps;

import java.util.NoSuchElementException;

/**
 * MinHeap implementation using a binary heap with an array.
 * Supports insertion, deletion of the minimum element, and basic heap operations.
 * @param <Key> The type of elements in the heap, which must be comparable.
 */
public class MinHeap<Key extends Comparable<Key>> {
    private Key[] pq;   // Array-based binary heap
    private int N;      // Number of elements in the heap

    /**
     * Initializes an empty min-heap with the specified initial capacity.
     * @param capacity the initial capacity of the heap
     */
    @SuppressWarnings("unchecked")
    public MinHeap(int capacity) {
        pq = (Key[]) new Comparable[capacity + 1]; // Initialize with 1-based indexing
    }

    /**
     * Checks if the heap is empty.
     * @return true if the heap is empty, false otherwise
     * Time complexity: O(1)
     */
    public boolean isEmpty() {
        return N == 0;
    }

    /**
     * Inserts a new key into the min-heap.
     * Resizes the array if necessary.
     * @param key the key to insert
     * Time complexity: O(log N) for the swim operation; resizing is O(N) when it occurs
     */
    public void insert(Key key) {
        if (N >= pq.length - 1) resize(2 * pq.length); // Resize if needed
        pq[++N] = key;
        swim(N);
    }

    /**
     * Removes and returns the minimum key.
     * @return the minimum key
     * @throws NoSuchElementException if the heap is empty
     * Time complexity: O(log N) for the sink operation
     */
    public Key deleteMin() {
        if (isEmpty()) throw new NoSuchElementException("Heap underflow");
        Key min = pq[1];
        exchange(1, N--);
        sink(1);
        pq[N + 1] = null; // Avoid loitering
        if ((N > 0) && (N == (pq.length - 1) / 4)) resize(pq.length / 2); // Shrink if necessary
        return min;
    }

    /**
     * Restores the heap order property by swimming a node up.
     * @param k index of the node to swim
     * Time complexity: O(log N)
     */
    private void swim(int k) {
        while (k > 1 && greater(k / 2, k)) {  // Notice the comparison change to "greater"
            exchange(k, k / 2);
            k = k / 2;
        }
    }

    /**
     * Restores the heap order property by sinking a node down.
     * @param k index of the node to sink
     * Time complexity: O(log N)
     */
    private void sink(int k) {
        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && greater(j, j + 1)) j++;  // Notice the comparison change to "greater"
            if (!greater(k, j)) break;
            exchange(k, j);
            k = j;
        }
    }

    /**
     * Compares the elements at the specified indices.
     * @param i index of the first element
     * @param j index of the second element
     * @return true if pq[i] is greater than pq[j], false otherwise
     * Time complexity: O(1)
     */
    private boolean greater(int i, int j) {
        return pq[i].compareTo(pq[j]) > 0;
    }

    /**
     * Swaps the elements at the specified indices.
     * @param i index of the first element
     * @param j index of the second element
     * Time complexity: O(1)
     */
    private void exchange(int i, int j) {
        Key t = pq[i];
        pq[i] = pq[j];
        pq[j] = t;
    }

    /**
     * Resizes the array to the specified capacity.
     * @param capacity the new capacity
     * Time complexity: O(N), where N is the number of elements currently in the heap
     */
    @SuppressWarnings("unchecked")
    private void resize(int capacity) {
        Key[] temp = (Key[]) new Comparable[capacity];
        for (int i = 1; i <= N; i++) {
            temp[i] = pq[i];
        }
        pq = temp;
    }
}
