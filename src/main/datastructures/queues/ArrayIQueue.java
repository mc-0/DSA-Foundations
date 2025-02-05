package main.datastructures.queues;

public class ArrayIQueue<T> implements IQueue<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] data;   // Array to store queue elements
    private int front;  // Points to the front of the queue
    private int rear;   // Points to the rear of the queue
    private int size;   // Number of elements in the queue
    private int capacity;

    @SuppressWarnings("unchecked")
    public ArrayIQueue(int capacity) {
        this.capacity = capacity;
        data = (T[]) new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public ArrayIQueue() {
        this(DEFAULT_CAPACITY);
    }

    @Override
    public void enqueue(T value) {
        if (size == capacity) {
            resize(capacity * 2);  // Resize the array when full
        }

        rear = (rear + 1) % capacity; // Circular increment
        data[rear] = value;
        size++;
    }

    @Override
    public T dequeue() {
        if (size == 0) {
            throw new RuntimeException("Queue is empty!");
        }
        T returnValue = data[front];
        front = (front + 1) % capacity; // Circular increment
        size--;

        // Resize down if necessary (avoid shrinking below default capacity)
        if (size > 0 && size <= capacity / 4 && capacity > DEFAULT_CAPACITY) {
            resize(Math.max(capacity / 2, DEFAULT_CAPACITY));
        }

        return returnValue;
    }

    @Override
    public T peek() {
        if (size == 0) {
            throw new RuntimeException("Queue is empty!");
        }
        return data[front];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    public void printQueue() {
        if (size == 0) {
            System.out.println("(EMPTY)");
            return;
        }
        System.out.print("(FRONT) ");
        for (int i = 0; i < size; i++) {
            System.out.print("[" + data[(front + i) % capacity] + "]");
            if (i < size - 1) {
                System.out.print(" <-- ");
            }
        }
        System.out.println(" (REAR)");
    }

    @SuppressWarnings("unchecked")
    private void resize(int newCapacity) {
        T[] newArray = (T[]) new Object[newCapacity];

        // Copy elements from the old array to the new one in the correct order
        for (int i = 0; i < size; i++) {
            newArray[i] = data[(front + i) % capacity];
        }

        // Reset front and rear pointers
        front = 0;
        rear = size - 1;
        data = newArray;
        capacity = newCapacity;
    }
}
