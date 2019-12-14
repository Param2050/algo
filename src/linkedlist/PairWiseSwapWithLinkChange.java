package linkedlist;

public class PairWiseSwapWithLinkChange {

    static ListNode head;

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
    }

    private ListNode swapPairWiseWithLinkChange(ListNode node) {

        ListNode prev = node;
        ListNode curr = node.next;
        node = curr;

        while(true) {

            ListNode next = curr.next;
            curr.next = prev;

            if(next == null || next.next == null) {
                prev.next = next;
                break;
            }

            prev.next = next.next;

            prev = next;
            curr = prev.next;
        }
        return node;
    }

    public static void main(String args[]) {

        PairWiseSwapWithLinkChange obj = new PairWiseSwapWithLinkChange();

        obj.head = new ListNode(1);
        obj.head.next = new ListNode(2);
        obj.head.next.next = new ListNode(3);
        obj.head.next.next.next = new ListNode(4);
        obj.head.next.next.next.next = new ListNode(5);
        obj.head.next.next.next.next.next = new ListNode(6);

        System.out.println("Before pairwise swap : ");
        obj.printList(obj.head);

        System.out.println("After pairwise swap : ");
        obj.head = obj.swapPairWiseWithLinkChange(obj.head);
        obj.printList(obj.head);
    }

}
