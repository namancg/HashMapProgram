package com.bridelabz.hashmap;

public class NodeMain {

	public static void main(String[] args) {
		String sentence= "To be or not to be To be or not to be To be or not to be";
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<String, Integer>();
		String [] words = sentence.toLowerCase().split(" ");
		for(String word:words) {
			Integer value = myLinkedHashMap.getKey(word);
			if(value==null) value=1;
			else value=value+1;
			myLinkedHashMap.add(word, value);
		}
		System.out.println("frequency of word to is "+myLinkedHashMap.getKey("to"));
		System.out.println(myLinkedHashMap);
		myLinkedHashMap.remove("to");
		System.out.println(myLinkedHashMap);

	}

}
