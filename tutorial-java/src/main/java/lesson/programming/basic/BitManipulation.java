package lesson.programming.basic;

import java.util.Arrays;
import java.util.BitSet;

public class BitManipulation {

	/*
	 * Get it from
	 * https://stackoverflow.com/questions/4895173/bitwise-multiply-and-add-in-java 
	 */
	public static void bitwiseMultiply(int n1, int n2) {
	    /* This value will hold n1 * 2^i for varying values of i.  It will
	     * start off holding n1 * 2^0 = n1, and after each iteration will 
	     * be updated to hold the next term in the sequence.
	     */
	    int a = n1;

	    /* This value will be used to read the individual bits out of n2.
	     * We'll use the shifting trick to read the bits and will maintain
	     * the invariant that after i iterations, b is equal to n2 >> i.
	     */
	    int b = n2;

	    /* This value will hold the sum of the terms so far. */
	    int result = 0;

	    /* Continuously loop over more and more bits of n2 until we've
	     * consumed the last of them.  Since after i iterations of the
	     * loop b = n2 >> i, this only reaches zero once we've used up
	     * all the bits of the original value of n2.
	     */
	    while (b != 0)
	    {
	        /* Using the bitwise AND trick, determine whether the ith 
	         * bit of b is a zero or one.  If it's a zero, then the
	         * current term in our sum is zero and we don't do anything.
	         * Otherwise, then we should add n1 * 2^i.
	         */
	        if ((b & 1) != 0)
	        {
	            /* Recall that a = n1 * 2^i at this point, so we're adding
	             * in the next term in the sum.
	             */
	        	//System.out.printf("result: %d\ta: %d\t", result, a);
	            result = result + a;
	        }

	        /* To maintain that a = n1 * 2^i after i iterations, scale it
	         * by a factor of two by left shifting one position.
	         */
	        a <<= 1;
	        //System.out.printf("After bit a is shifted: %d\t", a);
	        /* To maintain that b = n2 >> i after i iterations, shift it
	         * one spot over.
	         */
	        b >>>= 1;
	        //System.out.printf("b is %d\n", b);
	    }

	    System.out.println(result);
	}
	
	/*
	 * 
	 */
	public static void bitwiseAdd(int x, int y) {
		int result = 2*(x&y)+(x^y);
		System.out.printf("Bitwise add result: %d\n", result);
	}
	
	
	/*
	 * 
	 * https://stackoverflow.com/questions/20026243/find-2-missing-numbers-in-an-array-of-integers-with-two-missing-values
	 */
	public static void findTwoMissingNumbers(int [] A, int B) {
		int x=0;
		/*
		 * XOR All the elements of the array A to x
		 */
		for(int i=0; i<A.length; i++) {
			x^=A[i];
		}
		
		/*
		 * XOR all the elements of array  to x
		 */
		for(int i=1; i<=B; i++) {
			x^=i;
		}
		System.out.printf("X value before find left most significant: %d\n",x);
		/*
		 * Find the left most bit set of x by x= x & (~(x-1));
		 */
		x = x&(~(x-1));
		System.out.printf("X value after find left most significant: %d\n", x);
		int p=0, q=0;
		
		/**
		 * XOR All the elements of the array A to X
		 */
		for(int i=0; i<A.length;i++) {
			if( (A[i] & x) == x) {
				p = p^A[i];
				System.out.printf("First for loop-> p value: %d\t", p);
			}else {
				q=q^A[i];
				System.out.printf("First for loop-> q value: %d\t", q);
			}
			System.out.println("");
		}
		System.out.printf("After first group --> P : %d\t Q: %d\n", p, q);
		for(int i=1;i<=B;i++){
	        if((i & x) == x){
	            p=p^i;
	            System.out.printf("Second for loop-> p value: %d\t", p);
	        }
	        else{
	            q=q^i;
	            System.out.printf("Second for loop-> q value: %d\t",q);
	        }
	        System.out.println("");
	    }
		System.out.println("p: "+p+" q : "+q);
	}
	
	/**
	 * Source from:
	 * http://javarevisited.blogspot.my/2014/11/how-to-find-missing-number-on-integer-array-java.html
	 * 
	 * A general method to find missing values from an integer array in Java.
	 * This method will work even if array has more than one missing element
	 * @param numbers
	 * @param count
	 */
	public static void findMissingNumber(int [] numbers, int count) {
		int missingCount = count - numbers.length;
		BitSet bitSet = new BitSet(count);
		
		for(int number: numbers) {
			bitSet.set(number-1);
		}
		
		System.out.printf("Missing number in integer array %s, with total number %d\n", Arrays.toString(numbers), count);
		int lastMissingIndex =0;
		for(int i=0; i< missingCount; i++) {
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
			System.out.println(++lastMissingIndex);
		}
	}
	public static void main(String[] args) {
		//Bitwise multiplication
		int n=12, a=12;
		for(int i=0; i<=n; i++ ) {
			bitwiseMultiply(a, i);
		}
		//bitwiseMultiply(3, 5);
		//bitwiseAdd(9, 8);
		
		//Find missing number
		//int[] A = {1,2,5,3};
		//findTwoMissingNumbers(A, 6);
		
		//One missing number
		System.out.printf("ONE ");
		findMissingNumber(new int[]{1, 2, 3, 4, 6}, 6);
		//Two missing number
		System.out.printf("TWO ");
		findMissingNumber(new int[]{1, 2, 3, 6, 7, 9, 8, 10}, 10);
		//Three missing number
		System.out.printf("THREE ");
		findMissingNumber(new int[]{1, 2, 3, 4, 6, 9, 8}, 10);
		//Four missing number
		System.out.printf("FOUR ");
		findMissingNumber(new int[]{1, 2, 3, 4, 9, 8}, 10);

		
		
	}

}
