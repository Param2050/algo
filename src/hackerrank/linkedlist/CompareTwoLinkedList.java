package hackerrank.linkedlist;

public class CompareTwoLinkedList {
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

//    private void deleteNodeAtGivenPosition(int position) {
//        if(head == null) {
//        } else if(position == 0){
//            ListNode currNode = head;
//            head = currNode.next;
//        } else {
//            ListNode currNode = head;
//            ListNode prevNode = null;
//            int i=0;
//            while(currNode.next != null && position>i) {
//                prevNode = currNode;
//                currNode = currNode.next;
//                i++;
//            }
//            prevNode.next = currNode.next;
//        }
//    }

    public static void main(String args[]) {
        CompareTwoLinkedList list1 = new CompareTwoLinkedList();
        CompareTwoLinkedList list2 = new CompareTwoLinkedList();
        list1.push(3);
        list1.push(2);
        list1.push(1);
        list1.printList();
        list2.push(6);
        list2.push(5);
        list2.push(4);
        list2.printList();
        if(list1.isIdentical(list1, list2)) {
            System.out.println("This list is identical");
        }else {
            System.out.println("Not identical");
        }

    }

    private boolean isIdentical(CompareTwoLinkedList list1, CompareTwoLinkedList list2) {
        ListNode a = list1.head;
        ListNode b = list2.head;
        while(a != null && b != null) {
            if(a.data != b.data) {
                return false;
            }
            a = a.next;
            b= b.next;
        }
        return (a== null && b== null);
    }
}
