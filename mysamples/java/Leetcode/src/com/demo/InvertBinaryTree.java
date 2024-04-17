package com.demo;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        // Base condition
        if (root == null)
            return null;

        // Invert left and right subtrees recursively
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        // Swap left and right subtrees
        root.left = right;
        root.right = left;

        return root;
    }

    // Example usage:
    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        // Invert the binary tree
        InvertBinaryTree solution = new InvertBinaryTree();
        TreeNode invertedRoot = solution.invertTree(root);

        // Print the inverted tree (in-order traversal)
        printInOrder(invertedRoot);
    }

    // Helper method to print the tree using in-order traversal
    private static void printInOrder(TreeNode node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.val + " ");
            printInOrder(node.right);
        }
    }
}
