package com.demo;
//Problem Statement:https://leetcode.com/problems/symmetric-tree/


//Definition for a binary tree node.
class TreeNode {
 int val;
 TreeNode left;
 TreeNode right;

 TreeNode(int val) {
     this.val = val;
     this.left = null;
     this.right = null;
 }
}

public class SymmetricBinaryTree {
 // Method to check if the tree is symmetric
 public static boolean isSymmetric(TreeNode root) {
     if (root == null) {
         return true;
     }
     return isMirror(root.left, root.right);
 }

 // Helper method to check if two subtrees are mirrors of each other
 private static boolean isMirror(TreeNode p, TreeNode q) {
     if (p == null && q == null) {
         return true;
     }
     if (p == null || q == null) {
         return false;
     }
     return (p.val == q.val) && isMirror(p.left, q.right) && isMirror(p.right, q.left);
 }

 public static void main(String[] args) {
     // Example 1: Symmetric Tree
     TreeNode root1 = new TreeNode(1);
     root1.left = new TreeNode(2);
     root1.right = new TreeNode(2);
     root1.left.left = new TreeNode(3);
     root1.left.right = new TreeNode(4);
     root1.right.left = new TreeNode(4);
     root1.right.right = new TreeNode(3);

     System.out.println("Example 1: " + isSymmetric(root1)); // Output should be true

     // Example 2: Asymmetric Tree
     TreeNode root2 = new TreeNode(1);
     root2.left = new TreeNode(2);
     root2.right = new TreeNode(2);
     root2.left.right = new TreeNode(3);
     root2.right.right = new TreeNode(3);

     System.out.println("Example 2: " + isSymmetric(root2)); // Output should be false
 }
}

