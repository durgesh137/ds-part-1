package trees;
/**
 * Node represents a BinaryTree
 * Operations are:
 * insert element in tree
 * @author Durgesh
 *
 * @param <T>
 */
public class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode left;
	BinaryTreeNode right;

	// constructor to initialize the fields
	BinaryTreeNode(T data){
		this.data = data;
		//set left and right nodes to null
		this.left = null;
		this.right = null;
	}
}

