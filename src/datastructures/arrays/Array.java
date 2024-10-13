package datastructures.arrays;

public interface Array<T> {

    // Returns the number of elements in the dynamic array
    int size();

    // Returns the capacity of the dynamic array
    int capacity();

    // Adds an element to the end of the array
    void add(T element);

    // Inserts an element at a specified index
    void insert(int index, T element);

    // Removes element at a specified index
    boolean remove(Object obj);

    // Returns the element at a specified index
    T get(int index);

    // Replaces the element at a specified index with a new value
    void set(int index, T element);

    // Checks if the dynamic array is empty
    boolean isEmpty();

    // Returns the index of the first occurrence of an element, or -1 if not found
    int indexOf(T element);

    // Clears all elements from the dynamic array
    void clear();

    // Determine if an object exists in the array
    boolean contains(Object obj);
}
