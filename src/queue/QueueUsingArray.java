package queue;

public class QueueUsingArray {

	// private instance attributes
	private int data[];// for storing elements
	private int rear;// index of read end
	private int front; // index of front end
	private int size; // total elements present in queue

	// default constructor to initialize Queue having size of 10
	public QueueUsingArray() {
		// default number of elements possible is 10
		data = new int[10];
		// setting front and rear at -1
		front = rear = -1;
		// Queue is empty hence
		size = 0;
	}
	
	// parameterized Queue constructor having specified capacity
	public QueueUsingArray(int capacity) {
		// int[] length as specified capacity
		data = new int[capacity];
		// setting front and rear at -1
		front = rear = -1;
		// Queue is empty hence
		size = 0;
	}

	/**
	 * total elements available in Queue
	 * @return
	 */
	public int size() {
		return size;
	}
	
	/**
	 * method states if queue is empty or not
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	
	/**
	 * method inserts element at the rear end
	 * @param element
	 */
	public void enqueue(int element) {
		//check if Queue is full
		if(size == data.length) {
			System.out.println("Queue is full!!");
			return;
		}

		//check if queue is empty
		if(size == 0) {
			front = 0;
		}
		//initial rear value was -1	
		++rear;
		++size;
		
		//check if rear equals data length
		//resetting rear to start, using circular queue concept
		if(rear == data.length)
			rear = 0;
		//store element
		data[rear] = element;
	}

	/**
	 * method removes element from front of queue
	 * @return
	 */
	public int dequeue() {
		//queue is empty
		if(size == 0)
			return Integer.MIN_VALUE;
		//data to be removed
		int frontData = data[front];
		//increment front to next position
		front++;
		
		//cyclic concept, make front point to index 0
		if(front == data.length)
			front = 0;

		size--;
		//check size becomes 0
		if(size == 0) {
			//last element dequeued
			front = -1;
			rear = -1;
		}
		
		return frontData;
	}
	
	/**
	 * method provides element at front of Queue
	 * @return
	 */
	public int front() {
		if(size == 0)
			return Integer.MIN_VALUE;
		//element at front index end is returned
		return data[front];
	}
	
	public String toString() {
		String details = "Queue[";
		for(int i =0; i<size; i++) {
			details += data[i];
			if( i != size -1)
				details += ", ";
		}
		details += "]";
		
		return details;
	}
}
