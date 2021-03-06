package com.mohak.avlTree;

public class AvlTree implements Tree {

	private Node root;

	@Override
	public void insert(int data) {
		root = insert(root, data);
	}

	private Node insert(Node node, int data) {
		if (node == null)
			return new Node(data);

		if (data < node.getData()) {
			node.setLeftNode(insert(node.getLeftNode(), data));
		} else {
			node.setRightNode(insert(node.getRightNode(), data));
		}

		node.setheight(Math.max(height(node.getLeftNode()), height(node.getRightNode())) + 1);

		node = settleViolation(data, node);
		return node;
	}

	@Override
	public void delete(int data) {
		if (root != null)
			root = delete(root, data);
	}

	private Node delete(Node node, int data) {
		if (node == null)
			return node;

		if (data < node.getData()) {
			node.setLeftNode(delete(node.getLeftNode(), data));
		} else if (data > node.getData()) {
			node.setRightNode(delete(node.getRightNode(), data));
		} else {
			// we have found the node we want to delete.
			// Case 1: removing leaf node
			if (node.getLeftNode() == null && node.getRightNode() == null) {
				System.out.println("Removing a leaf node...");
				return null;
			}

			// Case 2: Node with 1 child
			if (node.getLeftNode() == null) {
				System.out.println("Removing the right child...");
				Node tempNode = node.getRightNode();
				node = null;
				return tempNode;
			} else if (node.getRightNode() == null) {
				System.out.println("Removing the left child...");
				Node tempNode = node.getLeftNode();
				node = null;
				return tempNode;
			}

			// Case 3: node with 2 children.
			System.out.println("Removing item with 2 children.");
			Node tempNode = getPredecessor(node.getLeftNode());
			node.setData(tempNode.getData());
			node.setLeftNode(delete(node.getLeftNode(), tempNode.getData()));
		}

		node.setheight(Math.max(height(node.getLeftNode()), height(node.getRightNode())) + 1);

		// Have to check on every delete operation if tree is balanced or not.
		return settleDeletion(node);
	}

	private Node settleDeletion(Node node) {
		int balance = getBalance(node);

		// OK, we know the tree is left heavy BUT it can be left-right heavy or
		// left-left heavy
		if (balance > 1) {

			// left right heavy situation: left rotation on parent + right rotation on
			// grandparent
			if (getBalance(node.getLeftNode()) < 0) {
				node.setLeftNode(leftRotation(node.getLeftNode()));
			}

			// this is the right rotation on grandparent ( if left-left heavy, thats single
			// right rotation is needed
			return rightRotation(node);
		}

		// OK, we know the tree is right heavy BUT it can be left-right heavy or
		// right-right heavy
		if (balance < -1) {
			// right - left heavy so we need a right rotation ( on parent!!! ) before left
			// rotation
			if (getBalance(node.getRightNode()) > 0) {
				node.setRightNode(rightRotation(node.getRightNode()));
			}

			// left rotation on grand parent
			return leftRotation(node);
		}

		return node;
	}

	private Node getPredecessor(Node node) {
		Node predecessor = node;

		while (predecessor.getRightNode() != null) {
			predecessor = predecessor.getRightNode();
		}

		System.out.println("Predecessor is: " + predecessor);
		return predecessor;
	}

	private Node settleViolation(int data, Node node) {
		int balance = getBalance(node);

		// Case 1 left-left
		if (balance > 1 && data < node.getLeftNode().getData()) {
			return rightRotation(node);
		}

		// Case 2 right-right
		if (balance < -1 && data > node.getRightNode().getData()) {
			return leftRotation(node);
		}

		// Case 3 left right heavy situation
		if (balance > 1 && data > node.getLeftNode().getData()) {
			node.setLeftNode(leftRotation(node.getLeftNode()));
			return rightRotation(node);
		}

		// Case 4 right left heavy situation
		if (balance < -1 && data < node.getRightNode().getData()) {
			node.setRightNode(rightRotation(node.getRightNode()));
			return leftRotation(node);
		}

		return node;
	}

	private Node rightRotation(Node node) {
		System.out.println("Rotating to right on node: " + node);
		Node tempLeftNode = node.getLeftNode();
		Node t = tempLeftNode.getRightNode();

		tempLeftNode.setRightNode(node);
		node.setLeftNode(t);

		node.setheight(Math.max(height(node.getLeftNode()), height(node.getRightNode())) + 1);
		tempLeftNode.setheight(Math.max(height(tempLeftNode.getLeftNode()), height(tempLeftNode.getRightNode())) + 1);

		return tempLeftNode;
	}

	private Node leftRotation(Node node) {
		System.out.println("Rotating to left on node: " + node);
		Node tempRightNode = node.getRightNode();
		Node t = tempRightNode.getLeftNode();

		tempRightNode.setLeftNode(node);
		node.setRightNode(t);

		node.setheight(Math.max(height(node.getLeftNode()), height(node.getRightNode())) + 1);
		tempRightNode
				.setheight(Math.max(height(tempRightNode.getLeftNode()), height(tempRightNode.getRightNode())) + 1);

		return tempRightNode;
	}

	private int height(Node node) {
		if (node == null)
			return -1;
		return node.getHeight();
	}

	// balance returned < -1 OR balance returned is > 1 make rotations
	private int getBalance(Node node) {
		if (node == null) {
			return 0;
		}

		return height(node.getLeftNode()) - height(node.getRightNode());
	}

	@Override
	public void traverse() {
		if (root == null)
			return;
		inOrderTraversal(root);
	}

	private void inOrderTraversal(Node node) {
		if (node.getLeftNode() != null)
			inOrderTraversal(node.getLeftNode());
		System.out.println(node);
		if (node.getRightNode() != null)
			inOrderTraversal(node.getRightNode());
	}

}
