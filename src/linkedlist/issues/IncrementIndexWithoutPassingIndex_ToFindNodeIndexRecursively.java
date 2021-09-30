package linkedlist.issues;

import linkedlist.Node;

/**
 * CORRECT... 
 * @author Durgesh
 *
 */
public class IncrementIndexWithoutPassingIndex_ToFindNodeIndexRecursively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * Method
	 * 
	 * @param head
	 * @param n
	 * @return
	 */
	public static int findNodeRec(Node<Integer> head, int n) {
		int index = -1;
		// head is null, represents linked list is empty or end is reached
		if (head == null)
			return index;// -1 returned

		// element n found
		if (head.data == n)
			return ++index;// increment index by 1
		
		//there might be a possibility of finding n in next elements of linked list
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
 * ALGORITHM
 * 1. Define index variables as -1.
 * 2. Check if head element is null, then return -1
 * 3. Check if data of head is equal to n, then increment index by 1 and return it.
 * 4. Make a recursive call to find if n exists in next positions of linked list by passing next of head,n and 
 * 	store the returned value in preIndex variable.
 * 5. Check if preIndex is -1, then return it.
 * 6. Otherwise return preIndex + 1.
 * How Find node recursively in linkedlist and return the index 1-2-3-4-5 n = 4
 * find(1,n) -> 3 find(2,n) -> 2 find(3,n) -> 1 find(4,n) ==> 0
 * 
 */
