package com.mohak.Heap;

public class Heap {
	
	//we represent heap data structure with an array
	private int[] heap;
	//we want to track the size (the number of items in the heap)
	private int heapSize;
	
	public Heap() {
		this.heap = new int[Constants.CAPACITY];
	}
	
	//insertion takes O(1) running time but we want to make sure that the
	//heap properties are not violated (it takes O(logN) because of the fixUP() method)
	public void insert(int item) {
		
		//we are not able to insert more items than the value of the capacity 
		if(isHeapFull()) throw new RuntimeException("Heap is full...");
		
		//insert item + increment the counter
		this.heap[heapSize] = item;
		heapSize = heapSize + 1;
		
		//we insert the item to the last position of array: of course the heap
		//properties of heap may be violated so we have to fix it if necessary
		fixUp(heapSize-1);
		
	}

	private void fixUp(int index) {
		
		//the parent index of a given node in the heap
		//we store the heap in an array!!!
		int parentIndex = (index-1)/2;
		
		//while the index>0 mean until we consider all the items "above" the one we inserted
		//we have to swap the node with the parent if the heap property is violated
		//it is a MAX HEAP: largest items are in the higher layers (max item == root node)
		if(index > 0 &&heap[index] > heap[parentIndex]) {
			swap(index,parentIndex);
			fixUp(parentIndex);
		}
		
	}
	
	public int getMax() {
		return this.heap[0];
	}
	
	public int poll() {
		int max = getMax();
		
		swap(0, heapSize-1);
		this.heapSize--;
		
		fixDown(0);
		
		return max;
	}
	
	private void fixDown(int index) {
		
	}

	public void heapsort() {
		
	}
	
	//swap two items with (index1, index2) in the heap array
	private void swap(int index1, int index2) {
		int temp = heap[index1];
		heap[index1] = heap[index2];
		heap[index2] = temp;
	}
	
	//check whether the heap is full or not
	//note: we are not able to insert more items than the capacity
	private boolean isHeapFull() {
		return Constants.CAPACITY == this.heap.length;
	}

}
