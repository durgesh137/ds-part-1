package linkedlist.iterative;

import linkedlist.Node;
import linkedlist.PrintLinkedList;
import linkedlist.ReturnLinkedList;

/**
 * CORRECT...
 * Find a Node in Linked List
 * ===============================
 * You have been given a singly linked list of integers. 
 * Write a function that returns the index/position of integer data 
 * denoted by 'N' (if it exists). Return -1 otherwise.

 * @author Durgesh
 *
 */
public class FindIndexOfNodeIfExistsInLinkedList {

	public static void main(String[] args) {
		Node<Integer> head = ReturnLinkedList.getLinkedList(7);
		PrintLinkedList.printLinkedList(head);
		System.out.println("index of 45: "+findNode(head, 45));
	}

	/**
	 * Method provides the index of the data if exists in linkedlist
	 * @param head
	 * @param data
	 * @return
	 */
	public static int findNode(Node<Integer> head, int data) {
		int index  = -1;
		
		//head element does not exist, linkedlist is empty
		if(head == null)
			return index;
		
		//Temporary node to traverse the linkedlist
		Node<Integer> currNode = head;
		
		//now atleast head element exists in linkedlist
		index = 0;
		
		//flag variable to track if node data found
		boolean found  = false;
		
		//loop works till currNode is not null and same data is not found
		while(currNode != null){//} && currNode.data != data) 
            //same data found
			if(currNode.data == data){
                found = true;//updating flag
                break;
	        }
			index++;
			//make current node point to the next element in linkedlist 
			currNode = currNode.next;
		}
        if(!found)
            return -1;
		return index;
	}
}

/**
 * Approach:
 * 1. Check if head is null, then return -1
 * 
 * 2. Initialize currNode with head node, initialize index as 0, since atleast 1 nodes as head element exists in
 * linkedlist, and boolean variable found with value false.
 * 
 * 3.Loop works till current node is not null, that is, end of linked list is not reached
 * 4. In each iteration data of currNode is compared with data value, 
	 * if matched, then flag variable is updated with
	 	value true, further the loop is terminated using the break statement.
	 * If matching data is not found in the linkedlist, then  index is incremented by 1, and temp is updated to 
	  point to the next node in linkedlist
 * 5. If found flag is false, then -1 is returned
 * 6. otherwise index value is returned. 
 */
