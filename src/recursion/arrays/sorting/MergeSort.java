package recursion.arrays.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = {1,10,5,18,3,8,6};
		System.out.println("UnSorted[]: "+Arrays.toString(arr));
		//no additional space
		int start = 0, end = arr.length-1;
		mergeSort_approach2(arr,start,end);
		System.out.println("Sorted[]: "+Arrays.toString(arr));
	}

	private static void mergeSort_approach2(int[] arr, int start, int end) {
		if(start >= end) 
			return;
		int mid = (start + end) / 2;
		mergeSort_approach2(arr, start,mid);
		mergeSort_approach2(arr, mid + 1, end);
		merge(arr, start,mid, end);
		
	}

	/**
	 * method to merge the elements of int[] after comparison
	 * @param arr
	 * @param start
	 * @param end
	 */
	private static void merge(int[] arr, int start,int mid, int end) {
//		int mid = (start + ends) / 2/;
		if(start == end)
			return;
		System.out.println("start: "+start+" mid: "+mid+" end: "+end);
		while(start < end) {
			if(arr[start] < arr[end]) {
				int temp = arr[start];
				arr[start] =  arr[end];
				arr[end] = temp;
			}
			start++;
		}
		System.out.println("start: "+start+" mid: "+mid+" end: "+end);
	}


}
