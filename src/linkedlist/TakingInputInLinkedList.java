package linkedlist;

import java.util.Scanner;

public class TakingInputInLinkedList {

	public static void main(String[] args) {
//		//reading user input in O(n^2)
//		Node<Integer> head = takeInput();
//		printLinkedList(head);
		
		//reading input in O(n)
		Node<Integer> head = takeInputEfficiently();
		printLinkedList(head);
	}

	public static Node<Integer> takeInputEfficiently(){
		Node<Integer> head = null;
		Node <Integer> tail = null;

		// Scanner to read user inputs
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();// read the first integer value
	
		//input is read till data is not -1
		while(data != -1) {
			//creating newNode based on data value
			Node<Integer> newNode = new Node<Integer>(data);
			
			//linkedlist is empty, head is null
			if(head == null) {
				//initialize head and tail nodes
				head = newNode;
				tail = newNode;//tail always points to last node of linkedlist
			}else {
				//newNode is inserted directly, thus takes time of 1
				//make newNode next of tail node
				tail.next = newNode;
				//update tail to point to last node
				tail = tail.next;//tail = newNode is similar
			}
			//reading next input from user
			data = sc.nextInt();
		}
		
		//return complete linkedlist using head
		return head;
		
	}
	/**
	 * method reads input for multiple nodes in LinkedList
	 * and returns the head node
	 * @return
	 */
	public static Node<Integer> takeInput() {
		//head node
		Node<Integer> head = null;

		// Scanner to read user inputs
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();// read the first integer value

		// read input till data is not -1
		while (data != -1) {
			// creating newNode
			Node<Integer> newNode = new Node<Integer>(data);

			// if first node read, head is null
			if (head == null) {
				//initialize head with newNode
				head = newNode;
			} else {
				// store head in temp node
				Node<Integer> temp = head;

				// loop works till next of tempNode is not null
				//for inserting each newNode, we need to traverse from head till last node
				//thus complexity increases
				while (temp.next != null) {
					// make temp point to nextNode of temp
					temp = temp.next;
				}

				// make newNode next of temp node
				temp.next = newNode;
			}
			// read integer input
			data = sc.nextInt();
		}
		//provide complete linkedlist by head node
		return head;
	}
	
	/**
	 * method prints all the elements of the LinkedList
	 * @param head
	 */
	public static void printLinkedList(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

}
