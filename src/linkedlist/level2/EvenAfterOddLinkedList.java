package linkedlist.level2;

import linkedlist.Node;
import linkedlist.PrintLinkedList;

/**
 * Even after Odd LinkedList For a given singly linked list of integers, arrange
 * the elements such that all the even numbers are placed after the odd numbers.
 * 
 * The relative order of the odd and even terms should remain unchanged.
 * 
 * Sample input 1 : 1 4 5 2 -1 Sample output 1: 1 5 4 2
 * 
 * Sample Input2: 1 11 3 6 8 0 9 -1 Sample output2: 1 11 3 9 6 8 0
 * 
 * Sample Input3: 10 20 30 40 -1 Sample output3:10 30 20 40
 * 
 * @author Durgesh
 *
 */

public class EvenAfterOddLinkedList {

	public static void main(String[] args) {

		Node<Integer> head = getLinkedList("4 2 7 8 3 36");
		showList(head);
		System.out.println("\nPlacing Even after odd");
		Node<Integer> output = evenAfterOdd(head);
		System.out.println("Head now: " + output.data);
		showList(output);
	}

	private static void showList(Node<Integer> head) {
		System.out.println("Elements are: ");
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	private static Node<Integer> getLinkedList(String string) {
		String values[] = string.trim().split(" ");
		Node<Integer> head = null, tail = null;
		for (int i = 0; i < values.length; i++) {
			Node<Integer> currNode = new Node<Integer>(Integer.parseInt(values[i]));
			if (head == null) {
				head = currNode;
				tail = head;
			} else {
				tail.next = currNode;
				tail = tail.next;
			}
		}

//		tail.next = null;		
		return head;
	}

	/**
	 * This method place all odd numbers followed by even numbers Cases 1: When all
	 * elements are odd When all elements are even Rest all other cases can be
	 * covered easily
	 * 
	 * @param head
	 * @return
	 */
	public static Node<Integer> evenAfterOdd(Node<Integer> head) {
		if (head == null)
			return head;
		// temporary node storing head reference
		Node<Integer> currNode = head;

		Node<Integer> hEven = null, hOdd = null, tEven = null, tOdd = null;

		// loop works till currNode is valid
		while (currNode != null) {
			if (currNode.data % 2 == 0) {
				// even element
				if (hEven == null) {
					hEven = currNode;
					tEven = currNode;
				} else {
					tEven.next = currNode;
					tEven = currNode;
				}
			} else {
				// odd element
				if (hOdd == null) {
					hOdd = currNode;
					tOdd = currNode;
				} else {
					tOdd.next = currNode;
					tOdd = currNode;
				}
			}
			currNode = currNode.next;
		} // loop ends;
		
		//all elements are even
		if (tOdd == null)
			return head;
		else {
			//even elements also exists
			if (hEven != null) {
				tOdd.next = hEven;
				tEven.next = null;
			}
			//for case when only odd occurs, automatically handled
			return hOdd;
		}
	}
}

/**
 * For placing all odds followed by even elements of linked list
 * ==============================================================
 *	1. Idea is using separate head and tail variables for even and odd elements 
 *  of linked list.
 *  2. First time whenever even element is encountered, headEven and tailEven are
 *  initialized with that element.
 *  3. Similarly whenever first time odd element is encountered, oddEven and oddTail are
 *  encountered both these variables are initialized with that element.
 *  4. Further the currNode is repeated within a loop , till end is not encountered.
 *  5. Whenever odd or even element is encountered, corresponding node is appended as next
 *  element of tail of odd or even element.
 *  6. Further at the end, when currNode becomes null, then it is being check if all elements are 
 *  even, that is , headOdd is null, than same head is returned.
 *  7. Otherwise, it is being check if headOdd is null,that is all elements are even, then
 *  headEven is returned.
 *  8. Else, headEven is appended as next of tailOdd, further headOdd is returned.
 *    
 *  Now whenever a
 * 1. Check if head is empty then, return head
 * 
 * 2.Take headEven, headOdd, tailEven, and tailOdd elements initialized to null.   
 *  and  store head in currNode .
 * 3. Execute a while...loop 
 * 
 * 
 * 
 * 
 */ 
