package com.bridgelabz.datastructure;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/11/28 
 * @Purpose : To count the number of possibilities in which
 *       binary search tree can be made for n number of nodes.
 */
import com.bridgelabz.utility.Utility;

public class BinarySearchTree {
	Node root;

	public BinarySearchTree() {
		this.root = null;
	}

	class Node {
		int data;
		Node leftChild;
		Node rightChild;

		public Node(int data) {
			this.data = data;
			this.leftChild = null;
			this.rightChild = null;
		}
	}

	/**
	 * define function to add the new node
	 * 
	 * @param data
	 */
	public void addNode(int data) {
		Node new_node = new Node(data);
		if (root == null) {
			root = new_node;
		} else {
			traverseToAdd(root, new_node);
		}
	}

	/**
	 * define function to traverse through the tree and add new node
	 * 
	 * @param current  ==>Node
	 * @param new_node ==> Node
	 */
	public void traverseToAdd(Node current, Node new_node) {
		if (new_node.data < current.data) {
			if (current.leftChild == null) {
				current.leftChild = new_node;
			} else {
				traverseToAdd(current.leftChild, new_node);
			}
		} else if (new_node.data > current.data) {
			if (current.rightChild == null) {
				current.rightChild = new_node;
			} else {
				traverseToAdd(current.rightChild, new_node);
			}
		}
	}

	/**
	 * define function to delete the node
	 * 
	 * @param data ==> int
	 */
	public void delete(int data) {
		root = deleteAtNode(root, data);
	}

	private Node deleteAtNode(Node root, int data) {
		if (root == null)
			return root;
		if (data < root.data)
			root.leftChild = deleteAtNode(root.leftChild, data);
		else if (data > root.data)
			root.rightChild = deleteAtNode(root.rightChild, data);
		else {
			if (root.leftChild == null)
				return root.rightChild;
			else if (root.rightChild == null)
				return root.leftChild;

			root.data = minValue(root.rightChild);
			root.rightChild = deleteAtNode(root.rightChild, root.data);
		}
		return root;
	}

	private int minValue(Node root) {
		int min = root.data;
		while (root.leftChild != null) {
			min = root.leftChild.data;
			root = root.leftChild;
		}
		return min;
	}

	public void inorder() {
		inOrderTraversal(root);
	}

	/**
	 * define function to inorder traversal of tree
	 * 
	 * @param root ==> Node
	 */
	public void inOrderTraversal(Node root) {
		if (root != null) {
			inOrderTraversal(root.leftChild);
			System.out.print(root.data + " ");
			inOrderTraversal(root.rightChild);
		}
	}

	/**
	 * define function to count the number of possibilities
	 * 
	 * @param key
	 * @return int
	 */
	public int noOfBinaryTree(int key) {
		int possiblity = Utility.factorial(2 * key) / (Utility.factorial(key + 1) * Utility.factorial(key));
		return possiblity;
	}

	public static void main(String[] args) {
		BinarySearchTree binaryTree = new BinarySearchTree();
		binaryTree.addNode(50);
		binaryTree.addNode(30);
		binaryTree.addNode(20);
		binaryTree.addNode(40);
		binaryTree.addNode(70);
		binaryTree.addNode(60);
		binaryTree.addNode(80);

		System.out.println("Inorder traversal of the given tree");
		binaryTree.inorder();

		System.out.println("\nDelete 20");
		binaryTree.delete(20);
		System.out.println("After Deletion of 20 : ");
		binaryTree.inorder();

		System.out.println("\nDelete 50");
		binaryTree.delete(50);
		System.out.println("After Deletion of 50 : ");
		binaryTree.inorder();

		System.out.println();
		System.out.println();
		System.out.print("Number of Possibilities : ");
		System.out.println(binaryTree.noOfBinaryTree(3));
	}
}
