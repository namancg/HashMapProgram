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
	public void delete(K key) {
		INode currentNode = head,previousNode=null;
		if(currentNode.getKey().equals(key)) {
			head = head.getNextNode1();
			currentNode= null;
			System.out.println("deleted");
			return;
		}
		while(currentNode!=null) {
			if(currentNode.getKey().equals(key)) {
				if(currentNode.getNextNode1()==null) {
					previousNode.setNextNode(null);
				}
				else
				previousNode.setNextNode(currentNode.getNextNode1());
				currentNode=null;
				System.out.println(key+" deleted");
				break;
			}
			previousNode=currentNode;
			currentNode=currentNode.getNextNode1();
		}
	}

	@Override
	public String toString() {
		 return "MyHashMapNodes{"+head+'}';
	}


	}
