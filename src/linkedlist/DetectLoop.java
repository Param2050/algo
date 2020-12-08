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

    private void push(int data) {
        ListNode new_node = new ListNode(data);
        new_node.next = head;
        head = new_node;
    }

    private void printList() {
        ListNode curr = head;
        while(curr != null) {
            System.out.print(curr.data + " ->");
            curr = curr.next;
        }
        System.out.println();
    }

    private void detectLoop() {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Loop found");
        }else {
            System.out.println("No loop found");
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
        detectLoop.head.next.next.next.next.next = detectLoop.head.next;
        detectLoop.detectLoop();

    }

}
