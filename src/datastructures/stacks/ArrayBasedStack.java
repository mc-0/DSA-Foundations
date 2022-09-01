package datastructures.stacks;

import java.util.ArrayList;

public class ArrayBasedStack<T> {

    private ArrayList<T> items = new ArrayList<>();;
    private int size;
    private T top;

    public void push(T item){
        items.add(item);
        top = items.get(items.size() - 1);
    }

    public void pop(){
        items.remove(items.get(items.size() - 1));
        if (items.size() == 0){
            top = null;
        }
        else{
            top = items.get(items.size() - 1);
        }

    }

    public T peek(){
        return top;
    }

    public boolean isEmpty(){
        return items.size() == 0;
    }

    public int size(){
        return size;
    }
}
