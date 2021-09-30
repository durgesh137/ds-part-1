package linkedlist.iterative;

import linkedlist.Node;
import linkedlist.PrintLinkedList;
import linkedlist.ReturnLinkedList;

/**
 * CORRECT...
 * This class reverses the given linked list
 * @author Durgesh
 *
 */
public class ReverseLinkedList {

	public static void main(String[] args) {
		//creating linkedlist of size 6
		Node<Integer> head = ReturnLinkedList.getLinkedList(6);
		//printing the linked list contents
		PrintLinkedList.printLinkedList(head);
		
		//reversing the linkedlist and storing the newHead
		Node<Integer> newHead = reverse(head);
		
		System.out.println("\nLinkedList is reversed");
		//linkedlist nodes after reversal
		PrintLinkedList.printLinkedList(newHead);
	}

	/**
	 * method reverses the given linked list
	 * @param head
	 * @return
	 */
	public static Node<Integer> reverse(Node<Integer> head) {
		if (head == null)
			return head;
		// linkedlist contains atleast one element now
		// defining required variables
		Node<Integer> currNode = head, nextNode = null, prevNode = null;

		// loop works till currNode is not null
		while (currNode != null) {
			// store next of currNode in nextNode
			nextNode = currNode.next;

			// make next of currNode point to the previous Node
			currNode.next = prevNode;

			// make previous node become the current node for next elements of linked list
			prevNode = currNode;

			// update currNode to nextNode of linked list
			currNode = nextNode;
		}
		// since currNode is null, now prevNode points to very last element traversed in
		// loop
		// that is, prevNode is the head node of the reverse linked list
		return prevNode;
	}
}
