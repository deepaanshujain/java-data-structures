package com.example.java;

public class BinarySearchTree {

	class Node {
		int key;
		Node left, right;
		
		public Node (int item) {
			key = item;
			left = right = null;
		}
	}
	
	Node root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	void insert(int key) {
		root = insertRec(root, key);
	}
	
	Node insertRec(Node root, int key) {
		System.out.println("Base key -" + key + "\n");
		if(root!= null) {
			if(root.left!=null) {
				System.out.println("Left - " + root.left);
			}
			
			if(root.left!=null) {
				System.out.println("Right - " + root.right);
			}
		}
		
		if(root == null) {
			System.out.println("Root Null Key - " + key);
			root = new Node(key);
			return root;
		}
		
		if(key < root.key) {
			System.out.println("Key " + key + " less than Root- " + root.key);
			root.left = insertRec(root.left, key);
		} else if (key > root.key) {
			System.out.println("Key " + key + " Greater than Root- " + root.key);
			root.right = insertRec(root.right, key);
		}
		return root;
	}
	
	void inOrder() {
		System.out.println("INORDER calling - ");
		inOrderRec(root);
	}
	
	void inOrderRec(Node root) {
		if(root!= null) {
			inOrderRec(root.left);
			System.out.print(root.key);
			inOrderRec(root.right);
		}
	}
	
	
	void preOrder() {
		System.out.println("\nPREORDER calling - ");
		preOrderRec(root);
	}
	
	void preOrderRec(Node root) {
		if(root!= null) {
			System.out.print(root.key);
			preOrderRec(root.left);
			preOrderRec(root.right);
		}
	}
	
	void postOrder() {
		System.out.println("\nPOSTORDER calling - " );
		postOrderRec(root);
	}
	
	void postOrderRec(Node root) {
		if(root!= null) {
			postOrderRec(root.left);
			postOrderRec(root.right);
			System.out.print(root.key);
		}
	}
	
	
	public static void main(String arr[]) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 
        
        tree.inOrder();
        tree.preOrder();
        tree.postOrder();
	}
}

