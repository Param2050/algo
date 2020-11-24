package hackerrank.linkedlist.doublylinklist;

import hackerrank.linkedlist.DeleteDuplicateValuesFromLinkedList;

public class DLL {
    ListNode head;

    class ListNode {
        int data;
        ListNode next;
        ListNode prev;

        ListNode(int data) {
            this.data = data;
        }
    }

    private void push(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        newNode.prev = null;

        if(head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }


    public static void main(String args[]) {
        DLL dll = new DLL();
        dll.push(3);
        dll.push(2);
        dll.push(1);
        dll.printDLL();
    }

    private void printDLL() {
        ListNode curr = head;
        while(curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println();
    }

}
