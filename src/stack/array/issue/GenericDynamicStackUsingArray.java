package stack.array.issue;

/**
 * Error: Cannot create a generic array of T

 * @author Durgesh
 *
 * @param <T>
 */
public class GenericDynamicStackUsingArray<T> {
	// internal structure to be used as Stack
	T[] data;

	// index of track the top index
	int nextIndex;

	// total stack size
	int capacity;

	//0-arg constructor to initialize instance attributes
	public GenericDynamicStackUsingArray() {
		// internal array structure of length 5
		data = new T[5];//can't create generic array of type T

		// next top index to push/pop element
		nextIndex = 0;

		// setting stack capacity as total size
		capacity = data.length;
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
		// nextIndex, that is, top index matches the stack capacity
		// stack is full
		if (nextIndex == capacity) {
			//create temp[] of double size
			T tempData[] = new T[2 * capacity];
			//copy each element of data[] to tempData[]
			for(int i=0; i< capacity; i++) {
				tempData[i] = data[i];
			}
			//setting capacity fields to double size
			capacity = 2 * capacity;
			
			//assign tempData reference to data[]
			data = tempData;
		}
		// stack has empty space
		data[nextIndex] = element;//element inserted
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
			return null;
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
	public T top() {
		// stack is empty
		if (this.isEmpty()) {
			System.out.println("Stack is empty!!");
			return null;
		}
		// stack contains at least one element
		return data[nextIndex - 1];
	}

	/**
	 * method provides Stack details in String form
	 */
	public String toString() {
		String result = "DynamicStack[";
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
