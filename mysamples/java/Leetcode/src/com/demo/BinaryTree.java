package com.demo;
//Problem Statement:https://leetcode.com/problems/root-equals-sum-of-children/


class Node{
	int data;
	Node left;
	Node right;

	
public Node(int data) {
	this.data = data;
	
}
}

public class BinaryTree {
	Node root;
	
	public static boolean isSumEqual(Node bt) {
		if (bt == null) {
			return true;
		}
		
		int sum =0;
		if(bt.left!= null) {
			sum =sum+bt.left.data;
		}
		if(bt.right!= null) {
			sum =sum+bt.right.data;
		}
		return bt.data == sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree bt1 = new BinaryTree();
		bt1.root = new Node(10);
		bt1.root.left = new Node(4);
		bt1.root.right = new Node(6);
		System.out.println("Example 1 :" + isSumEqual(bt1.root));
		
		BinaryTree bt2 = new BinaryTree();
		bt2.root = new Node(8);
		//bt2.root.left = new Node(6);
		//bt2.root.right = new Node(5);
		System.out.println("Example 2 :" + isSumEqual(bt2.root));

	}

}
