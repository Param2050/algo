package hackerrank.linkedlist;

public class DeleteAtGivenPosition {
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

    private void deleteNodeAtGivenPosition(int position) {
        if(head == null) {
        } else {
            ListNode currNode = head;
            ListNode prevNode = null;
            int i=0;
            while(currNode.next != null && i<position) {
                prevNode = currNode;
                currNode = currNode.next;
                i++;
            }
            prevNode.next = currNode.next;
        }
    }

    public static void main(String args[]) {
        DeleteAtGivenPosition obj = new DeleteAtGivenPosition();
        obj.push(5);
        obj.push(4);
        obj.push(2);
        obj.push(1);
        obj.printList();

        obj.deleteNodeAtGivenPosition(3);
        obj.printList();

    }
}
