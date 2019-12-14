package linkedlist;

public class PalindromeCheck {
    ListNode head;
    ListNode secondHalf;

    private class ListNode {
        char data;
        ListNode next;

        ListNode(char data) {
            this.data = data;
            this.next = null;
        }
    }

    private void push(char data) {
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

    private boolean checkPalindrome() {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev_slow_ptr = null;

        while (fast != null && fast.next != null) {
            prev_slow_ptr = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast != null) {
            slow = slow.next;
        }

        secondHalf = slow;
        prev_slow_ptr.next = null;
        reverse();

        boolean res = comparePaliandrome(head, secondHalf);
        return res;
    }

    private boolean comparePaliandrome(ListNode first, ListNode second) {

        while(first != null && second != null) {
            if(first.data == second.data) {
                first = first.next;
                second = second.next;
            } else {
                return false;
            }
        }

        if(first == null && second == null)
            return true;


        return false;
    }

    private void reverse() {
        ListNode curr = secondHalf;
        ListNode prev = null;
        ListNode nextP = null;

        while(curr != null) {
            nextP = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextP;
        }
        secondHalf = prev;
    }



    public static void main(String args[]) {
        PalindromeCheck obj = new PalindromeCheck();

        obj.push('a');
        obj.push('b');
        obj.push('c');
        obj.push('c');
        obj.push('b');
        obj.push('a');

        if(obj.checkPalindrome()) {
            System.out.println("Parlindrome");
        } else {
            System.out.println("Not parlindrome");
        }

    }
}
