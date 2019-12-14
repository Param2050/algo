package linkedlist;

public class Sort012WithChangeData {

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

    private void sortZeroOneAndTwosWithChangeData() {
        int count [] = {0,0,0};

        ListNode ptr = head;

        while (ptr != null) {
            count[ptr.data]++;
            ptr = ptr.next;
        }

        ptr = head;
        int i = 0;

        while(ptr != null) {

            if(count[i] == 0) {
                i++;
            } else {
                ptr.data = i;
                --count[i];
                ptr = ptr.next;
            }
        }
    }

    public static void main(String args[]) {
        Sort012WithChangeData obj = new Sort012WithChangeData();

        obj.push(0);
        obj.push(2);
        obj.push(0);
        obj.push(1);
        System.out.println("Before sorting : ");
        obj.printList();
        System.out.println("\nAfter sorting : ");
        obj.sortZeroOneAndTwosWithChangeData();
        obj.printList();
    }
}
