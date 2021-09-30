package stack.array;

public class StackUsingArrayMain {

	public static void main(String[] args) {
		StackUsingArray stack = new StackUsingArray(10);

		// push/insert 200 in stack
		stack.push(200);

		// push 500
		stack.push(500);
		stack.push(1000);
		stack.push(100);
		stack.push(20);
		
		System.out.println(stack);
		// here element present at top, returned but not removed
		System.out.println("Element at top of stack: " + stack.top());

		// element at top of stack is removed now
		int removedTopElement = stack.pop();
		System.out.println("Element removed: " + removedTopElement);
	}

}
