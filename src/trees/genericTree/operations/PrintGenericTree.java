package trees.genericTree.operations;

import trees.genericTree.GenericTreeNode;

public class PrintGenericTree {

/**
 * Method prints complete GenericTree recursively
 * @param root
 */
public static void printTree(GenericTreeNode<Integer> root) {
	//check if its empty tree
	if(root == null)
		return;
	
	//print root data
	System.out.println(root.data);
	
	//traversing all children of current root
	for(GenericTreeNode<Integer> childNode : root.children) {
		//making recursive call to print child node details
		printTree(childNode);
	}
	
}
}
