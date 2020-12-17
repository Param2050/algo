package hackerrank.tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintRightView {

    BinaryNode root;
    PrintRightView() {
        root = null;
    }

    public static void main(String args []) {
        PrintRightView obj = new PrintRightView();
        obj.root = new BinaryNode(10);
        obj.root.left = new BinaryNode(2);
        obj.root.right = new BinaryNode(3);
        obj.root.left.left = new BinaryNode(7);
        obj.root.left.right = new BinaryNode(8);
        obj.root.right.right = new BinaryNode(15);
        obj.root.right.left = new BinaryNode(12);
        obj.root.right.right.left = new BinaryNode(14);

        printRightView(obj.root);

    }

    private static void printRightView(BinaryNode root) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);

        while (!queue.isEmpty()) {

            int n = queue.size();
            for(int i=1; i<=n; i++) {
                BinaryNode tempNode = queue.poll();
                if(i == n) {
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
