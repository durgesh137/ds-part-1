package linkedlist.recursion;

import linkedlist.Node;
import linkedlist.PrintLinkedList;
import linkedlist.ReturnLinkedList;

/**
 * CORRECT...
 * Print Reverse LinkedList  
 * ======================== 
 * 
 * Write a function to print the list in a reverse order. To
 * explain it further, you need to start printing the data from the tail and
 * move towards the head of the list, printing the head data at the end. 
 * 
 * Note :
 * You can’t change any of the pointers in the linked list, just print it in the
 * reverse order.
 * 
 * @author Durgesh
 *
 */
public class PrintLinkedListInReverse {

	public static void main(String[] args) {
		Node<Integer> head = ReturnLinkedList.getLinkedList(8);
		PrintLinkedList.printLinkedList(head);
		System.out.println("\nPrinting linked list in reverse order: ");
		printReverse(head);
	}

	/**
	 * method to print the linked list in reverse order
	 * 
	 * @param head
	 */
	public static void printReverse(Node<Integer> head) {
		// check if head is null
		if (head == null)
			return;
		// make recursive call passing next of head node
		printReverse(head.next);
		// print the head node data
		System.out.print(head.data + " ");
	}

}

/**
 * Here purpose is printing the linked list in reverse, not physically reversing
 * the linked list
 * 
 * here RECURSION mechanism will be very handy, why??? BECAUSE we can make all
 * recursive calls first, till the base case is met, then we can start printing
 * the head data, this way data will be printed in reverse.
 * 
 * ALGORITHM... 1. cHECK if head is null then return 2. Make a recursive call to
 * the printReverse function passing the next of head node. 3. print data of
 * head node.
 */
