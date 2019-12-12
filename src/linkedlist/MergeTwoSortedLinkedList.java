package linkedlist;

public class MergeTwoSortedLinkedList {

    static ListNode head1, head2, head3;

    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private void printList(ListNode headNode) {
        ListNode curr = headNode;
        while(curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println();
    }

    private static ListNode mergeTwoSortedLinkedList(ListNode p, ListNode q, ListNode sort) {

        if(p == null)
            return q;
        if(q == null)
            return p;

        if(p != null && q != null) {

            if(p.data <= q.data) {
                sort = p;
                p = p.next;
            }else {
                sort = q;
                q = q.next;
            }
        }

        ListNode mergeHead = sort;

        while(p != null && q != null) {

            if(p.data <= q.data) {
                sort.next = p;
                sort = p;
                p = p.next;
            }else {
                sort.next = q;
                sort = q;
                q = q.next;
            }
        }

        if(p == null) {
            sort.next = q;
        }

        if(q == null) {
            sort.next = p;
        }

        return mergeHead;
    }

    public static void main(String args[]) {
        MergeTwoSortedLinkedList obj = new MergeTwoSortedLinkedList();

        obj.head1 = new ListNode(10);
        obj.head1.next = new ListNode(50);
        obj.head1.next.next = new ListNode(70);
        obj.head1.next.next.next = new ListNode(90);
        obj.head1.next.next.next.next = new ListNode(100);

        obj.printList(head1);

        obj.head2 = new ListNode(20);
        obj.head2.next = new ListNode(30);
        obj.head2.next.next = new ListNode(40);
        obj.head2.next.next.next = new ListNode(60);
        obj.head2.next.next.next.next = new ListNode(80);
        obj.head2.next.next.next.next.next = new ListNode(120);

        obj.printList(head2);

        obj.head3 = mergeTwoSortedLinkedList(obj.head1, obj.head2, obj.head3);

        System.out.println("After merged two sorted linked list is : ");

        obj.printList(head3);
    }
}
