package com.mohak.RedBlackTrees;

public class App {
	public static void main(String[] args) {
		
		Tree redBlackTree = new RedBlackTree();
		
		redBlackTree.insert(10);
		redBlackTree.insert(20);
		redBlackTree.insert(30);
		
		redBlackTree.traverse();
		
		System.out.println("\n");
		Tree redBlackTree2 = new RedBlackTree();
		
		redBlackTree2.insert(10);
		redBlackTree2.insert(5);
		redBlackTree2.insert(6);
		
		redBlackTree2.traverse();
		
		System.out.println("\n");
		Tree redBlackTree3 = new RedBlackTree();
		
		redBlackTree3.insert(10);
		redBlackTree3.insert(15);
		redBlackTree3.insert(13);
		
		redBlackTree3.traverse();
	}
}
