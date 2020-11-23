package hackerrank.linkedlist;

// Given a sorted linked list delete duplicates values

public class DeleteDuplicateValuesFromLinkedList {
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

    public static void main(String args[]) {
        DeleteDuplicateValuesFromLinkedList list1 = new DeleteDuplicateValuesFromLinkedList();
        list1.push(5);
        list1.push(5);
        list1.push(4);
        list1.push(3);
        list1.push(3);
        list1.push(3);
        list1.printList();
        list1.deleteDuplicatesValues();
        list1.printList();
    }

    private ListNode deleteDuplicatesValues() {
        if(head == null) {
            return null;
        }

        ListNode prev = head;
        ListNode curr = head;
        while(curr != null && curr.next != null) {
            curr = curr.next;
            if(prev.data == curr.data) {
                prev.next = curr.next;
            }else {
                prev = curr;
            }
        }
        return head;
    }

}
