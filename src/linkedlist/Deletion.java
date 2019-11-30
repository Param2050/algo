package linkedlist;

public class Deletion {
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

    public void printList() {
        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("");
    }

    public void deleteNode(int key) {

        ListNode curr = head;
        ListNode prev = null;

        if (prev == null && curr.data == key) {
            head = curr.next;
            curr.next = null;
            return;
        }

        while (curr != null) {

            if (curr.data == key) {
                prev.next = curr.next;
                break;
            } else {
                prev = curr;
                curr = curr.next;
            }

        }

    }


    public static void main(String args[]) {
        Deletion deletion = new Deletion();
        deletion.push(9);
        deletion.push(7);
        deletion.push(5);
        deletion.push(3);
        deletion.push(1);

        System.out.println("Before deletion");
        deletion.printList();
        deletion.deleteNode(5);
        System.out.println("After deletion");
        deletion.printList();

    }
}
