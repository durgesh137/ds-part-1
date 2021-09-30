package stack.array;

public class GenetricDynamicStackUsingArrayListMain {

	public static void main(String[] args) {
		GenericDynamicStackUsingArrayList<Double> stack = new GenericDynamicStackUsingArrayList<>();
		// inserting/pushing 5 elements in stack
		for (double i = 10; i < 60; i += 10)
			stack.push( i);

		// print stack detail
		System.out.println(stack);
		// total elements stack has
		System.out.println("Size: " + stack.size());

		// adding mores elements to check behaviour of dynamic stack
		stack.push(100.2);
		stack.push(1000.3);
		System.out.println("\n" + stack);
		System.out.println("Stack size: " + stack.size());

		System.out.println("Removing top element");
		stack.pop();// top element removed from stack
		System.out.println(stack);
	}

}
