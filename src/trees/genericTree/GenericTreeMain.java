package trees.genericTree;

public class GenericTreeMain {
	public static void main(String[] args) {
		// creating multiple generic tree node objects
		GenericTreeNode<Integer> n1 = new GenericTreeNode<Integer>(6);
		GenericTreeNode<Integer> n2 = new GenericTreeNode<Integer>(2);
		GenericTreeNode<Integer> n3 = new GenericTreeNode<Integer>(9);
		GenericTreeNode<Integer> n4 = new GenericTreeNode<Integer>(8);
		GenericTreeNode<Integer> n5 = new GenericTreeNode<Integer>(7);
		GenericTreeNode<Integer> n6 = new GenericTreeNode<Integer>(15);
		GenericTreeNode<Integer> n7 = new GenericTreeNode<Integer>(1);

		// adding children 2,9,8,7 to n1 6
		n1.children.add(n2);
		n1.children.add(n3);
		n1.children.add(n4);
		n1.children.add(n5);

		// adding children 15,1 to n3 9
		n3.children.add(n6);
		n3.children.add(n7);

	}
}
