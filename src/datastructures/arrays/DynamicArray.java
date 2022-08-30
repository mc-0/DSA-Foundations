package datastructures.arrays;

import java.util.Iterator;

// Implementation of a dynamic array data structure
public class DynamicArray<T> implements Iterable<T>{

    private T[] array;
    private int length = 0;
    private int capacity = 0;

    public DynamicArray(){
        this(16);
    }

    public DynamicArray(int capacity){
        if (capacity < 0){
            throw new IllegalArgumentException("Unable to create an array of size: " + capacity);
        }
        this.capacity = capacity;
        array = (T[]) new Object[capacity];
    }

    public int size(){
        return length;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public T get(int index){
        return array[index];
    }

    public void set(int index, T element){
        array[index] = element;
    }

    public void clear(){
        for (int i = 0; i < capacity; i++){
            array[i] = null;
        }
        length = 0;
    }

    public void add(T element){
        if (length + 1 >= capacity){
            if (capacity == 0){
                capacity = 1;
            }
            else {
                capacity *= 2;
            }
            T[] newArray = (T[]) new Object[capacity];

            for (int i = 0; i < length; i++){
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[length++] = element;
    }

    public T removeAt(int index){
        if (index >= length && index < 0){
            throw new IndexOutOfBoundsException();
        }
        T data = array[index];
        T[] newArray = (T[]) new Object[length - 1];
        for (int i = 0, j = 0; i < length; i++, j++){
            if (i == index){
                j--;
            }
            else{
                newArray[j] = array[i];
            }
        }
        array = newArray;
        capacity = length--;
        return data;
    }

    public boolean remove(Object obj){
        for (int i = 0; i < length; i++){
            if (array[i].equals(obj)){
                removeAt(i);
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object obj){
        for (int i = 0; i < length; i++){
            if (array[i].equals(obj)){
                return i;
            }
        }
        return -1;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }


    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
