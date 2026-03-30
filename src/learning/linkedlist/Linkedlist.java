package learning.linkedlist;


public class Linkedlist {
    private Node head;
    private Node tail;
    private int size;

    public Linkedlist() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        tail = head;
        size++;
    }

    public void insertLast(int value) {
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size++;

    }

    public void deleteFirst() {
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    public void deleteLast() {
        Node temp = head;
//        2->7->9->10
        if (size <= 1) {
            deleteFirst();
            return;
        }
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
    }
//        2->7->9->10
    public Node get(int index){
        Node temp=head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return temp;
    }

    public void deleteAny(int index){
        if(index==1){
            deleteFirst();
            return;
        }
        if(index==size){
            deleteLast();
            return;
        }
        Node prev=get(index-1);
        prev.next=prev.next.next;
        size--;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;

        }
    }

    public void insertToAnyIndex(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }
        Node temp = head;
//        3->7>9>10

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(value, temp.next);
        temp.next = newNode;
        size++;


    }
//    private Node insertRec(int index,int value,Node Node){
//        if(index==0){
//            Node node=new Node(value,Node);
//        }
//        Node.next=insertRec(index--,value,Node.next);
////        return Node;
//    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }


    }
}

