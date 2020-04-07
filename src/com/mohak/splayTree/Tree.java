package com.mohak.splayTree;

public interface Tree<T extends Comparable<T>> {
	
	public void insert(T data);
	public Node<T> find(T Data);
	public T getMin();
	public T getMax();
	public void inOrderTraversal();

}
