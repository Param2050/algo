package hackerrank.tree;

import tree.TreeNode;
import tree.TreeTraversals;

public class HeightOfTree {

    BinaryNode root;
    HeightOfTree() {
        root = null;
    }



    public static void main(String args []) {
        HeightOfTree obj = new HeightOfTree();
        obj.root = new BinaryNode(1);
        obj.root.left = new BinaryNode(2);
        obj.root.right = new BinaryNode(3);
        obj.root.left.left = new BinaryNode(4);
        obj.root.left.right = new BinaryNode(5);

        int height = getHeightOfTree(obj.root);
        System.out.println("Height of a tree is : " + height);
    }

    private static int getHeightOfTree(BinaryNode root) {

        if(root == null) {
            return -1;
        }

        int lDepth = getHeightOfTree(root.left);
        int rDepth = getHeightOfTree(root.right);

        if(lDepth > rDepth)
            return (lDepth+1);
        else
            return (rDepth+1);
    }
}
