package trees.genericTree;

import java.util.ArrayList;

public class GenericTreeNode<T> {
	//data attributes
	public T data;
	public ArrayList<GenericTreeNode<T>> children;

	//constructor
	public GenericTreeNode(T data) {
		this.data = data; // Node data
		children = new ArrayList<>();
	}


}