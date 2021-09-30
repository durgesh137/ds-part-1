package linkedlist.iterative;

import linkedlist.Node;
import linkedlist.PrintLinkedList;
import linkedlist.ReturnLinkedList;

/**
 * CORRECT...
 * Eliminate duplicates from LL ============================ You have been given
 * a singly linked list of integers where the elements are sorted in ascending
 * order.
 * 
 * Write a function that removes the consecutive duplicate values such that the
 * given list only contains unique elements and returns the head to the updated
 * list.
 * 
 * Input 1: 1 2 3 3 3 3 4 4 4 5 5 7 Input 2: 10 10 10 10 Input 3: 10 10 10 10
 * 
 * @author Durgesh
 *
 */
public class RemoveDuplicatesFromSortedLinkedList {

	public static void main(String[] args) {
		testcases();
	}

	private static void testcases() {
		System.out.println("TestCase 1:");
		Node<Integer> head = ReturnLinkedList.getSortedLinkedListHavingDuplicates(10);
		PrintLinkedList.printLinkedList(head);
		head = removeDuplicates_Approach2(head);
		PrintLinkedList.printLinkedList(head);

		System.out.println("\nTestCase 2:");
		head = ReturnLinkedList.getLinkedHavingSameValue(6);
		PrintLinkedList.printLinkedList(head);
		head = removeDuplicates_Approach2(head);
		PrintLinkedList.printLinkedList(head);

	}

	/**
	 * Method removes duplicates from sorted linkedlist
	 * @param head
	 * @return
	 */
	public static Node<Integer> removeDuplicates(Node<Integer> head) {
		// linked list is empty or contains one element only
		if (head == null || head.next == null)
			return head;
		// node variables to work duplicates
		Node<Integer> currNode = head, nextNode = head.next;

		// loop works till end of list is not reached
		while (nextNode != null) {
			// data of currNode matches with nextNode data
			// if(currNode.data. == nextNode.data){
			if (currNode.data.equals(nextNode.data)) {
				// loop works till nextNode is valid and match is found
				while (nextNode != null && currNode.data.equals(nextNode.data)) {
					// make nextNode point to the next node in linkedlist
					nextNode = nextNode.next;
				}
				// update next of currNode with nextNode
				currNode.next = nextNode;
				// make currNode the nextNode
				currNode = nextNode;

				// currNode is valid, make next point to next of currNode
				if (currNode != null)
					nextNode = currNode.next;
			} else {
				// match not found
				// make currNode point to the next element in linkedlist
				currNode = currNode.next;
				if (currNode != null)// valid currNode
					nextNode = currNode.next;// make nextNode point to next of currNode
				else// currNode is null
					nextNode = null;
			}

		}

		return head;
	}

	/**
	 * method removes duplicates from the linkedlist
	 * similar to above approach, shorted code
	 * @param head
	 * @return
	 */
	public static Node<Integer> removeDuplicates_Approach2(Node<Integer> head) {
		if (head == null)
			return head;
		Node<Integer> currNode = head;

		while (currNode.next != null) {
			//use equals operator for comparison of data
			if (currNode.data == currNode.next.data) {
				//use equal operator for data comparison
				while (currNode.next != null && currNode.data == currNode.next.data)
					currNode.next = currNode.next.next;
			} else {
				currNode = currNode.next;
			}
		}
		return head;
	}
}
