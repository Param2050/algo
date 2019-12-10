package linkedlist;

public class DetectLoop {

    ListNode head;

    private class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            next = null;
        }
    }

    void push(int data) {
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

    void detectLoop() {
        ListNode slow = head;
        ListNode fast = head;

        while(slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                System.out.println("Loop found ");
                break;
            }
        }

    }


    public static void main(String args[]) {
        DetectLoop detectLoop = new DetectLoop();

        detectLoop.push(5);
        detectLoop.push(4);
        detectLoop.push(3);
        detectLoop.push(2);
        detectLoop.push(1);

        detectLoop.printList();

        detectLoop.detectLoop();

    }

}
