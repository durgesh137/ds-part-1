package linkedlist.iterative;

import linkedlist.Node;
import linkedlist.PrintLinkedList;
import linkedlist.ReturnLinkedList;

/**
 * Find the mid point of linked list having integers
 * @author Durgesh
 *
 */
public class MidPointOfLinkedList {

	public static void main(String[] args) {
		Node<Integer> head = ReturnLinkedList.getLinkedList(8);
		PrintLinkedList.printLinkedList(head);
		midPointOfLinkedList(head);
	}

	public static void midPointOfLinkedList(Node<Integer> head) {
		if(head == null)
			return;
		Node<Integer> temp = head, mid = head;
		while(temp != null) {
			//temp node moves by ahead two nodes
			temp = temp.next;
			if(temp != null)
				temp = temp.next;
			else
				break;
			//mid moves by single node only
			mid = mid.next;
		}
		
		System.out.println("Mid node: "+mid.data);
	}
}
