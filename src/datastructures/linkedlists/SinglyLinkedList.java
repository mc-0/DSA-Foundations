package datastructures.linkedlists;

public class SinglyLinkedList<T> {

    private Node head;
    private Node tail;
    private int length;

    public SinglyLinkedList(){
        this.length = 0;
    }


    private class Node<T>{
        private T value;
        private Node next;

        Node(T value){
            this.value = value;
            this.next = null;
        }
    }

    public void add(T value){
        Node node = new Node(value);
        if (length == 0){
            head = node;
        }
        else {
            tail.next = node;
        }
        tail = node;
        length++;
    }

    public void getHeadAndTail(){
        System.out.println("Head of linked list: " + head.value);
        System.out.println("Tail of linked list: " + tail.value);
        System.out.println(length);
    }

    public void printLinkedList(){
        Node currentNode = head;
        StringBuilder sb = new StringBuilder();

        while (currentNode.next != null){
            sb.append(currentNode.value).append(" --> ");
            currentNode = currentNode.next;
        }
        sb.append(currentNode.value).append(" --> ");
        sb.append("null");
        System.out.println(sb);
    }

    public void insert(int position, T value){
        Node newNode = new Node<>(value);
        Node currentNode = head;
        Node previousNode = null;
        int currentPosition = 1;

        if (position == currentPosition){
            newNode.next = currentNode;
            head = newNode;
            return;
        }

        while ( currentPosition < position){
            previousNode = currentNode;
            currentNode = currentNode.next;
            currentPosition++;
        }

        previousNode.next = newNode;
        newNode.next = currentNode;

    }

    public void remove(T value){
        Node currentNode = head;
        Node previousNode = null;

        while (currentNode.next != null){
            if (currentNode.value == value){
                if (previousNode == null){
                    head = currentNode.next;
                    break;
                }
                previousNode.next = currentNode.next;
                break;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }

    }



}
