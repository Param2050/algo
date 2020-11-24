package hackerrank.linkedlist.doublylinklist;

public class InsertAtTheEnd {
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
        InsertAtTheEnd dll = new InsertAtTheEnd();
        dll.push(3);
        dll.push(2);
        dll.push(1);
        dll.printDLL();
        dll.inserAtEnd(4);
        dll.printDLL();
    }

    private void inserAtEnd(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = null;

        ListNode last = head;

        if(head == null) {
            head = newNode;
            newNode.prev = null;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
        newNode.prev = last;
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
