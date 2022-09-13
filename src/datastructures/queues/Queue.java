package datastructures.queues;
// Linked List Implementation
public class Queue<T> {

    private int size = 0;
    private Node start;
    private Node end;

    public void enqueue(T value){
        Node newNode = new Node(value);

        if(size == 0){
            start = newNode;
            end = newNode;
        }
        else{
            start.next = newNode;
            start = newNode;
        }
        size++;
    }

    public Object dequeue(){
        if (size == 0){
            throw new RuntimeException("No objects exist in the queue!");
        }
        Object returnVal = end.value;
        end = end.next;
        size--;
        return returnVal;
    }

    public void peek(){
        if(size == 0){
            System.out.println("Stack is empty!");
        }
        else{
            System.out.println(end.value);
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void printQueue(){
        Node currentNode = end;
        StringBuilder sb = new StringBuilder();
        sb.append("(END) ");
        while (currentNode.next != null){
            sb.append("[" + currentNode.value + "] <-- ");
            currentNode = currentNode.next;
        }
        sb.append("[" + currentNode.value + "] (START)");

        System.out.println(sb);
    }



    private class Node<T>{
        private T value;
        private Node next;

        public Node(T value){
            this.value = value;
            this.next = null;
        }
    }
}
