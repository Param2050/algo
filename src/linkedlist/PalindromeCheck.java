package linkedlist;

import java.util.List;

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

    private boolean checkPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = reverse(slow);
        fast = head;

        while (slow != null) {
            if(slow.data != fast.data) {
                return false;
            }

            slow = slow.next;
            fast = fast.next;

        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode nextP = null;

        while(curr != null) {
            nextP = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextP;
        }
        return prev;
    }



    public static void main(String args[]) {
        PalindromeCheck obj = new PalindromeCheck();

        obj.push('5');
        obj.push('4');
        obj.push('3');
        obj.push('4');
        obj.push('5');

        if(obj.checkPalindrome(obj.head)) {
            System.out.println("Parlindrome");
        } else {
            System.out.println("Not parlindrome");
        }

    }
}
