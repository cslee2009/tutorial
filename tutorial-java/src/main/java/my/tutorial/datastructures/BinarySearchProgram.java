package my.tutorial.datastructures;

/**
 * Read more: https://javarevisited.blogspot.com/2017/04/recursive-binary-search-algorithm-in-java-example.html#ixzz5VIaOtrpY
 */
import java.util.Arrays;
import java.util.Scanner;

/**
 * * Java program to implement Binary Search using recursion. In order to write
 * * recursive binary search algorithm, you probably need two methods, one
 * public * API which accept array and number to be searched, and one private
 * method to * implement binary search algorithm using recursion. * * @author
 * Javin
 */
public class BinarySearchProgram {
	public static void main(String args[]) {
		int[] sortedArray = new int[] { 21, 41, 31, 12, 623, 543, 731, 1898 };
		Arrays.sort(sortedArray);
		System.out.printf("Searching %d using binary search algorithm in %s %n", 31, Arrays.toString(sortedArray));
		binarySearch(sortedArray, 31);
		System.out.printf("Finding %d in %s by using recursive binary search algorithm %n", 37,
				Arrays.toString(sortedArray));
		binarySearch(sortedArray, 37);
		System.out.printf("looking %d in array %s by binary search using recursion %n", 623,
				Arrays.toString(sortedArray));
		binarySearch(sortedArray, 623);
		System.out.printf("Binary Search %d in sorted array %s %n", 1898, Arrays.toString(sortedArray));
		binarySearch(sortedArray, 1898);
	}

	/** 
	 * Binary Search in Java using recursion, Calls a helper method to 
	 * implement binary search algorithm recursively. 
	 * @param input 
	 * @param number 
	 * @return location of element in array 
	 * */ 
	public static void binarySearch(int[] input, int number) { 
		int index = binarySearch(input, number, 0, input.length - 1); 
		if (index != -1) { 
			System.out.printf("Number %d found at index %d %n", number, index); } 
		else { 
			System.out.printf("Sorry, number %d not found in array %n", number, index); 
		} 
	}

    /** 
     * helper method to implement binary search algorithm recursively. Require 
     *  extra low and high parameters to narrow search space. 
     *  @param array - array which contains numbers 
     *  @param search - number to be searched 
     *  @param low 
     *  @param high 
     *  @return index of search item, or -1 if item is not found in array 
     **/ 
	private static int binarySearch(int[] array, int search, int low, int high) { 
		// base case 
		if (low > high) { return -1; }
		int mid = (low + high) / 2; 
		// core logic is same as iterative algorithm 
		if (array[mid] == search) { return mid; }
        else if (array[mid] < search) { 
        	return binarySearch(array, search, mid + 1, high); } 
        else { 
        	// last possibility: a[mid] > x 
        	return binarySearch(array, search, low, mid - 1); 
          } 
	} 
}
