package com.mohak.TrieAsMap;

public class App {

	public static void main(String[] args) {
		Trie trie = new Trie();
		
		trie.insert("john", 1);
		trie.insert("smith", 2);
		trie.insert("jane", 3);
		trie.insert("doe", 4);
		
		System.out.println(trie.searchAsMap("seed"));
	}

}
