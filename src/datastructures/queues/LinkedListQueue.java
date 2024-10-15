package datastructures.queues;

public class LinkedListQueue<T> implements Queue<T> {

    private class Node {
        private final T value;
        private Node next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    private int size = 0;
    private Node front;  // Points to the front of the queue
    private Node end;    // Points to the rear of the queue

    @Override
    public void enqueue(T value) {
        Node newNode = new Node(value);

        if (size == 0) {
            front = newNode;
            end = newNode;
        } else {
            end.next = newNode;  // Link the old end node to the new node
            end = newNode;       // Update the end to the new node
        }
        size++;
    }

    @Override
    public T dequeue() {
        if (size == 0) {
            throw new RuntimeException("No objects exist in the queue!");
        }
        T returnVal = front.value;
        front = front.next;  // Move start to the next node

        if (front == null) {  // If the queue becomes empty, reset end
            end = null;
        }
        size--;
        return returnVal;
    }

    @Override
    public T peek() {
        if (size == 0) {
            throw new RuntimeException("No objects exist in the queue!");
        }
        return front.value;  // Peek at the front of the queue
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        front = null;
        end = null;
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
        Node currentNode = front;  // Start from the front of the queue
        StringBuilder sb = new StringBuilder();
        sb.append("(FRONT) ");
        while (currentNode != null) {
            sb.append("[").append(currentNode.value).append("]");
            if (currentNode.next != null) {
                sb.append(" <-- ");
            }
            currentNode = currentNode.next;
        }
        sb.append(" (REAR)");

        System.out.println(sb);
    }
}
