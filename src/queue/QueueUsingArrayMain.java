package queue;

public class QueueUsingArrayMain {

	public static void main(String[] args) {
		//instantiating Queue of size 10
		QueueUsingArray queue = new QueueUsingArray(3);
		
		//inserting elements in queue
		for(int i = 10; i< 1400; i+=400) {
			queue.enqueue(i);
		}
		
		System.out.println(queue);
		System.out.println("\nFront element: "+queue.front());
		
		System.out.println("element dequeued: "+queue.dequeue());
	
		queue.enqueue(123);
		System.out.println("\n"+queue);
		System.out.println("front element: "+queue.front());
		System.out.println("element dequeued: "+queue.dequeue());

		queue.enqueue(1000);
		System.out.println("\n"+queue);
		System.out.println("front element: "+queue.front());
		System.out.println("element dequeued: "+queue.dequeue());
		
		System.out.println("\nDequeuing all elements...");
		//loop works till queue contains elements
		while(!queue.isEmpty()) {
			System.out.println(queue.dequeue());
		}
	}

}
