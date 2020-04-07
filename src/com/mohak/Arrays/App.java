package com.mohak.Arrays;

public class App {
	
	public static void main(String[] args) {
		int[] nums = new int[5];
		
		for(int i = 1;i <nums.length;i++) {
			nums[i] = i;
		}
		
		//O(1)
		int num = nums[2];
		System.out.println(num);
		
		//O(N) "Linear Search" -> O(logN) binary tree -> O(1) hashTable
		for(int i = 0;i < nums.length;i++)
			if(nums[i] == 4)
				System.out.println("Index found, " +i);
	}

}
