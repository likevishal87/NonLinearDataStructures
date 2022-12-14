package com.bridgelabz;

public class BinarySearchTree {
	MyNode root;

	public BinarySearchTree() {
		root = null;
	}

	public MyNode addRecursive(MyNode current, int data) {
		if (current == null) {
			return new MyNode(data);
		}
		if (data < current.data) {
			current.right = addRecursive(current.left, data);
		} else if (data > current.data) {
			current.right = addRecursive(current.right, data);
		} else {
			return current;
		}
		return current;
	}

	public void insert(int data) {
		root = addRecursive(root, data);
	}

	public void printData() {
		print(root);
	}

	public void print(MyNode root) {
		if (root == null) {
			return;
		}
		print(root.left);
		System.out.print(root.data + " ");
		print(root.right);
	}

	public void traverseInOrder(MyNode node) {
		if (node != null) {
			traverseInOrder(node.left);
			System.out.print(" " + node.data);
			traverseInOrder(node.right);
		}
	}

}
