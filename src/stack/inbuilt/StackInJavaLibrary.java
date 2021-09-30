package stack.inbuilt;

import java.util.Stack;

/**
 * Stack are present in java collections framework
 * @author Durgesh
 *
 */
public class StackInJavaLibrary {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		//push elements in stack
		stack.push(22);
		stack.push(234);
		stack.push(100);
		stack.push(2345);
		
		//top is the name used in our code implementation
		System.out.println("Top element: "+stack.peek());
		System.out.println("Stack: "+stack);
		
		//popping stack till is not empty
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}
