package stack.array;

public class StackUsingArray {
	// internal structure to be used as Stack
	int[] data;

	// index of track the top index
	int nextIndex;

	// total stack size
	int capacity;

	// constructor to initialize instance attributes
	public StackUsingArray(int totalSize) {
		// internal array structure of capacity totalSize
		data = new int[totalSize];

		// next top index to push/pop element
		nextIndex = 0;

		// setting stack capacity as total size
		capacity = totalSize;
	}

	/**
	 * method provides total elements stack has
	 * @return
	 */
	public int size() {
		return nextIndex;
	}

	/**
	 * @return stack is empty or not
	 */
	public boolean isEmpty() {
		/**
		 * checks if nextIndex is 0, then empty else, contains elements
		 */
		return nextIndex == 0;
	}

	/**
	 * method inserts element in stack
	 * 
	 * @param element
	 */
	public void push(int element) {
		// nextIndex, that is, top index matches the stack capacity
		// stack is full
		if (nextIndex == capacity) {
			System.out.println("Stack is full");
			return;
		}
		// stack has empty space
		data[nextIndex] = element;
		nextIndex++;// increment nextIndex, as result size is incremented
	}

	/**
	 * method removes element at front of stack
	 * 
	 * @return
	 */
	public int pop() {
		// check if stack is empty
		if (this.isEmpty()) {
			System.out.println("Stack is empty!!");
			return Integer.MIN_VALUE;
		}
		// stack contains atleast 1 element

		// decrement nextIndex first
		nextIndex--;
		// now return value at nextIndex is the top element
		return data[nextIndex];
	}

	/**
	 * method returns element at top of stack, without removing it
	 * 
	 * @return
	 */
	public int top() {
		// stack is empty
		if (this.isEmpty()) {
			System.out.println("Stack is empty!!");
			return Integer.MIN_VALUE;
		}
		// stack contains atleast one element
		return data[nextIndex - 1];
	}

	/**
	 * method provides Stack details in String form
	 */
	public String toString() {
		String result = "Stack[";
		// sequentially each stack element and appending in result string
		for (int i = 0; i < nextIndex; i++) {
			result += data[i];
			// check if current index is not the last index
			if (i != nextIndex - 1) {
				result += ", ";
			}
		}
		result += "]";
		return result;
	}
}
