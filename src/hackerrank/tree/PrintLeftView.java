package hackerrank.tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLeftView {

    BinaryNode root;
    PrintLeftView() {
        root = null;
    }

    public static void main(String args []) {
        PrintLeftView obj = new PrintLeftView();
        obj.root = new BinaryNode(10);
        obj.root.left = new BinaryNode(2);
        obj.root.right = new BinaryNode(3);
        obj.root.left.left = new BinaryNode(7);
        obj.root.left.right = new BinaryNode(8);
        obj.root.right.right = new BinaryNode(15);
        obj.root.right.left = new BinaryNode(12);
        obj.root.right.right.left = new BinaryNode(14);

        printLeftView(obj.root);

    }

    private static void printLeftView(BinaryNode root) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);

        while (!queue.isEmpty()) {

            int n = queue.size();
            for(int i=1; i<=n; i++) {
                BinaryNode tempNode = queue.poll();
                if(i == 1) {
                    System.out.print(tempNode.key + " ");
                }

                if (tempNode.left != null) {
                    queue.add(tempNode.left);
                }

                if (tempNode.right != null) {
                    queue.add(tempNode.right);
                }
            }
        }
    }
}
