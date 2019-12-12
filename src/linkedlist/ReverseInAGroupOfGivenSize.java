package linkedlist;

public class ReverseInAGroupOfGivenSize {

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

    private void printList(ListNode headNode) {
        ListNode curr = headNode;
        while(curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
    }

    private ListNode reverseInGroupOfAGivenSize(ListNode head, int k) {

        ListNode current = head;
        ListNode prev = null;
        ListNode nextP = null;
        int count = 0;

        while(count < k && current != null) {
            nextP = current.next;
            current.next = prev;
            prev = current;
            current = nextP;
            count++;
        }

        if(nextP != null) {
            head.next = reverseInGroupOfAGivenSize(nextP, k);
        }

        return prev;
    }

    public static void main(String args[]) {
        ReverseInAGroupOfGivenSize obj = new ReverseInAGroupOfGivenSize();

        obj.push(8);
        obj.push(7);
        obj.push(6);
        obj.push(5);
        obj.push(4);
        obj.push(3);
        obj.push(2);
        obj.push(1);

        System.out.println("Before reverse :");
        obj.printList(obj.head);
        System.out.println("\n" + "After reverse : ");

        obj.head = obj.reverseInGroupOfAGivenSize(obj.head, 2);
        obj.printList(obj.head);

    }

}
