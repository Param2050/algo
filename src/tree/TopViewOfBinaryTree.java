package tree;


import java.util.*;

public class TopViewOfBinaryTree {

    TreeNode root;
    TopViewOfBinaryTree() {
        root = null;
    }

    public static void main(String args []) {
        TopViewOfBinaryTree obj = new TopViewOfBinaryTree();
        obj.root = new TreeNode(10);
        obj.root.left = new TreeNode(2);
        obj.root.right = new TreeNode(3);
        obj.root.left.left = new TreeNode(7);
        obj.root.left.right = new TreeNode(8);
        obj.root.right.right = new TreeNode(15);
        obj.root.right.left = new TreeNode(12);
        obj.root.right.right.left = new TreeNode(14);

        printTopViewOfTree(obj.root);

    }

    private static void printTopViewOfTree(TreeNode root) {
        if(root == null) {
            return;
        }

        TreeMap<Integer, List<Integer>> map = new TreeMap<>();

        Queue<Qobj> queue = new LinkedList<Qobj>();
        queue.add(new Qobj(0, root));

        while (!queue.isEmpty()) {

            Qobj temp = queue.poll();
            int hd = temp.hd;
            TreeNode treeNode = temp.treeNode;

            if(map.containsKey(hd)) {
                map.get(hd).add(treeNode.key);
            }else {
                List<Integer> al = new ArrayList<>();
                al.add(treeNode.key);
                map.put(hd, al);
            }

            if(treeNode.left != null) {
                queue.add(new Qobj(hd-1, treeNode.left));
            }
            if(treeNode.right != null) {
                queue.add(new Qobj(hd+1, treeNode.right));
            }
        }

        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> values = entry.getValue();
            if(values.size() > 0) {
                System.out.println(values.get(0));
            }
        }
    }
}
