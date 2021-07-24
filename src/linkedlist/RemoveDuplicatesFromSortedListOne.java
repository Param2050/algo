package linkedlist;

public class RemoveDuplicatesFromSortedListOne {

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

    public static void main(String args[]) {
        RemoveDuplicatesFromSortedListOne obj = new RemoveDuplicatesFromSortedListOne();
        obj.push(3);
        obj.push(3);
        obj.push(1);
        obj.push(1);
        obj.push(1);
        obj.printList();
        System.out.println();
        obj.removeDuplicates();
        obj.printList();

    }

    private void removeDuplicates() {

        if(head == null)
            return ;

        ListNode curr = head;
        ListNode slow = head;

        while(curr.next != null) {
            curr = curr.next;

            if(slow.data == curr.data) {
                slow.next = curr.next;
            }else {
                slow = slow.next;
            }
            if(curr == null)
                break;
        }

    }

}
