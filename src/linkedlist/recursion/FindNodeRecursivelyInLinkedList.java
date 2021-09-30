package linkedlist.recursion;

import linkedlist.Node;

/**
 * CORRECT...
 * Find a node in LL (recursive) 
 * ================================ 
 * Given a singly linked list of
 * integers and an integer n, find and return the index for the first occurrence
 * of 'n' in the linked list. -1 otherwise. Follow a recursive approach to solve
 * this. Note : Assume that the Indexing for the linked list always starts from
 * 0.
 * 
 * 
 * Sample Input 1 :
 1
3 4 5 2 6 1 9 -1
100
Sample Output 1 :
-1
Sample Input 2 :
2
10 20010 30 400 600 -1
20010
100 200 300 400 9000 -34 -1
-34
Sample Output 2 :
1
5
 * @author Durgesh
 *
 */
public class FindNodeRecursivelyInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * Method
	 * @param head
	 * @param n
	 * @return
	 */
	public static int findNodeRec(Node<Integer> head, int n) {
		int index = -1;
		// head is null
		if (head == null)
			return index;// -1 returned

		// element n found
		if (head.data == n)
			return ++index;// increment index by 1

		// make recursive call to find n if exists
		int preIndex = findNodeRec(head.next, n);

		// once -1 detected directly returned
		if (preIndex == -1)
			return index;
		// valid index found, increment it by 1
		return preIndex + 1;
	}

}

/**
 * How 
 * Find node recursively in linkedlist and return the index
 * 1-2-3-4-5
 * n = 4
 * find(1,n) -> find(
 */
