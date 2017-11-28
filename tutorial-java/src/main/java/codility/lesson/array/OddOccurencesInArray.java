package codility.lesson.array;

import java.util.Arrays;

public class OddOccurencesInArray {
	
	public static int solution(int [] A) {
		
	    //Arrays.sort(A);
	    
	    System.out.println("A: "+ Arrays.toString(A));
	    int elem = 0;
	    for (int i = 0; i < A.length; i++) {
	    	elem ^= A[i];
		}
	    
		return elem;
	}

	public static void swapSolution(int a, int b) {
		a = a ^b;
		b = b ^a;
		a = a ^ b;
		System.out.printf("Swapped a: %d & b: %d", a, b);
	}
	
	
	public static void main(String[] args) {
		
		//Test 1
		int [] A = new int[7];
		A[0] = 9; A[1] =7; A[2]=9;
		A[3] = 3; A[4] = 9; A[5]=7;
		A[6] = 9;
		
//		System.out.printf("Odd occurence: %d\n",solution(A));
//		int a = 3;
//		int b = 4;
//		System.out.printf("swap a: %d & b: %d solution using xor: \n",a, b);
//		swapSolution(a,b);
	}

}
