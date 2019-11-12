package com.example.java;

public class LinkedListDemo {
	
	Node head;
	
	class Node{
		
		int data;
		Node next;
		
		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	void printList() {
		Node n = head;
		
		while(n!=null) {
			System.out.println(n.data);
			//System.out.println(" Next is "+ n.next.data + "\n");
			n = n.next;
		}
		System.out.println("==========================");
	}
	
	public void insertAfterNode(Node previousNode, int data) {
		
		if(previousNode == null) {
			System.out.println("The given Previous Node Cannot be null");
		}
		
		Node newNode = new Node(data);
		newNode.next = previousNode.next;
		previousNode.next = newNode;
		
	}
	
	public void insertAfterDataNode(int nodeValue, int data) {
		
		Node n = head;
		
		if(head == null) {
			System.out.println("The Head Node is null");
		}
		
		while(n!=null) {
			if(n.data == nodeValue) {
				Node newNode = new Node(data);
				newNode.next = n.next;
				n.next = newNode;
				break;
			}
			n = n.next;
		}
	}
	
	public void insertAtLast(int data) {
		if (head == null) {
			head = new Node(data);
			return;
		}
		
		Node newNode = new Node(data);
		newNode.next =null;
		
		Node last = head;
		while(last.next!=null) {
			last = last.next;
		}
		last.next = newNode;
		return;
	}
	
	public static void main(String args[]) {
		
		LinkedListDemo list = new LinkedListDemo();
		list.insertAtLast(5);
		list.insertAtLast(3);
		list.insertAtLast(7);
		list.printList();
		
		list.insertAfterNode(list.head.next, 4);
		list.printList();
		
		list.insertAfterDataNode(5, 8);
		list.printList();
		
		
	}
}
