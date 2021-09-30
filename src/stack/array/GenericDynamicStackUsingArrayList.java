package stack.array;

import java.util.ArrayList;

public class GenericDynamicStackUsingArrayList<T> {

	// internal structure to be used as Stack
	ArrayList<T> data;

	// index of track the top index
	int nextIndex;

	// total stack size
	int capacity;

	// 0-arg constructor to initialize instance attributes
	public GenericDynamicStackUsingArrayList() {
		// internal array structure of length 5
		data = new ArrayList<T>();

		// next top index to push/pop element
		nextIndex = 0;

		// setting stack capacity as total size
		capacity = data.size();
	}

	/**
	 * method provides total elements stack has
	 * 
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
	public void push(T element) {
		// now no need to check size, since arraylist internally grows,based on
		// requirement
		// setting capacity fields to double size
		// stack has empty space
		data.add(element);
		nextIndex++;// increment nextIndex, as result size is incremented

	}

	/**
	 * method removes element at front of stack
	 * 
	 * @return
	 */
	public T pop() {
		// check if stack is empty
		if (this.isEmpty()) {
			System.out.println("Stack is empty!!");
			return null;//T;
		}
		// stack contains at least 1 element
		// decrement nextIndex first
		nextIndex--;
		
		// now return value at nextIndex is the top element
		return this.data.remove(nextIndex);
		
	}

	/**
	 * method returns element at top of stack, without removing it
	 * 
	 * @return
	 */
	public T top() {
		// stack is empty
		if (this.isEmpty()) {
			System.out.println("Stack is empty!!");
			return null;
		}
		// stack contains at least one element
		return data.get(nextIndex - 1);
	}

	/**
	 * method provides Stack details in String form
	 */
	public String toString() {
		String result = "GenericDynamicStack[";
		// sequentially each stack element and appending in result string
		for (int i = 0; i < nextIndex; i++) {
			result += data.get(i);
			// check if current index is not the last index
			if (i != nextIndex - 1) {
				result += ", ";
			}
		}
		result += "]";
		return result;
	}
}
