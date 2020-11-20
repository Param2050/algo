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
        } else if(position == 0){
            ListNode currNode = head;
            head = currNode.next;
        } else {
            ListNode currNode = head;
            ListNode prevNode = null;
            int i=0;
            while(currNode.next != null && position>i) {
                prevNode = currNode;
                currNode = currNode.next;
                i++;
            }
            prevNode.next = currNode.next;
        }
    }

    public static void main(String args[]) {
        DeleteAtGivenPosition obj = new DeleteAtGivenPosition();
        obj.push(18);
        obj.push(5);
        obj.push(16);
        obj.push(18);
        obj.push(8);
        obj.push(12);
        obj.push(11);
        obj.printList();

        obj.deleteNodeAtGivenPosition(0);
        obj.printList();

    }
}
