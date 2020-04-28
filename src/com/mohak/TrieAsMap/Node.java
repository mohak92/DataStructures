package com.mohak.TrieAsMap;

public class Node {

	private String character;
	private int value;
	private Node[] children;
	private boolean leaf;
	private boolean visited;
	
	public Node(String character) {
		this.character = character;
		children = new Node[Constant.ALPHABET_SIZE];
	}
	
	public void setChild(int index, Node node, int value) {
		node.setValue(value);
		this.children[index] = node;
	}
	
	public Node getChild(int index) {
		return children[index];
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public Node[] getChildren() {
		return children;
	}

	public void setChildren(Node[] children) {
		this.children = children;
	}

	public boolean isLeaf() {
		return leaf;
	}

	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	@Override
	public String toString() {
		return this.character;
	}
	
}
