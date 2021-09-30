package linkedlist;

import java.util.Arrays;
import java.util.Random;

/**
 * Auxillary class to provide the LinkedList given the nodes values
 * 
 * @author Durgesh
 *
 */
public class ReturnLinkedList {

	public static void main(String[] args) {
		Node<Integer> head = getLinkedList(10);
		printLinkedList(head);
	}

	/**
	 * method to print the complete linked via head node reference
	 * 
	 * @param head
	 */
	private static void printLinkedList(Node<Integer> head) {
		if (head == null) {
			System.out.println("LinkedList is empty!!");
			return;
		}
		System.out.println("Elements of LinkedList...");
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	/**
	 * Method provides the LinkedList via head node reference populated with random
	 * integer values
	 * 
	 * @param size
	 * 
	 * @return
	 */
	public static Node<Integer> getLinkedList(int size) {
		// LinkedList head and tails declaration
		Node<Integer> head = null, tail = null;

		// integer[] with random values
		int arr[] = getNodeValues(size);

		// creating LinkedList and storing values
		for (int value : arr) {
			Node<Integer> newNode = new Node<Integer>(value);
			// head is null, linkedlist is empty right now
			if (head == null) {
				// initializing head and tail nodes
				head = newNode;
				tail = newNode;
			} else {
				// insert newNode at next of tail
				tail.next = newNode;
				// update tail to point to lastNode
				tail = newNode; // tail = tail.next does same thing
			}
		}
		return head;
	}

	public static Node<Integer> getLinkedHavingSameValue(int size){
		Node<Integer> head = null, node = null, tailNode = null;
		for(int i=0; i< size; i++) {
			Node<Integer> newNode = new Node<Integer>(size);
			if(head == null) {
				head = newNode;
				tailNode = newNode;
			}else {
				tailNode.next = newNode;
				tailNode = newNode;
			}
		}
		return head;
	}
	public static Node<Integer> getSortedLinkedListHavingDuplicates(int size) {
		// LinkedList head and tails declaration
		Node<Integer> head = null, tail = null;

		// integer[] with random values
		int arr[] = getDuplicateNodeValues(size);
		Arrays.sort(arr);

		// creating LinkedList and storing values
		for (int value : arr) {
			Node<Integer> newNode = new Node<Integer>(value);
			// head is null, linkedlist is empty right now
			if (head == null) {
				// initializing head and tail nodes
				head = newNode;
				tail = newNode;
			} else {
				// insert newNode at next of tail
				tail.next = newNode;
				// update tail to point to lastNode
				tail = newNode; // tail = tail.next does same thing
			}
		}
		return head;
	}

	/**
	 * method provides nodes values having duplicates in it
	 * 
	 * @param size
	 * @return
	 */
	private static int[] getDuplicateNodeValues(int size) {
		// integer[] to store random integers
		int arr[] = new int[size];

		// defining range of generating random integers
		int maxValue = 10, minValue = 5;

		// Random class to generate random integers
		Random random = new Random();

		// populating integer[]
		for (int i = 0; i < size; i++) {
			arr[i] = random.nextInt(maxValue) + minValue;
		}
		return arr;
	}

	/**
	 * method provides integer[] populated with random values
	 * 
	 * @return
	 */
	private static int[] getNodeValues(int size) {

		// integer[] to store random integers
		int arr[] = new int[size];

		// defining range of generating random integers
		int maxValue = 100, minValue = 0;

		// Random class to generate random integers
		Random random = new Random();

		// populating integer[]
		for (int i = 0; i < size; i++) {
			arr[i] = random.nextInt(maxValue) + minValue;
		}
		return arr;
	}

}
