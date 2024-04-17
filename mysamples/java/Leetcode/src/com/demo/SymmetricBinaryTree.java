package com.demo;
//Problem Statement:https://leetcode.com/problems/symmetric-tree/

public class SymmetricBinaryTree {
	public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
	}
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
		// TODO Auto-generated method stub
		
		TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(4);
        root1.right.left = new TreeNode(4);
        root1.right.right = new TreeNode(3);

        System.out.println("Example 1: " + isSymmetric(root1));

	}

}
