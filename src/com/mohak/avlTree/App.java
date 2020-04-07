package com.mohak.avlTree;

public class App {

	public static void main(String[] args) {

		Tree avl = new AvlTree();
		
		avl.insert(1);
		avl.insert(2);
		avl.insert(3);
		
		avl.traverse();
		
		System.out.println();
		Tree avl4 = new AvlTree();
		
		avl4.insert(3);
		avl4.insert(2);
		avl4.insert(1);
		
		avl4.traverse();
		
		System.out.println();
		Tree avl2 = new AvlTree();
		
		avl2.insert(3);
		avl2.insert(1);
		avl2.insert(2);
		
		avl2.traverse();
		
		System.out.println();
		Tree avl3 = new AvlTree();
		
		avl3.insert(10);
		avl3.insert(20);
		avl3.insert(30);
		avl3.insert(40);
		avl3.insert(50);
		avl3.insert(60);
		
		avl3.traverse();
		
		System.out.println();
		Tree avl5 = new AvlTree();
		
		avl5.insert(10);
		avl5.insert(15);
		avl5.insert(5);
		avl5.insert(4);
		
		avl5.delete(15);
		
		avl5.traverse();
	}

}
