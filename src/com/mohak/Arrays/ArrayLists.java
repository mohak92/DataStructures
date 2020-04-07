package com.mohak.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Adam");
		list.add("Joe");
		list.add("Kevin");
		list.add("Bob");
		
		for(String s : list) {
			System.out.println(s);
		}		
	}

}
