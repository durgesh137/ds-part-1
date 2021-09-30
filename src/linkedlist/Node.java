package linkedlist;

public class Node<T> {
	//required instance attributes
	public T data;//data field
	public Node<T> next;//next node reference field
	
	public Node(T data){
		this.data = data;
		this.next = null;
	}
}
