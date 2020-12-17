package tree;


import java.util.LinkedList;
import java.util.Queue;

public class PrintRightView {

    TreeNode root;
    PrintRightView() {
        root = null;
    }

    public static void main(String args []) {
        PrintRightView obj = new PrintRightView();
        obj.root = new TreeNode(10);
        obj.root.left = new TreeNode(2);
        obj.root.right = new TreeNode(3);
        obj.root.left.left = new TreeNode(7);
        obj.root.left.right = new TreeNode(8);
        obj.root.right.right = new TreeNode(15);
        obj.root.right.left = new TreeNode(12);
        obj.root.right.right.left = new TreeNode(14);

        printRightView(obj.root);

    }

    private static void printRightView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while (!queue.isEmpty()) {

            int n = queue.size();
            for(int i=1; i<=n; i++) {
                TreeNode tempNode = queue.poll();
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
