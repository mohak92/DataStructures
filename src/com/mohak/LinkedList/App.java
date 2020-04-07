package com.mohak.LinkedList;

public class App {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		
		list.insert(10);
		list.insert(-2);
		list.insert(3);
		list.insert(100);
		
		System.out.println(list.size());
		
		list.traverseList();
	}

}
