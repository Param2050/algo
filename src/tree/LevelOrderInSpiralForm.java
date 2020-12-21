package tree;


import java.util.*;

public class LevelOrderInSpiralForm {

    TreeNode root;
    LevelOrderInSpiralForm() {
        root = null;
    }

    public static void main(String args []) {
        LevelOrderInSpiralForm obj = new LevelOrderInSpiralForm();
        obj.root = new TreeNode(10);
        obj.root.left = new TreeNode(2);
        obj.root.right = new TreeNode(3);
        obj.root.left.left = new TreeNode(7);
        obj.root.left.right = new TreeNode(8);
        obj.root.right.right = new TreeNode(15);
        obj.root.right.left = new TreeNode(12);
        obj.root.right.right.left = new TreeNode(14);

        printLevelOrderInSpiralForm(obj.root);

    }

    private static void printLevelOrderInSpiralForm(TreeNode root) {
        if(root == null) {
            return;
        }

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        s1.push(root);

        while(!s1.isEmpty() || !s2.isEmpty()) {

            while (!s1.isEmpty()) {
                TreeNode temp = s1.pop();
                System.out.print(temp.key + " ");

                if(temp.right != null)
                    s2.push(temp.right);

                if(temp.left != null)
                    s2.push(temp.left);

            }

            while (!s2.isEmpty()) {

                TreeNode temp = s2.pop();
                System.out.print(temp.key + " ");

                if(temp.left != null)
                    s1.push(temp.left);

                if(temp.right != null)
                    s1.push(temp.right);

            }

        }

    }
}
