package com.bridelabz.hashmap;
import com.bridgelabz.linkedlists.*;
public class LinkedList <K>  {
	K key;
	INode head,tail;
	public LinkedList() {
		this.head=null;
		this.tail=null;
	}
	public INode find(K key) {
		int index = 1;
		INode currentNode = head;
		while (currentNode != null) {
			if (currentNode.getKey().equals(key)) {
				return currentNode;
			}
			currentNode = currentNode.getNextNode1();
			index++;
		}
		return null;
	}
	public void append(INode<K> newNode) {
		if (tail == null)
			this.tail = newNode;
		if (head == null)
			this.head = newNode;
		else
			tail.setNextNode(newNode);
		tail = newNode;
	}

	@Override
	public String toString() {
		 return "MyHashMapNodes{"+head+'}';
	}


	}
