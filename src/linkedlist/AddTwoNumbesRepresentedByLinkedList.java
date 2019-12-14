package linkedlist;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class AddTwoNumbesRepresentedByLinkedList {
    Node head;

    private void insert(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    private void printList(Node temp) {
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    private static Node reverse(Node headNode) {

        Node curr = headNode;
        Node prev = null;
        Node nexP = null;

        while(curr != null) {
            nexP = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nexP;
        }
        headNode = prev;
        return headNode;
    }


    private static Node sum(Node l1, Node l2) {

        if(l1 == null) return l2;
        if(l2 == null) return l1;

        l1 = reverse(l1);

        l2 = reverse(l2);

        Node prev = null;
        int carry = 0;
        int sum = 0;

        // pointing head to l1 which is to be reversed later
        Node head = l1;

        while (l1 != null && l2 != null) {
            sum = carry + l1.data + l2.data;
            l1.data = sum % 10;
            carry = sum / 10;
            prev = l1;
            l1 = l1.next;
            l2 = l2.next;
        }

        if(l1 != null || l2 != null) {
            if(l2 != null) {
                prev.next = l2;
            }
            l1 = prev.next;
            while (l1 != null) {
                sum = carry + l1.data;
                l1.data = sum % 10;
                carry = sum / 10;
                prev = l1;
                l1 = l1.next;
            }
        }
        if(carry > 0) {
            prev.next = new Node(carry);
        }

        return reverse(head);
    }

    public static void main(String args[]) {

        AddTwoNumbesRepresentedByLinkedList first = new AddTwoNumbesRepresentedByLinkedList();
        first.insert(3);
        first.insert(6);
        first.insert(5);

        AddTwoNumbesRepresentedByLinkedList second = new AddTwoNumbesRepresentedByLinkedList();
        second.insert(2);
        second.insert(4);
        second.insert(8);

        AddTwoNumbesRepresentedByLinkedList third = new AddTwoNumbesRepresentedByLinkedList();
        Node headNode = sum(first.head, second.head);

        third.printList(headNode);

    }
}
