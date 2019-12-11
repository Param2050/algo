package linkedlist;

public class NthNodeFromEnd {
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
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("");
    }

    private void findNthNodeFromEnd(int k) {
        ListNode current = head;
        ListNode main = head;
        int count = 0;

        while(count < k) {
            current = current.next;
            count++;
        }

        while (current != null) {
            main = main.next;
            current = current.next;
        }

        System.out.println("Nth node from end of the linked list is : " + main.data);
    }

    public static void main(String args []) {
        NthNodeFromEnd obj = new NthNodeFromEnd();

        obj.push(60);
        obj.push(50);
        obj.push(40);
        obj.push(30);
        obj.push(20);
        obj.push(10);

        obj.printList();

        obj.findNthNodeFromEnd(6);

    }
}
