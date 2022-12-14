package com.bridgelabz;

public class MyNode {
	int data;
	MyNode left;
	MyNode right;

	public MyNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public void display() {
		System.out.println("data" + data);
	}
}
