package hackerrank.linkedlist;

public class GetNodeValueFromTail {
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
        GetNodeValueFromTail list1 = new GetNodeValueFromTail();
        list1.push(4);
        list1.push(3);
        list1.push(2);
        list1.push(1);
        list1.printList();
        int nodeValue = list1.getNodeValue(2);
        System.out.println("Node value is : " + nodeValue);
    }

    private int getNodeValue(int position) {
        ListNode currNode = head;
        int totalNodeCount = 0;
        while (currNode != null) {
            currNode = currNode.next;
            totalNodeCount++;
        }
        currNode = head;
        for(int i=0; i<(totalNodeCount-position-1); i++) {
            currNode = currNode.next;
        }
        return currNode.data;
    }
}
