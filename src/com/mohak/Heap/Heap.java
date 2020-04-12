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
	
	//we return the root node. Because it is a max heap the root is the max item.
	// of course because of array representation it takes O(1) time
	//this is the peek() method
	public int getMax() {
		return this.heap[0];
	}
	
	//it return the maximum item + removes it from the heap
	//note: we do not care about the item any more but because
	//we have an array with fix size we are not able to get rid of it completely
	//O(logN)
	public int poll() {
		int max = getMax();
		
		swap(0, heapSize-1);
		this.heapSize--;
		
		fixDown(0);
		
		return max;
	}
	
	//we have a given item in the heap and we consider all the item below and check
	//whether the heap properties are violated or not
	private void fixDown(int index) {
		
		//every node have children:left child and right child
		//in the array the node i has left child with index 2*i+1 and the right child with index 2*i+2
		int indexLeft = 2*index+1;
		int indexRight = 2*index+2;
		//max heap so parent node is always greater than the children
		int indexLargest = index;
		
		//if the left child is greater than the parent: largest is the left node
		if(indexLeft < heapSize && heap[indexLeft] > heap[index])
			indexLargest = indexLeft;
		
		//if right child is greater than left child: largest is the right node
		if(indexRight < heapSize && heap[indexRight] > heap[indexLargest])
			indexLargest = indexRight;
		
		//we don not want to swap items with themselves
		if(index != indexLargest) {
			swap(index, indexLargest);
			fixDown(indexLargest);
		}
	}

	//we have n items and we want to sort them with a heap
	//every poll operation takes O(logN) time because of the fixDown method thats why
	//the overall running time complexity is O(NlogN) for heapsort
	public void heapsort() {
		
		//we decrease the size of the heap in poll() method so we have to store it!!!
		int size = this.heapSize;
		
		for(int i = 0; i < size; ++i) {
			int max = poll();
			System.out.print(max+" ");
		}
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
		return Constants.CAPACITY == this.heapSize;
	}

}
