package com.bridelabz.hashmap;

public class Node<K,V> implements INode<K> {
	K key;
	V value;
	Node<K,V> next;
	Node(K key,V value){
		this.key=key;
		this.value=value;
		next=null;
	}
	
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key=key;	
	}


	public INode getNextNode1() {
		return next;
	}


	public void setNextNode(INode next) {
		this.next=(Node<K, V>) next;
		
	}
	
	public V getValue() {
		return value;
	}
	
	public void setValue(V value) {
		this.value=value;
	}
	@Override
	public String toString() {
		StringBuilder myNodeString = new StringBuilder();
		myNodeString.append("myMapNode{" + "K = ").append(key).append(" , V = ").append(value).append("}");
		if(next!=null) 
			myNodeString.append("->").append(next);
		return myNodeString.toString();
	}


	}



