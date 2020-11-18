package hackerrank.linkedlist;

public class InsertAtGivenPosition {
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

    private void insertNodeAtGivenPosition(int data, int position) {
        if(head == null) {
            ListNode newNode = new ListNode(data);
            head = newNode;
        } else {
            ListNode currNode = head;
            ListNode prevNode = null;
            int i=0;
            while(currNode.next != null && i<position) {
                prevNode = currNode;
                currNode = currNode.next;
                i++;
            }
            ListNode newNode = new ListNode(data);
            prevNode.next = newNode;
            newNode.next = currNode;
        }
    }

    public static void main(String args[]) {
        InsertAtGivenPosition obj = new InsertAtGivenPosition();
        obj.push(5);
        obj.push(4);
        obj.push(2);
        obj.push(1);
        obj.printList();

        obj.insertNodeAtGivenPosition(3, 2);
        obj.printList();

    }
}
