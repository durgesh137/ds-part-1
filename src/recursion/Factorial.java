package recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * method provides the computed factorial value of a number
	 * 
	 * @param num
	 * @return
	 */
	public int fact(int num) {
		//base case
		if (num == 1)
			return num;
		// compute factorial of sub problem
		int subAns = fact(num - 1);
		int ans = num * subAns;
		return ans;

	}
}
