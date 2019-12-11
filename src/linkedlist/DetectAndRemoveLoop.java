package linkedlist;

public class DetectAndRemoveLoop {
    ListNode head;

    private class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            next = null;
        }
    }

    private void push(int data) {
        ListNode new_node = new ListNode(data);
        new_node.next = head;
        head = new_node;
    }

    void printList() {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null) {
            System.out.print(curr.data + " ->");
            prev = curr;
            curr = curr.next;
        }
        prev.next = head.next.next;
        System.out.println();
    }

    private void detectAndRemoveLoop() {
        ListNode slow = head;
        ListNode fast = head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                System.out.println("Loop Found");
                break;
            }
        }

        if(slow == fast) {
            slow = head;

            while(slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
            System.out.println("Starting point of loop " + slow.next.data);
            fast.next = null;
        }

    }


    public static void main(String args[]) {
        DetectAndRemoveLoop obj = new DetectAndRemoveLoop();

        obj.push(5);
        obj.push(4);
        obj.push(3);
        obj.push(2);
        obj.push(1);

        obj.printList();;

        obj.detectAndRemoveLoop();

        obj.printList();;
    }


}
