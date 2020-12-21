package tree;


import java.util.LinkedList;
import java.util.Queue;

public class CheckTreeIsBst {

    TreeNode root;
    CheckTreeIsBst() {
        root = null;
    }

    public static void main(String args []) {
        CheckTreeIsBst obj = new CheckTreeIsBst();
        obj.root = new TreeNode(4);
        obj.root.left = new TreeNode(2);
        obj.root.right = new TreeNode(5);
        obj.root.left.left = new TreeNode(1);
        obj.root.left.right = new TreeNode(3);

        if(checkIfBst(obj.root)) {
            System.out.println("BST");
        }else {
            System.out.println("Not BST");
        }

    }

    private static boolean checkIfBst(TreeNode root) {
        return isBstUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isBstUtil(TreeNode root, int min, int max) {

        if(root == null) {
            return true;
        }

        if(root.key < min || root.key > max) {
            return false;
        }

        return isBstUtil(root.left, min, root.key-1) && isBstUtil(root.right, root.key+1, max);
    }
}
