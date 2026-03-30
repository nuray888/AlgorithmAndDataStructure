package learning.linkedlist;

public class CircularLinkedList {
    Node head;
    Node tail;
    int size;

    public void deleteFirst() {
        Node temp = head;
        if (head != null) {
            do {
                temp = temp.next;
            } while (temp != head);
        }

        temp.next = head.next;
        head = head.next;
        temp=null;

        size--;
    }

    public void insert(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size++;

    }

    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.index + "->");
                temp = temp.next;
            } while (temp != head);
        }
    }
//    2->3>4>5


    private class Node {
        private int index;
        private Node next;

        public Node(int index) {
            this.index = index;
        }
    }
}
