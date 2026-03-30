package learning.linkedlist;

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoubleLinkedList() {
        this.size = 0;
    }
    //        null<-2->7->9->10

    public void insertFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
        size++;
    }

    //    2->7->9->10
    public void insertLast(int value) {
        Node newNode = new Node(value);
        newNode.next=null;
        if(head==null){
            newNode.prev=null;
            head=tail=newNode;
            size++;
            return;
        }
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=newNode;
        newNode.prev=last;
        tail=newNode;
        size++;
    }

    //    2->7->9->10
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;

        }
    }

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

    }
}
