package linkedlist;

public class Sort012WithChangeLinks {

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

    private void sort012WithChangeLinks() {

        ListNode zeroD = new ListNode(0);
        ListNode oneD = new ListNode(0);
        ListNode twoD = new ListNode(0);


        ListNode zero = zeroD;
        ListNode one = oneD;
        ListNode two = twoD;

        ListNode curr = head;

        while (curr != null) {
            if(curr.data == 0) {
                zero.next = curr;
                zero = zero.next;
                curr = curr.next;
            } else if(curr.data == 1) {
                one.next = curr;
                one = one.next;
                curr = curr.next;
            } else {
                two.next = curr;
                two = two.next;
                curr = curr.next;
            }
        }


        zero.next = (oneD.next != null) ? (oneD.next) : (twoD.next);
        one.next = twoD.next;
        two.next = null;

        head = zeroD.next;

    }

    public static void main(String args[]) {
        Sort012WithChangeLinks obj = new Sort012WithChangeLinks();

        obj.push(0);
        obj.push(2);
        obj.push(0);
        obj.push(1);
        obj.push(0);
        obj.push(2);
        System.out.println("Before sorting : ");
        obj.printList();
        System.out.println("\nAfter sorting : ");
        obj.sort012WithChangeLinks();
        obj.printList();
    }
}
