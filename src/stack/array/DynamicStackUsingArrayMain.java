package stack.array;

public class DynamicStackUsingArrayMain {

	public static void main(String[] args) {
		// dynamic stack object created to store integers
		DynamicStackUsingArray stack = new DynamicStackUsingArray();

		// inserting/pushing 5 elements in stack
		for (int i = 10; i < 60; i += 10)
			stack.push(i);

		// print stack detail
		System.out.println(stack);
		// total elements stack has
		System.out.println("Size: " + stack.size());

		// adding mores elements to check behaviour of dynamic stack
		stack.push(100);
		stack.push(1000);
		System.out.println("\n" + stack);
		System.out.println("Stack size: " + stack.size());
		
		System.out.println("Removing top element");
		stack.pop();//top element removed from stack
		System.out.println(stack);
	}

}
