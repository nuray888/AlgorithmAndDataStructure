package linkedlist;

public class DeleteNodeLinkedList {
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) return;

        //*  3->5>9>1>4
        //      r
        //  we change value of this node and equal it to the next node
        //*  3>9->9->1->4
        //! after we say this node's next equal to node's next next
        //* 3->9->1->4


        node.val = node.next.val;
        node.next = node.next.next;
    }
}
