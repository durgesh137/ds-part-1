package linkedlist;

public class PrintLinkedList {
	/**
	 * method to show complete linked list
	 * 
	 * @param head
	 */
	public static void printLinkedList(Node<Integer> head) {
		System.out.println("Elements of LinkedList are: ");
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

}
