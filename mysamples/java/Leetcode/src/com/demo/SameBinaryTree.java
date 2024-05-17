package com.demo;
//Problem Statement:https://leetcode.com/problems/same-tree/

import javax.swing.tree.TreeNode;

public class SameBinaryTree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        // Example 1:
        TreeNode p1 = new TreeNode(1);
        p1.left = new TreeNode(2);
        p1.right = new TreeNode(3);

        TreeNode q1 = new TreeNode(1);
        q1.left = new TreeNode(2);
        q1.right = new TreeNode(3);

        System.out.println("Example 1: " + isSameTree(p1, q1));

        // Example 2:
        TreeNode p2 = new TreeNode(1);
        p2.left = new TreeNode(2);

        TreeNode q2 = new TreeNode(1);
        q2.right = new TreeNode(2);

        System.out.println("Example 2: " + isSameTree(p2, q2));

        // Example 3:
        TreeNode p3 = null;
        TreeNode q3 = null;

        System.out.println("Example 3: " + isSameTree(p3, q3));
    }
}
