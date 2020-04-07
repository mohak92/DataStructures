package com.mohak.avlGeneric;

public class Node<T> {
	
	private T data;
	private Node<T> leftNode;
	private Node<T> rightNode;
	private int height;
	
	public Node(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node<T> leftNode) {
		this.leftNode = leftNode;
	}

	public Node<T> getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node<T> rightNode) {
		this.rightNode = rightNode;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setheight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return this.data.toString();
	}

}
