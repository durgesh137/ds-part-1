package trees;

import java.util.Scanner;

public class BinaryTree {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		BinaryTreeNode<Integer> root = tree.inputLevelWise();
		tree.printTree(root);
	}

	/**
	 * method counts total nodes present in binarytree
	 * @param root
	 * @return
	 */
	public int countNodes(BinaryTreeNode<Integer> root) {
		//check if root is null then count as 0
		if (root == null)
			return 0;
		
		// count nodes in left subtree recursively
		int leftTreeNodes = countNodes(root.left);
		
		// count nodes in right subtree recursively
		int rightTreeNodes = countNodes(root.right);
		
		// 1 included for root node
		return 1 + leftTreeNodes + rightTreeNodes;
	}

	/**
	 * method reads binary trees values level wise
	 * 
	 * @return
	 */
	public BinaryTreeNode<Integer> inputLevelWise() {
		// read node data
		System.out.println("Enter data: ");
		int data = sc.nextInt();
		// if negative value, end reading data
		if (data < 0)
			return null;

		// valid data, create root node
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);

		// call left subtree to take input recursively
		BinaryTreeNode<Integer> leftChild = inputLevelWise();

		// call right subtree to input recursively
		BinaryTreeNode<Integer> rightChild = inputLevelWise();

		// assign left and right child of root node
		root.left = leftChild;
		root.right = rightChild;

		return root;
	}

	/**
	 * method prints the all the elements of the Tree
	 * 
	 * @param root
	 */
	public void printTree(BinaryTreeNode<Integer> root) {
		// validate root
		if (root == null)
			return;

		// print root data
		System.out.print(root.data + ":");

		// check left child if valid
		if (root.left != null) {
			// print left child data
			System.out.print("L " + root.left.data);
		}

		// check right child if valid
		if (root.right != null) {
			// print right child data
			System.out.println("R " + root.right.data);
		}

		System.out.println();
		// traverse left subtree
		printTree(root.left);

		// traverse right subtree
		printTree(root.right);
	}
}
