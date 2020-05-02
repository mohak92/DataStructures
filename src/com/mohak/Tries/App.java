package com.mohak.Tries;

import java.util.List;

public class App {

	public static void main(String[] args) {
		Trie trie = new Trie();
		
		trie.insert("apple");
		trie.insert("apply");
		trie.insert("approve");
		trie.insert("newyork");
		trie.insert("newjersey");
		trie.insert("newengland");
		trie.insert("newamsterdam");
		
		System.out.println();
		System.out.println("Longest common prefix is: " + trie.longestCommonPrefix());
		
		System.out.println();
		
		List<String> list = trie.allWordsWithPrefix("new");
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println();

		List<String> list2 = trie.allWordsWithPrefix("app");
		for(String s : list2) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("Trie Data in sorted order");
		//Get data in trie in sorted order
		List<String> list3 = trie.allWordsWithPrefix("");
		for(String s : list3) {
			System.out.println(s);
		}
		
		Trie trie2 = new Trie();
		
		trie2.insert("flower");
		trie2.insert("flo");
		trie2.insert("flight");
		System.out.println();
		System.out.println("Longest common prefix is: " + trie2.longestCommonPrefix());
		
	}

}
