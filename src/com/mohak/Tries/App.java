package com.mohak.Tries;

public class App {

	public static void main(String[] args) {
		Trie trie = new Trie();
		
		trie.insert("john");
		trie.insert("smith");
		trie.insert("jane");
		trie.insert("doe");
		
		System.out.println(trie.search("do"));
		System.out.println(trie.startsWith("do"));
	}

}
