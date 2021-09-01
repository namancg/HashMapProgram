package com.bridelabz.hashmap;

public interface INode<K> {
	K getKey();
	void setKey(K key);
	INode getNextNode1();
	void setNextNode(INode next);
}
