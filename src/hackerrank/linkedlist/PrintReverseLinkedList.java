package hackerrank.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class PrintReverseLinkedList {
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
        System.out.println();
    }

    private void printLinkedListInReverseManner(ListNode head) {
        if(head == null)
            return;
        printLinkedListInReverseManner(head.next);
        System.out.println(head.data);
    }

    public static void main(String args[]) {
        PrintReverseLinkedList obj = new PrintReverseLinkedList();
        obj.push(3);
        obj.push(2);
        obj.push(1);
        obj.printList();

        obj.printLinkedListInReverseManner(obj.head);

    }

}
