package stack.linkedlist;

/**
 * first 1 is pushed, then 2 is pushed, further 3 is pushed like 1 -> 2-> 3 -> 4
 * basic push-pop operations must be very fast.
 * 
 * we know elements must inserted as the last element, to push/insert new
 * element, every now and then need to traverse till the last element, only then
 * new element can be pushed. Hence using an extra tail node will be handy here.
 * 
 * push => without tail node => take O(n) with tail nodes => takes O(1)
 * 
 * pop() operations, takes O(n) to remove element from last. since we need to
 * traverse till node prior to tail node, thus it takes O(n) complexity
 * 
 * @author Durgesh
 *
 * @param <T>
 */
public class StackUsingLinkedList<T> {
	// instance attributes
	private Node<T> headNode;// acts as top/head element
	private Node<T> tailNode;// for inserting elements at last in O(1)
	// total elements stack has so far
	private int top;

	public StackUsingLinkedList() {
		headNode = null;
		tailNode = null;
		top = -1;
	}

	/**
	 * method provides total elements present in stack
	 * 
	 * @return
	 */
	public int size() {
		return top + 1;
	}

	/**
	 * method returns true if Stack is empty, otherwise false
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		// headNode null, does not contain any element
		if (this.headNode == null)
			return true;
		return false;
	}

	/**
	 * method pushes element as next of head element done in O(1)
	 * 
	 * @param element
	 */
	public void push(T element) {
		// create new node to inserted
		Node<T> newNode = new Node<T>(element);

		// if stack is empty
		if (headNode == null) {
			// make newNode the head as well as the tail node
			headNode = newNode;
			tailNode = newNode;

		} else {
			// now extra elements exists in stack
			// make new node next of tail node
			tailNode.next = newNode;
			// make tail point to the last node, newNode
			tailNode = newNode;
		}
		// increment size
		this.top++;
	}

	/**
	 * Method removes element at top of stack done in O(1)
	 * 
	 * @return
	 */
	public T pop() {
		// check if stack contains elements
		if (this.isEmpty())
			return null;
		// now tailNode needs to popped
		Node<T> currNode = headNode;
		T poppedData = tailNode.data;

		// only 1 element exists
		if (headNode == tailNode) {
			// make headNode and tailNode null
			headNode = tailNode = null;
			return poppedData;
		}
		// currNode is the headNode
		// Stack contains more than 1 element
		while (currNode.next != tailNode) {
			// make currNode point to the next node
			currNode = currNode.next;
		}
		// now next of currNode is tailNode
		// simply make currNode the tailNode
		tailNode = currNode;
		tailNode.next = null;

		// decrement size
		this.top--;

		return poppedData;
	}

	/**
	 * method returns element at top of stack
	 * 
	 * @return
	 */
	public T top() {
		// check if stack contains elements
		if (this.isEmpty())
			return null;
		// top element data
		T data = tailNode.data;
		return data;
	}

	/**
	 * Node class represents each individual node in linkedlist internal structure
	 * to simulate Stack
	 * 
	 * @author Durgesh
	 *
	 * @param <T>
	 */
	class Node<T> {
		T data;
		Node<T> next;

		Node(T data) {
			this.data = data;
			next = null;
		}

		Node() {
			next = null;
		}

	}

}