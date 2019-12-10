package linkedlist;

public class FindMiddle {
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

    private void findMiddle() {
        ListNode slow = head;
        ListNode fast = head;

        if(head != null) {

            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            System.out.println("\n" + "Middle element is : " + slow.data);
        }

    }

    public static void main(String args[]) {
        FindMiddle obj = new FindMiddle();
        obj.push(5);
        obj.push(4);
        obj.push(3);
        obj.push(2);
        obj.push(1);
        obj.printList();

        obj.findMiddle();


    }
}
