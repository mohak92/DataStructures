package com.mohak.RedBlackTrees;

public class RedBlackTree implements Tree {
	
	private Node root;

	@Override
	public void traverse() {
		if(root == null)
			return;
		inOrderTraversal(root);
	}

	private void inOrderTraversal(Node node) {
		if(node.getLeftChild() != null)
			inOrderTraversal(node.getLeftChild());
		
		System.out.println(node + " - ");
		
		if(node.getRightChild() != null)
			inOrderTraversal(node.getRightChild());
	}

	@Override
	public void insert(int data) {
		Node node = new Node(data);
		root = insertIntoTree(root, node);
		fixViolations(node);
	}

	private void fixViolations(Node node) {
		
	}

	private Node insertIntoTree(Node root, Node node) {
		if(root == null) return node;
		
		return root;
	}

}
