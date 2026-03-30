package learning.linkedlist;


public class Main {
    public static void main(String[] args) {
//        Linkedlist linkedlist = new Linkedlist();
//        linkedlist.insertFirst(1);
//        linkedlist.insertFirst(2);
//        linkedlist.insertFirst(3);
//        linkedlist.insertFirst(4);
//        linkedlist.display();
//        linkedlist.deleteLast();
//        System.out.println();
//        linkedlist.display();

        CircularLinkedList linkedlist = new CircularLinkedList();
        linkedlist.insert(1);
        linkedlist.insert(2);
        linkedlist.insert(3);
        linkedlist.insert(4);
        linkedlist.display();
        linkedlist.deleteFirst();
        System.out.println();
        linkedlist.display();


    }
}
