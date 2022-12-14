package com.bridgelabz;

public class BinaryMain {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(56);
		tree.insert(30);
		tree.insert(70);
		tree.traverseInOrder(tree.root);
		tree.SearchNode(63);
	}

}
