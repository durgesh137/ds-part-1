package trees.genericTree.operations;

import java.util.Scanner;

import trees.genericTree.GenericTreeNode;

public class TakeTreeInputRecursively {
	Scanner sc = new Scanner(System.in);

	/**
	 * Program reads input for GenericTree 
	 * @return
	 */
	public GenericTreeNode<Integer> takeTreeInput() {
		System.out.println("Enter the root data: ");
		int rootData = sc.nextInt();

		// check if rootData is -1, end taking input
		if (rootData == -1)
			return null;

		// create GenericTreeNode having data as rootData
		GenericTreeNode<Integer> root = new GenericTreeNode<>(rootData);

		System.out.println("Enter number of children for " + rootData);
		// reading number of children of root node from user
		int children = sc.nextInt();

		// loop works till input for all children is not read
		while (children > 0) {

			// read input for childrenNode recursively
			GenericTreeNode<Integer> childNode = takeTreeInput();

			// add the childNode as children of root node
			root.children.add(childNode);

			// decrement the children count to be read further
			children--;
		}
		return root;
	}
}
