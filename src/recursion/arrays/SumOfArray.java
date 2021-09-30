package recursion.arrays;

public class SumOfArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		System.out.println("Sum: "+sum(arr));

	}
	
	public static int sum(int a[]){
		if(a == null || a.length == 0)
			return -1;
		//array contains atleast 1 element
		//find sum of int[]
		int result = sum(a,0);
		return result;
	}

	/**
	 * method returns the sum of elements of int[]
	 * @param a
	 * @param i
	 * @return
	 */
	private static int sum(int[] a, int i) {
		if(i == a.length)
			return 0;
		//adding ith element with i+1th element
		int value = a[i] + sum(a, i+1);
		return value;
	}
}
