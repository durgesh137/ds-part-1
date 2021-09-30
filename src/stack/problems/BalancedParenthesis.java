package stack.problems;

import java.util.Stack;

/**
 * For a given a string expression containing only round brackets or
 * parentheses, check if they are balanced or not. Brackets are said to be
 * balanced if the bracket which opens last, closes first.
 * 
 * @author Durgesh
 *
 */
public class BalancedParenthesis {

	public static void main(String[] args) {
		String s = "(()())";
		System.out.println("isBalanced("+s+"): "+isBalanced(s));
		
		s = "() () (()";
		System.out.println("isBalanced("+s+"): "+isBalanced(s));
		
	}

	public static boolean isBalanced(String expression) {
		boolean isBalanced = false;
		//null or empty expression
		if (expression == null || expression.length() == 0) {
			isBalanced = true;
			return isBalanced;
		}

		//Instantiating Stack
		Stack<Character> stack = new Stack<>();

		// expression contains at least 1 character
		for (int i = 0; i < expression.length(); i++) {
			char currChar = expression.charAt(i);

			// open bracket
			if (currChar == '(' || currChar == '{' || currChar == '[') {
				stack.push(currChar);
			} 
			else if((currChar == ')' || currChar == '}' || currChar == ']') && stack.isEmpty()) {
				//since close parenthesis encountered and stack is empty
				//hence not in order
				//unbalanced
				return isBalanced;
			}
			else {
				//not an open parenthesis
				char top = ' ';
				if(!stack.isEmpty())
				 top = stack.peek();
				// check if close bracket encountered
				if (currChar == ')' && top == '(' || currChar == '}' && top == '{' || currChar == ']' && top == '[') {
					//now stack can't be empty
						stack.pop();
					}
				}

		}//for...loop ends
		// stack does not contain any element
		if (stack.isEmpty())
			isBalanced = true;
		return isBalanced;
	}

}
