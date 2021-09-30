package linkedlist.iterative;

import linkedlist.Node;
import linkedlist.ReturnLinkedList;

/**
 * CORRECT...
 * Length of LINKEDLIST 
 * For a given singly linked list of integers, find and return its
 * length. Do it using an iterative method.
 * 
 * @author Durgesh
 *
 */
public class LengthOfLinkedList {

	public static void main(String[] args) {
		//LinkedList of size 10 having random integer values
		Node<Integer> head = ReturnLinkedList.getLinkedList(15);
		System.out.println("Length: "+length(head));
		printLinkedList(head);
	}

	/**
	 * method returns the count of total elements
	 * present in the linkedlist
	 * @param head
	 * @return
	 */
	public static int length(Node<Integer> head) {
		int size = 0;
		//check if head is null, linkedlist is empty
		if(head == null)
			return size;
		
		//linkedlist atleast contains one head element
		//loop works till head is not null
		//to find total elements in the linkedlist
		while(head != null) {//1 2 3
			size++;//1
			head = head.next;//2
		}
		return size;
	}

	/**
	 * method to show complete linked list
	 * @param head
	 */
	public static void printLinkedList(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

}
