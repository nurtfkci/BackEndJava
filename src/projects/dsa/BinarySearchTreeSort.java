package projects.dsa;

public class BinarySearchTreeSort {

    static class TreeNode {
        int value;
        TreeNode left, right;

        TreeNode(int item) {
            value = item;
            left = right = null;
        }
    }

    static TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }

        if (value < root.value) {
            root.left = insert(root.left, value);
        } else if (value > root.value) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    static void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.value + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        int[] values = {7, 5, 1, 8, 3, 6, 0, 9, 4, 2};
        TreeNode root = null;

        for (int value : values) {
            root = insert(root, value);
        }

        System.out.println("In-order Traversal of BST:");
        inorderTraversal(root);
    }
}
