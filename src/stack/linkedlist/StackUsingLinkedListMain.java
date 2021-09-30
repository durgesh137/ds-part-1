package stack.linkedlist;

public class StackUsingLinkedListMain {

	public static void main(String[] args) {
		StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<>();
		
		//pushing elements in stack
		stack.push(12);
		stack.push(120);
		stack.push(1002);
		stack.push(10);
		
		System.out.println("Total elements in stack: "+stack.size());
		System.out.println("Element at top of stack: "+stack.top());
		System.out.println("Popped element: "+stack.pop());

		System.out.println("\nTotal elements in stack: "+stack.size());
		System.out.println("Element at top of stack: "+stack.top());
		System.out.println("Popped element: "+stack.pop());

	}

}
