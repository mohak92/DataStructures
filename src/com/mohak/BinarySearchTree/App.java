package com.mohak.BinarySearchTree;

public class App {

	public static void main(String[] args) {
		Tree<Integer> bst = new BinarySearchTree<>();
		
		bst.insert(10);
		bst.insert(-1);
		bst.insert(1);
		bst.insert(0);
		bst.insert(1000);
		bst.insert(-22);
		
		bst.traversal();
		
		System.out.println();
		System.out.println("Max Value in bst " + bst.getMaxValue());
		System.out.println("Min Value in bst " + bst.getMinValue());
		
		System.out.println();
		
		Tree<String> bst2 = new BinarySearchTree<>();
		
		bst2.insert("Adam");
		bst2.insert("Joe");
		bst2.insert("Michael");
		bst2.insert("Kimi");
		bst2.insert("Sebastian");
		bst2.insert("Mohak");
		
		bst2.traversal();
		
		System.out.println();
		System.out.println("Max Value in bst " + bst2.getMaxValue());
		System.out.println("Min Value in bst " + bst2.getMinValue());
		
		System.out.println();
		
		Tree<Integer> bst3 = new BinarySearchTree<>();
		
		bst3.insert(10);
		bst3.insert(5);
		bst3.insert(15);
		bst3.insert(20);
		//bst3.insert(3);
		//bst3.insert(7);
		
		bst3.delete(5);
		
		bst3.traversal();
		
		System.out.println();
		System.out.println();
		Tree<Person> bst4 = new BinarySearchTree<>();
		
		bst4.insert(new Person("Adam", 29));
		bst4.insert(new Person("Joe", 26));
		bst4.insert(new Person("Michael", 45));
		bst4.insert(new Person("Kimi", 40));
		bst4.insert(new Person("Sebastian", 32));
		bst4.insert(new Person("Alonso", 39));
		
		bst4.traversal();
		
		System.out.println();
		System.out.println("Max Value in bst " + bst4.getMaxValue());
		System.out.println("Min Value in bst " + bst4.getMinValue());

		
	}

}
