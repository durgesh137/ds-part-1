package linkedlist;

/**
 * You have been given a linked list of integers. Your task is to write a
 * function that deletes a node from a given position, 'POS'. 
 * 
 * Note : Assume that the Indexing for the linked list always starts from 0.
 * 
 * If the position is greater than or equal to the length of the linked list,
 * you should return the same linked list without any change.
 * 
 * @author Durgesh
 *
 */
public class DeleteNodeFromLinkedList {

	public static void main(String[] args) {
		Node<Integer> head = ReturnLinkedList.getLinkedList(8);
		PrintLinkedList.printLinkedList(head);
		int pos = 7;//index starts from 0
		head = deleteNode(head, pos);
		System.out.println("\nNode at index "+pos+" is deleted!!");
		PrintLinkedList.printLinkedList(head);
	}
	
	public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
		//validate head node
        if(head == null)
			return head;
		
		//handling case when first element needs to be deleted
		if(pos == 0) {
			head = head.next;
			return head;
		}
        
        //current node variable to traverse the linkedlist
        Node<Integer> currNode = head;
		//integer for counting the nodes
		int count = 1;
		
		//idea is to traverse the list prior to the "pos" position  
		//loop works till either the linkedlist is traversed completely OR
		//count of nodes has exceeded the "pos" position 
		while(currNode != null && count < pos) {
			currNode = currNode.next;
			count++;
		}
		
		//next node of current node needs to be deleted
		//check if currNode is valid
		if(currNode != null && currNode.next != null) {
			//removing the next of current node
			currNode.next = currNode.next.next;
		}
		return head;
	}

}
