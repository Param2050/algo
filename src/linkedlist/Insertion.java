package linkedlist;

public class Insertion {

    ListNode head;

 private class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data) {
        ListNode new_node = new ListNode(data);
        new_node.next = head;
        head = new_node;
    }

    public void printLinkedList() {
        ListNode tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " -> ");
            tNode = tNode.next;
        }
    }

    public static void main(String args[]) {
        Insertion insertion = new Insertion();

        insertion.push(5);
        insertion.push(4);
        insertion.push(3);
        insertion.push(2);
        insertion.push(1);

        insertion.printLinkedList();

    }


}
