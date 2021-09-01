package com.bridelabz.hashmap;

import java.util.ArrayList;

public class MyLinkedHashMap <K,V>{
	private final int numberOfBuckets;
	ArrayList<LinkedList<K>> myBuketArray;
	public MyLinkedHashMap() {
		this.numberOfBuckets=10;
		this.myBuketArray=new ArrayList<LinkedList<K>>(numberOfBuckets);
		for(int i=0;i<numberOfBuckets;i++) {
			this.myBuketArray.add(null);
		}
	}
	public int getBucketi(K key) {
		int hashcode = Math.abs(key.hashCode());
		int i= hashcode%numberOfBuckets;
		return i;
	}
	public V getKey(K key) {
		int i = this.getBucketi(key);
		LinkedList<K> LinkedList = this.myBuketArray.get(i);
		if(LinkedList == null) return null;
		Node<K, V> node = (Node<K, V>)LinkedList.find(key);
		return(node ==null)?null:node.getValue();	
	}
	public void add(K key,V value) {
		int i= this.getBucketi(key);
		LinkedList<K> LinkedList = this.myBuketArray.get(i);
		if(LinkedList==null) {
			LinkedList = new LinkedList<>();
			this.myBuketArray.set(i, LinkedList);
		}
		Node<K, V> node = (Node<K, V>) LinkedList.find(key);
		if(node ==null) {
			node = new Node<>(key, value);
			LinkedList.append(node);
		}
		else
			node.setValue(value);
	}
	public void remove(K key) {
		int index = this.getBucketi(key);
		LinkedList<K> myLinkedList = this.myBuketArray.get(index);
		if(myLinkedList==null) {
			System.out.println("no such value present");
			return;
		}
		myLinkedList.delete(key);
	}
	 public String toString() {
		 return "MyHashMapNodes{"+myBuketArray+'}';
	 }

}
