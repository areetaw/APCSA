import java.util.Arrays;
import java.util.Scanner;

public class Searching {
	
	//Linear Search
	public static int linearSearch(int[] arr, int target) {
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1; 
		
	}
	
	//Binary Search
	public static int binarySearch(int[] arr, int target) {
		
		Arrays.sort(arr);
		
		int low = 0;
		int high = arr.length-1;
	
		while (high > low) {
			int guess = (low + high) / 2;

			if (arr[guess] == target) {
				return guess;
			} else if (arr[guess] < target) {
				low = guess++;
			} else if (arr[guess] > target) {
				high = guess--;
			}
		}
		return -1;
	}
	
	//Recursive Binary Search
	public static int recursiveBinarySearch(int[] arr, int target) {
		return recursiveBinarySearch(arr, target, 0, arr.length-1);
	}
	
	//Recursive Binary Search
	public static int recursiveBinarySearch(int[] arr, int target, int low, int high ) {
		int guess = (low + high) / 2;

		if (high < low) {
			return -1;
		} else if (arr[guess] == target) {
			return guess;
		}  else if (arr[guess] < target) {
			low = guess++;
			return recursiveBinarySearch(arr, target, low, high);
		} else if (arr[guess] > target) {
			high = guess--;
			return recursiveBinarySearch(arr, target, low, high);
		} 
		
		return -1;
	}
	
	//Insertion Sort - Comparing unsorted list with sorted list
	public static int[] insertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int currentIndex = i;
			while (currentIndex > 0 && arr[currentIndex] < arr[currentIndex - 1]) {
				double temp = arr[currentIndex];
				arr[currentIndex] = arr[currentIndex - 1];
				arr[currentIndex - 1] = (int) temp;
				currentIndex--;
			}
		}
		return arr;
	}
	
	//Selection Sort - selecting the smallest number and switching it
	public static int[] selectionSort(int arr[]) {
		
		for(int i = 0; i < arr.length; i++) {
			int smallestIndex = i;
			for(int j = 0; j < arr.length; j++) {
				if( arr[j] > arr[smallestIndex]) {
					smallestIndex = j;
				}
				float temp = arr[i];
				arr[i] = arr[smallestIndex];
				arr[smallestIndex] = (int) temp;
			}
		}
		return arr;
	}
	
	//Merge Sort
	public static int[] mergeSort(int[] arr) {
		
		if (arr.length > 1) { //base care
			
			int[] left = new int[arr.length / 2];
			int[] right = new int[arr.length - arr.length / 2];
			
			for (int i=0; i < arr.length / 2; i++) { //fill up the left and right arrays
				left[i] = arr[i];
			}
			
			for (int j = arr.length/2; j < arr.length; j++) {
				right[j-arr.length/2] = arr[j];
			}
		
			left = mergeSort(left);
			right = mergeSort(right);
			return merge(arr, left, right);
		}
		
		return arr;
	}
	
	public static int[] merge(int[] result, int[] a, int[] b) {
		
		int ai = 0;
		int bi = 0;
		int i = 0;
		
		while (i < result.length) {        //while you haven't filled result array
			if ( ai == a.length ) {		   //if a is used up, pull from b
				result[i] = b[bi];
				bi++;
				i++;
			} else if (bi == b.length ) { 	//if b is used up, pull from a
				result[i] = a[ai];
				ai++;
				i++;
			} else if (a[ai] < b[bi]) { 	//if 1st place of a < 1st place of b
				result[i] = a[ai];
				ai++;
				i++;
			} else if (b[bi] < a[ai]) { 	//if 1st place of b < 1st place of a
				result[i] = b[bi];
				bi++;
				i++;
			} 
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int[] arr1 = {5, 2, 3, 4, 1, 9, 6, 7};
		System.out.println(linearSearch(arr1, 3));
	
		int[] arr2 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		System.out.println(binarySearch(arr2, 70));
		
		System.out.println(recursiveBinarySearch(arr2, 70));
		
		int[] arr = {30, 50, 70, 80, 40, 60, 10, 100, 90};
		System.out.println("Insertion Sort");
		System.out.println(Arrays.toString(insertionSort(arr)));
		System.out.println();
		
		int[] arry = {30, 10, 70, 80, 40, 60, 50, 100, 90};
		System.out.println("Selection Sort");
		System.out.println((Arrays.toString(selectionSort(arry))));
		System.out.println();
		
		int[] arri = {30, 10, 70, 80, 40, 60, 50, 100, 90};
		System.out.println("Merge Sort");
		System.out.println((Arrays.toString(mergeSort(arri))));

	}
}
