package hackerrank.linkedlist.doublylinklist;

public class InsertIntoSortedDLL {
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
        InsertIntoSortedDLL dll = new InsertIntoSortedDLL();
        dll.push(7);
        dll.push(6);
        dll.push(4);
        dll.push(1);
        dll.printDLL();
        dll.insertIntoSortedDLL(8);
        dll.printDLL();
    }

    private void insertIntoSortedDLL(int data) {
        ListNode newNode = new ListNode(data);
        if(head == null) {
            head = newNode;
        } else if(data < head.data) {
            newNode.next = head;
            newNode.prev = null;
            head = newNode;
        }else {

            ListNode curr = head;

            while(curr.next != null && curr.next.data < newNode.data) {
                curr = curr.next;
            }

            newNode.next = curr.next;

            if(curr.next != null) {
                newNode.next.prev = newNode;
            }

            curr.next = newNode;
            newNode.prev = curr;

        }

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
