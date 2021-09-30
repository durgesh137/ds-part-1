package linkedlist;

public class HelloLinkedListMain {

	public static void main(String[] args) {
		nodesCreationAndLinking();
		creatingMoreNodesAndLinking();
		creatingNodesAndPrintingMultipleTimes();
	}

	private static void creatingNodesAndPrintingMultipleTimes() {
		System.out.println("\n_________Creating LinkedList Nodes and Printing Mulitple times _________");
		// creating 3 LinkedList nodes
		Node<Integer> node1 = new Node<Integer>(100);
		Node<Integer> node2 = new Node<Integer>(200);
		Node<Integer> node3 = new Node<Integer>(300);

		// linking these 3 nodes
		node1.next = node2;
		node2.next = node3;

		// creating head node reference variable
		Node<Integer> head = node1;
		System.out.println("Printing the LinkedList twice...");
		printLinkedList(head);
		
		//printing same linkedlist again
		System.out.println("\nPrinting the LinkedList again...");
		printLinkedList(head);
		
		//printing same linkedlist again
		System.out.println("\nPrinting the LinkedList the once again...");
		printLinkedList(head);

		//hence linkedlist can be printed any number of times, only we need to remember the head node reference,
		//here head is modified within another method, but hence there is no effect in this method
		System.out.println("\nFinished printing LinkedList thrice!!!");
		
		System.out.println("\n\nPrinting the Same LinkedList twice in another method...");
		printLinkedListTwice(head);
	}

	private static void printLinkedListTwice(Node<Integer> head) {
		//keep head node unmodified and 
		//using another Node reference variable to traverse the linkedlist
		
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			//make temp point to next node
			temp = temp.next;
		}
		
		//making temp point to head node again
		temp = head;
		//now again linkedlist can be printed
		System.out.println("\nLinkedList printing second time within same function...");
		while(temp != null) {
			System.out.print(temp.data + " ");
			//make temp point to next node
			temp = temp.next;
		}
		
		System.out.println("\nLinkedList printing completed!!!");
	}
	

	private static void printLinkedList(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	/**
	 * Method to create multiple nodes, link them, and print them using loop
	 */
	private static void creatingMoreNodesAndLinking() {
		System.out.println("\n_________Creating More LinkedList Nodes and Linking them_________");
		// creating 3 LinkedList nodes
		Node<Integer> node1 = new Node<Integer>(100);
		Node<Integer> node2 = new Node<Integer>(200);
		Node<Integer> node3 = new Node<Integer>(300);

		// linking these 3 nodes
		node1.next = node2;
		node2.next = node3;

		// creating head node reference variable
		Node<Integer> head = node1;
		System.out.println("Printing the LinkedList...");

		// linkedlist ends when last node is null, that is, any further node is not there
		// printing all linkedlist nodes till head is not null
		while (head != null) {
			System.out.print(head.data + " ");
			// make head point to next node
			head = head.next;
		}
		
		//now head points to null hence further again same linkedlist can't be printed
		System.out.println("Trying to print the same linkedlist");
		while (head != null) {
			System.out.print(head.data + " ");
			// make head point to next node
			head = head.next;
		}
		System.out.println("finished printing linkedlist...");
	}

	/**
	 * Method to create two LinkedList nodes, and linking them, further printing the
	 * addresses
	 */
	private static void nodesCreationAndLinking() {
		// creating LinkedList nodes
		Node<Integer> node1 = new Node<Integer>(100);
		Node<Integer> node2 = new Node<Integer>(200);

		// linking both nodes node1 and node2
		node1.next = node2;

		// printing addresses pointed by node2 and next of node1
		System.out.println(node2);
		System.out.println(node1.next);

	}

}
