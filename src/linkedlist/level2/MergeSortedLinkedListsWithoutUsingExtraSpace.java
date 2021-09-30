package linkedlist.level2;

import linkedlist.Node;

/**
 * CORRECT... 
 * Merge two sorted LL without using extra space You have been
 * given two sorted(in ascending order) singly linked lists of integers. 
 * Write a function to merge them in such a way that the resulting singly linked list is
 * also sorted(in ascending order) and return the new head to the list.
 * 
 * @author Durgesh
 *
 */
public class MergeSortedLinkedListsWithoutUsingExtraSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static Node<Integer> mergeSortedLinkedLists(Node<Integer> head1, Node<Integer> head2) {
		if (head1 == null)
			return head2;
		if (head2 == null)
			return head1;
		
		//now both LinkedLists contains elements
		//defining the reference variables for resulting linkedlist
		Node<Integer> head3 = null, tail3 = null, small = null;
		Node<Integer> t1 = head1, t2 = head2;

		//initializing the head node of resulting list
			if(t1.data <= t2.data) {
				head3 = t1;
				tail3 = t1;
				t1 = t1.next;
			}else {
				head3 = t2;
				tail3 = t2; 
				t2 = t2.next;
			}
			
			//loop works till either among both the LinkedLists is not null
			while(t1 != null && t2 != null) {
				 //finding the smaller node among both the linkedlists
				//appending to tail3 node
				if(t1.data <= t2.data) {
					tail3.next = t1;
					tail3 = t1;
					//make t1 point to next node in LinkedList1
					t1 = t1.next;
				}else {
					//t2 is smaller
					tail3.next = t2;
					tail3 = t2;
					//update t2 point to next node in LinkedList2
					t2 = t2.next;
				}
			}
			//now only LinkedList among them will contain extra elements
			//check if extra nodes are left in LinkedList 1
			if(t1 != null) {
				//Only LinkedList1 contains more elements
				//so simply assign t1 to next of tail3
					tail3.next = t1;
			}
			
			//check if extra nodes are there in LinkedList 2
			if(t2 != null) {
				//Now only LinkedList2 contains more elements
				//simply assign t2 to next of tail3
					tail3.next = t2;
			}

				return head3;
	}
	/**
	 * Method merges both sorted linkedlists in ascending order and returns the final linkedlist
	 * @param head1
	 * @param head2
	 * @return
	 */
	public static Node<Integer> mergeSortedLinkedLists_Approach2(Node<Integer> head1, Node<Integer> head2) {
		if (head1 == null)
			return head2;
		else if (head2 == null)
			return head1;
		else {
			//defining the reference variables for resulting linkedlist
			Node<Integer> resultHead = null, tail = null, small = null;
			//reference variables for both the linkedlists
			Node<Integer> t1 = head1, t2 = head2;
			//loop works till both linkedlists contains elements
				while (t1 != null && t2 != null) {
	                //finding the smaller node among both the linkedlists
					if(t1.data <= t2.data) {
						small = t1;
						t1 = t1.next;
					}else {
						small = t2;
						t2 = t2.next;
					}
	                //storing the small node in resulting linkedlist
					//check if resulting LinkedList is null
					if(resultHead == null) {
						resultHead = small;
						tail = small;
					}else {
						//resulting LinkedList contains elements
						//so make small node next of tail node
						tail.next = small;
						tail = small;
					}
				}
				
				//now only LinkedList among them will contain extra elements
				//check if extra nodes are left in LinkedList 1
				if(t1 != null) {
					//Only LinkedList1 contains more elements
					//so simply assign t1 to next of tail3
						tail.next = t1;
				}
				
				//check if extra nodes are there in LinkedList 2
				if(t2 != null) {
					//Now only LinkedList2 contains more elements
					//simply assign t2 to next of tail3
						tail.next = t2;
				}
				return resultHead;
			}
	}
}

/**
 * L1: 1->3->5 L2: 2->4->6->8
 * ALGORITHM for approach 2...
 * 1. Check if head1 of LinkedList 1 is null, return head2
 * 2. Else if head2 of linkedlist2 is null, return head1
 * 3. else, declare and initialize the variables like resultHead, t1 to store head of linkedlist1, t2 to store the head of linkedlist2,
 * t1 variable to insert the current smaller node at the next of tail directly, and small node variable to store the current smaller node among
 * both the LinkedLists
 * 4. The while loop works, till both the LinkedList contains elements
 * 	1. First find the current smaller node among both nodes, check if resultHead is null, any element is not added in new result linked list, then
 * 	make small node the head of result linked list, and initialize the tail node with same value, since only 1 elements exists in new LinkedList
 * 2. If the resultHead is not null, make the small node the next node of tail node, and make tail the last node of Linkedlist by assigning small to it
 * 3. Repeat these steps till any one LinkedList does not end, that at least one t1 or t2 does not become null
 * 
 *5. Check if there are nodes left in t1, simply make t1 next of tail node
 *6. Check if there are nodes left in t2, simply make t2 next of tail node
 *7. Return the head of newer merged linked list, that is resultHead is returned. 
 */
