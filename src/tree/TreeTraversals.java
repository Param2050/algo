package tree;

public class TreeTraversals {

    TreeNode root;

    TreeTraversals() {
        root = null;
    }

    public static void main(String args []) {
        TreeTraversals obj = new TreeTraversals();
        obj.root = new TreeNode(1);
        obj.root.left = new TreeNode(2);
        obj.root.right = new TreeNode(3);
        obj.root.left.left = new TreeNode(4);
        obj.root.left.right = new TreeNode(5);

        System.out.println("Inorder traversals");
        obj.inorder(obj.root);

        System.out.println("\nPostorder traversals");
        obj.postOrder(obj.root);

        System.out.println("\nPreorder traversals");
        obj.preOrder(obj.root);
    }

    private void preOrder(TreeNode rootNode) {

        if(rootNode == null) {
            return;
        }

        System.out.print( rootNode.key + " -> ");
        preOrder(rootNode.left);
        preOrder(rootNode.right);

    }


    private void inorder(TreeNode rootNode) {
        if(rootNode == null) {
            return;
        }

        inorder(rootNode.left);
        System.out.print( rootNode.key + " -> ");
        inorder(rootNode.right);
    }

    private void postOrder(TreeNode rootNode) {
        if(rootNode == null) {
            return;
        }

        postOrder(rootNode.left);
        postOrder(rootNode.right);
        System.out.print( rootNode.key + " -> ");
    }


}
