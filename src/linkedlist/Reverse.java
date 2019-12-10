package linkedlist;

public class Reverse {
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

    private void revereLinkedList() {
        ListNode prev = null;
        ListNode nextP = null;
        ListNode curr = head;

        while(curr != null) {
            nextP = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextP;
        }
        head = prev;
    }

    public static void main(String args[]) {
        Reverse obj = new Reverse();

        obj.push(5);
        obj.push(4);
        obj.push(3);
        obj.push(2);
        obj.push(1);
        System.out.println("Before reverse linkedList :");
        obj.printList();

        obj.revereLinkedList();

        System.out.println("\n" +"After reverse linkedList :");
        obj.printList();
    }

}
