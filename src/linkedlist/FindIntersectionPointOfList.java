package linkedlist;

public class FindIntersectionPointOfList {

   static ListNode head1, head2;

    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private int getCount(ListNode node) {

        ListNode curr = node;
        int count = 0;

        while (curr != null) {
            curr = curr.next;
            count++;
        }
    return count;
    }

    private int getIntersectNode(int d, ListNode h1, ListNode h2) {

        ListNode current1 = h1;
        ListNode current2 = h2;

        for(int i=1; i<= d; i++) {
            current1 = current1.next;
        }

        while (current1 != null && current2 != null) {
            if(current1.data == current2.data) {
                return current1.data;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
        return -1;
    }


    private int getIntersectionNode() {

        int c1 = getCount(head1);
        int c2 = getCount(head2);

        if(c1 > c2) {
            int diff = c1-c2;
            return getIntersectNode(diff, head1, head2);
        } else {
            int diff = c2-c1;
            return getIntersectNode(diff, head2, head1);
        }
    }


    public static void main(String args[]) {
        FindIntersectionPointOfList obj = new FindIntersectionPointOfList();

        // creating first linked list
        obj.head1 = new ListNode(3);
        obj.head1.next = new ListNode(6);
        obj.head1.next.next = new ListNode(9);
        obj.head1.next.next.next = new ListNode (19);
        obj.head1.next.next.next.next = new ListNode(30);

        // creating second linked list
        obj.head2 = new ListNode(10);
        obj.head2.next = new ListNode(19);
        obj.head2.next.next = new ListNode(30);

        System.out.println("Intersection node of two linkedList is : " +
                obj.getIntersectionNode());

    }

}
