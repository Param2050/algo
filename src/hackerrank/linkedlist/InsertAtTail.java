package hackerrank.linkedlist;

public class InsertAtTail {
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

    private void insertNodeAtTail(int data) {
        ListNode currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        ListNode newNode = new ListNode(data);
        currNode.next = newNode;
    }

    public static void main(String args[]) {
        InsertAtTail obj = new InsertAtTail();
        obj.push(6);
        obj.push(5);
        obj.push(4);
        obj.push(3);
        obj.push(2);
        obj.push(1);
        obj.printList();

        obj.insertNodeAtTail(7);
        obj.printList();

    }
}
