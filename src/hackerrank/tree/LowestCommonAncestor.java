package hackerrank.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LowestCommonAncestor {

    BinaryNode root;
    LowestCommonAncestor() {
        root = null;
    }


    public static void main(String args []) {
        LowestCommonAncestor obj = new LowestCommonAncestor();
        obj.root = new BinaryNode(20);
        obj.root.left = new BinaryNode(8);
        obj.root.right = new BinaryNode(22);
        obj.root.left.left = new BinaryNode(4);
        obj.root.left.right = new BinaryNode(12);
        obj.root.left.right.left = new BinaryNode(10);
        obj.root.left.right.right = new BinaryNode(14);

        int n1 = 10, n2 = 14;
        BinaryNode lca = lowestCommonAncestor(obj.root,n1, n2);
        System.out.println("Lowest Common Ancestor " + lca.key);

        n1 = 14;
        n2 = 8;
        lca = lowestCommonAncestor(obj.root,n1, n2);
        System.out.println("Lowest Common Ancestor " + lca.key);
    }

    private static BinaryNode lowestCommonAncestor(BinaryNode root, int n1, int n2) {

        if(root == null) {
            return null;
        }

        if(root.key > n1 && root.key > n2) {
            return lowestCommonAncestor(root.left, n1, n2);
        }

        if(root.key <n1 && root.key < n2) {
            return lowestCommonAncestor(root.right, n1, n2);
        }

        return root;
    }
}
