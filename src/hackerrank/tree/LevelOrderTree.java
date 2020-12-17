package hackerrank.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTree {

    BinaryNode root;
    LevelOrderTree() {
        root = null;
    }


    public static void main(String args []) {
        LevelOrderTree obj = new LevelOrderTree();
        obj.root = new BinaryNode(1);
        obj.root.left = new BinaryNode(2);
        obj.root.right = new BinaryNode(3);
        obj.root.left.left = new BinaryNode(4);
        obj.root.left.right = new BinaryNode(5);

        levelOrderTree(obj.root);

    }

    private static void levelOrderTree(BinaryNode root) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);

        while (!queue.isEmpty()) {

            BinaryNode tempNode = queue.poll();
            System.out.print(tempNode.key + " ");

            if(tempNode.left != null) {
                queue.add(tempNode.left);
            }

            if(tempNode.right != null) {
                queue.add(tempNode.right);
            }

        }
    }
}
