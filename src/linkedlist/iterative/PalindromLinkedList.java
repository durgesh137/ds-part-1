package linkedlist.iterative;

import linkedlist.Node;
import linkedlist.PrintLinkedList;
import linkedlist.ReturnLinkedList;

/**
 * CORRECT...
 * You have been given a head to a singly linked list of integers. Write a
 * function check to whether the linkedlist given is a 'Palindrome' or not.
 * 
 * 1.Empty linkedlist is always a palindrome
 * 
 * @author Durgesh
 *
 */
public class PalindromLinkedList {

	public static void main(String[] args) {
		Node<Integer> head = ReturnLinkedList.getLinkedList(6);
		PrintLinkedList.printLinkedList(head);
		System.out.println("is Palindrome?? "+isPalindrome(head));
	}

	public static boolean isPalindrome(Node<Integer> head) {
		boolean palindrome = true;

		// empty linkedlist
		if (head == null)
			return palindrome;

		// linkedlist atleast contains 1 head element now
		Node<Integer> temp = head;

		// finding the mid point of linkedlist using fail-fast approach
		Node<Integer> mid = midPointOfLinkedList(head);
		// reversing the second half of the linkedlist
		Node<Integer> secondHalfHead = reverseSecondHalf(mid);

		// loop works till end of secondHalf linkedlist is not reached
		while (secondHalfHead != null) {
			// check if data of both nodes is same
			if (secondHalfHead.data == temp.data) {
				// update nodes to point to the next node in linkedlists
				secondHalfHead = secondHalfHead.next;
				temp = temp.next;
			} else {
				// mismatch found
				palindrome = false;
				break;
			}
		}
		return palindrome;
	}

	/**
	 * this method reverses the second half of the linked list
	 * 
	 * @param mid
	 * @return
	 */
	private static Node<Integer> reverseSecondHalf(Node<Integer> mid) {
		if (mid == null)
			return mid;
		// now second half of linkedlist atleast contains 1 element
		Node<Integer> currNode = mid, nextNode = null, prevNode = null;

		while (currNode != null) {
			// store the next element of current node
			nextNode = currNode.next;

			// make next of currNode point to the previous node
			currNode.next = prevNode;

			// make prevNode become the currNode for the next elements of the linkedlist
			prevNode = currNode;

			// make currNode point to the next node of linkedlist
			currNode = nextNode;
		}
		// prevNode is the new head of second half of the linkedlist passed
		return prevNode;
	}

	private static Node<Integer> midPointOfLinkedList(Node<Integer> head) {
		if (head == null)
			return head;
		// initializing temp and mid node
		Node<Integer> temp = head, mid = head;

		// loop works till complete linked list is not traversed
		// using fail-fast approach
		while (temp != null) {
			// temp node moves by ahead two nodes
			temp = temp.next;
			if (temp != null)
				temp = temp.next;
			else
				break;
			// mid moves by single node only
			mid = mid.next;
		}

		return mid;
	}

}

/**
 * Concepts involved:
 * Palindrome is something which is same from start as well as from the end.
 * 
 * 1/ check if head element is  null,return true, since empty linked list is always a palindrome. 
 * 2. Find the mid point of linked list using the fail-fast approach
 * 3. Now reverse the second half of linkedlist from mid point
 * 4. compare each element of linkedlist from start, and each element of reversed second half. 
 * 5. This process is repeated till end of second half of the linkedlist is not reached.
 * 	or any mismatch is not found
 * 6. If end is reached, then it is palindrome, return true.
 * 7. if mismatch occurs, then it is not a palindrome, return false
 * 
 */
