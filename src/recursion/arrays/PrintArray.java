package recursion.arrays;

public class PrintArray {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		printArray(a);
	}
	
	/**
	 * method show array contents recursively
	 * @param arr
	 */
	public static void printArray(int arr[]) {
		//check if array is null or contains  elements 
		if(arr == null || arr.length == 0)
			return;
		//array contains atleast 1 element
		System.out.print("Array[] elements are: [");
		printArray(arr, 0);
		System.out.println("]");
		
	}

	private static void printArray(int[] arr, int index) {
		if(index < 0 || index == arr.length)
			return;
		System.out.print(arr[index]+" ");
		printArray(arr, index+1);
	}

}
