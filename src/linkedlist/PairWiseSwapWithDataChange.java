package linkedlist;

public class PairWiseSwapWithDataChange {

    ListNode head;

    private class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private void push(int data) {
        ListNode new_node = new ListNode(data);
        new_node.next = head;
        head = new_node;
    }

    private void printList() {
        ListNode curr = head;
        while(curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
    }

    private void swapPairWiseWithDataChange() {

        ListNode temp = head;

        while(temp != null && temp.next != null) {
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }
    }

    public static void main(String args[]) {
        PairWiseSwapWithDataChange obj = new PairWiseSwapWithDataChange();

        obj.push(6);
        obj.push(5);
        obj.push(4);
        obj.push(3);
        obj.push(2);
        obj.push(1);
        System.out.println("Before pairwise swap : ");
        obj.printList();

        System.out.println("After pairwise swap : ");
        obj.swapPairWiseWithDataChange();
        obj.printList();

    }

}
