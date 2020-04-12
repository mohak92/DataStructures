package com.mohak.Heap;

public class App {

	public static void main(String[] args) {
		Heap heap = new Heap();

		heap.insert(10);
		heap.insert(100);
		heap.insert(-10);
		
		System.out.println(heap.getMax()+"\n");

		heap.heapsort();

		System.out.println("\n");
		System.out.println(heap.getMax());
	}

}
