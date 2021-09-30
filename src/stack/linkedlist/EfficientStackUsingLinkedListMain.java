package stack.linkedlist;

public class EfficientStackUsingLinkedListMain {

	public static void main(String[] args) {
		EfficientStackUsingLinkedList<Integer> stack = new EfficientStackUsingLinkedList<>();
		
		//pushing elements in stack
		stack.push(12);
		stack.push(120);
		stack.push(1002);
		stack.push(10);
		
		//stack size, top element, and pop operations
		System.out.println("Total elements in stack: "+stack.size());
		System.out.println("Element at top of stack: "+stack.top());
		System.out.println("Popped element: "+stack.pop());

		//stack size, top element, and pop operations
		System.out.println("\nTotal elements in stack: "+stack.size());
		System.out.println("Element at top of stack: "+stack.top());
		System.out.println("Popped element: "+stack.pop());

	}

}
