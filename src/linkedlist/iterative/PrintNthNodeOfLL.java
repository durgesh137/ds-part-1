package linkedlist.iterative;

import linkedlist.Node;
import linkedlist.PrintLinkedList;
import linkedlist.ReturnLinkedList;

/**
 * CORRECT...
 * Print nth Node For a given a singly linked list of integers and a position
 * 'n', print the node data at the 'n-th' position.
 * 
 * here indexing starts from index 0
 * 
 * @author Durgesh
 *
 */
public class PrintNthNodeOfLL {

	public static void main(String[] args) {
		// LinkedList of size 10 having random integer values
		Node<Integer> head = ReturnLinkedList.getLinkedList(15);
		PrintLinkedList.printLinkedList(head);
		printNthNode(head, 30);// should print 4th node

	}

	/**
	 * Method finds the nth node of LinkedList and prints it
	 * 
	 * @param head
	 * @param n
	 */
	public static void printNthNode(Node<Integer> head, int n) {
		// check if head is null
		if (head == null)
			return;

		// integer variable to count elements
		Node<Integer> temp = head;
		int count = 0;

		// loop works till complete linkedlist is not traversed
		while (temp != null) {
			// nth node found
			if (count == n) {
				System.out.println("\n" + temp.data + " n: " + n);
				return;
			}
			// increment count by 1
			count++;
			// make head point to next node
			temp = temp.next;
		}
	}
}
