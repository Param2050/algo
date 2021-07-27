package tree;


import java.util.*;

public class PrintTreeInVerticalOrder {

    TreeNode root;
    PrintTreeInVerticalOrder() {
        root = null;
    }

    public static void main(String args []) {
        PrintTreeInVerticalOrder obj = new PrintTreeInVerticalOrder();
        obj.root = new TreeNode(10);
        obj.root.left = new TreeNode(2);
        obj.root.right = new TreeNode(3);
        obj.root.left.left = new TreeNode(7);
        obj.root.left.right = new TreeNode(8);
        obj.root.right.right = new TreeNode(15);
        obj.root.right.left = new TreeNode(12);
        obj.root.right.right.left = new TreeNode(14);

        printTreeInVerticalOrder(obj.root);

    }

    private static void printTreeInVerticalOrder(TreeNode root) {
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

        map.entrySet().forEach(entry -> {
            List<Integer> values = entry.getValue();
            System.out.println();
            values.stream().forEach(value-> System.out.print(value + " "));
        });
    }
}
