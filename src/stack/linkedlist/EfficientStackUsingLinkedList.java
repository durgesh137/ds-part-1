package stack.linkedlist;

/**
  * consider example:
 * what if we add new element at front, rather than at last/end
 * first 1 is inserted.
 * Now 2 is inserted, thus list becomes 2->1, rather than 1->2  
 * Now 3 is inserted, list becomes 3->2->1
 * 
 * create new node to be inserted, now to push element, update new node with
 * head node and next of newNode the already existing head
 * INSERT AT BEGINING idea should be followed
 * thus push as well pop takes O(1) complexity
 * 
 * @author Durgesh
 *
 * @param <T>
 */
public class EfficientStackUsingLinkedList<T> {
	//instance attributes
	Node<T> headNode;//acts as top/head element
	//total elements stack has so far 
	int top;
	
	public EfficientStackUsingLinkedList() {
		headNode = null;
		top = -1;
	}
	
	/**
	 * method provides total elements present in stack
	 * @return
	 */
	public int size() {
		return top + 1;
	}
	
	/**
	 * method returns true if Stack is empty, otherwise false
	 * @return
	 */
	public boolean isEmpty() {
		//headNode null, does not contain any element
		if(this.headNode == null)
			return true;
		return false;
	}
	
	/**
	 * method pushes element as next of head element
	 * done in O(1)
	 * @param element
	 */
	public void push(T element) {
		//create new node to inserted
		Node<T> newNode = new Node<T>(element);
		
		//if stack is empty
		if(headNode == null) {
			//make newNode the head node
			headNode = newNode;
		}else {
			//insertion at beginning
			//make headNode next of newNode
			newNode.next = headNode;
			//update headNode to new head
			headNode = newNode;
		}
		//increment size
		this.top++;
	}
	
	/**
	 * Method removes element at top of stack
	 * done in O(1)
	 * @return
	 */
	public T pop() {
		//check if stack contains elements
		if(this.isEmpty())
			return null;
		//top element needs to be removed
		T data = headNode.data;//data to be removed
		//we know nodes are added at beginning
		headNode = headNode.next;
		//decrement size
		this.top--;
		return data;
	}
	
	/**
	 * method returns element at top of stack
	 * @return
	 */
	public T top() {
		//check if stack contains elements
		if(this.isEmpty())
			return null;
		//top element data
		T data = headNode.data; 
		return data;
	}
}

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
