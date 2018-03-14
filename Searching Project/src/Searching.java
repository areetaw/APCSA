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

	public static void main(String[] args) {
		
		int[] arr = {5, 2, 3, 4, 1, 9, 6, 7};
		System.out.println(linearSearch(arr, 3));
	
		int[] arr1 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		System.out.println(binarySearch(arr1, 70));
		
		System.out.println(recursiveBinarySearch(arr1, 70));
	}
}