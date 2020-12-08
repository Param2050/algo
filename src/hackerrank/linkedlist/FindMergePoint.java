package hackerrank.linkedlist;


public class FindMergePoint {
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
        System.out.println();
    }

    public static void main(String args[]) {
        FindMergePoint list1 = new FindMergePoint();
        FindMergePoint list2 = new FindMergePoint();
        list1.push(40);
        list1.push(30);
        list1.push(25);
        list1.push(20);
        list1.push(10);

        list1.printList();

        list2.push(40);
        list2.push(30);
        list2.push(5);
        list2.printList();

        int val = list1.getNode(list2);
        System.out.println("Merge point is " + val);
    }

    private int getNode(FindMergePoint list2) {
        ListNode h1 = this.head;
        ListNode h2 = list2.head;

        while( h1.data != h2.data) {
            if(h1.next == null) {
                h1 = list2.head;
            }else {
                h1 = h1.next;
            }

            if(h2.next == null) {
                h2 = this.head;
            }else {
                h2 = h2.next;
            }
        }
        return h1.data;
    }
}
