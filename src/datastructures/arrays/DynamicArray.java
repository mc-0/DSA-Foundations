package datastructures.arrays;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* Notes:
        1. Removed manual array copying like:
        for (int i = 0; i < length; i++){
                    newArray[i] = array[i];
                }

        2. Suppressed uncheck casts as Java disallows generic array declaration
 */

public class DynamicArray<T> implements Iterable<T>, Array<T>{

    private T[] array; // underlying structure containing elements
    private int length = 0; // tracks the next available index
    private int capacity; // represents the capacity of the array

    public DynamicArray(){
        this(16);
    }

    @SuppressWarnings("unchecked")
    public DynamicArray(int capacity){
        if (capacity < 0){
            throw new IllegalArgumentException("Unable to create an array of size: " + capacity);
        }
        this.capacity = capacity;
        array = (T[]) new Object[capacity];
    }

    // Return the total # of elements in the dynamic array
    @Override
    public int size(){
        return length;
    }

    // Return the current maximum # of elements the dynamic array can hold
    @Override
    public int capacity() {
        return capacity;
    }

    @Override
    public void add(T element){
        checkForResize();
        array[length++] = element;
    }

    private void checkForResize() {
        // Increase size if necessary (double if full)
        if (length >= capacity){
            if (capacity == 0){
                capacity = 1;
            }
            else {
                capacity *= 2;
            }
            resize();
        }

        // Decrease size is necessary (halve if 1/4 or less full, but not less than 1)
        else if (length > 0 && length <= capacity / 4) {
            capacity = Math.max(1, capacity / 2);  // Prevent shrinking to less than 1
            resize();
        }

    }

    @SuppressWarnings("unchecked")
    private void resize() {
        T[] newArray = (T[]) new Object[capacity];

        if (length >= 0) System.arraycopy(array, 0, newArray, 0, length);
        array = newArray;
    }

    @Override
    public void insert(int index, T element) {
        if (index < 0 || index > length) {
            throw new IndexOutOfBoundsException();
        }

        checkForResize();

        // Shift elements to the right to make space for the new element
        // Can also use `System.arraycopy()` - see removeAt() method
        for (int i = length; i > index; i--) {
            array[i] = array[i - 1];
        }

        // Insert the new element
        array[index] = element;
        length++;
    }

    @Override
    public boolean isEmpty(){
        return size() == 0;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public void set(int index, T element) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException();
        }
        array[index] = element;
    }


    @Override
    public void clear() {
        for (int i = 0; i < length; i++) {
            array[i] = null;
        }
        length = 0;
        // Optionally reset capacity to a default value
        // capacity = 16;
        // array = (T[]) new Object[capacity];
    }


    public T removeAt(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException();
        }

        T data = array[index];

        // Shift elements left to fill the gap
        System.arraycopy(array, index + 1, array, index, length - index - 1);
        array[--length] = null;  // Null out the last element and decrease the length

        if (length > 0 && length <= capacity / 4) {
            checkForResize();  // Handle shrinking if necessary
        }

        return data;
    }


    @Override
    public boolean remove(Object obj){
        for (int i = 0; i < length; i++){
            if (array[i].equals(obj)){
                removeAt(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(Object obj){
        for (int i = 0; i < length; i++){
            if (array[i].equals(obj)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < length;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return array[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("remove is not supported.");
            }
        };
    }
}