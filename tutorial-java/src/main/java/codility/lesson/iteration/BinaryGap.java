package codility.lesson.iteration;

import java.util.stream.Stream;

/**
 *  A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
 *	
 *	For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps.
 *
 *	Write a function:
 *	
 *	int solution(int N);
 *	that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
 *	
 *	For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5.
 *	
 *	Assume that:
 *	
 *	N is an integer within the range [1..2,147,483,647].
 *	Complexity:
 *	
 *	expected worst-case time complexity is O(log(N));
 *	expected worst-case space complexity is O(1).
 * 
 */
public class BinaryGap {

	//It all boils down to count the number of 0's between
	//any set of 1's and keep track of those 0's by using 
	//Integer data type variable that is incremented every time
	//a 0 is encountered. 
	//This same variable is reset to 0 every time a 1 is encountered
	//but before it's reset, you would compare it to yet another
	//predefined Integer variable which would hold the longest run 
	//of 0's encountered 
	public static int solution1(int N) {
		
		String binaryString = Integer.toBinaryString(N);
		
		int largest =0;
		int count =0;
		for(int i=0; i<binaryString.length();i++) {
			if(binaryString.charAt(i)=='1') {
				if(count >  largest) { 
					largest = count; //check stored value is lower than couting value, else replace
				}
				count=0; //everytime encouter '1', reset to zero
				
			}else {
				count++;
			}
		}
		
		return largest;
	}
	
	//Java 8 Stream
	public static int solution2(int N) {
		System.out.printf("Binary String %d using java 8: %s\n",N, Integer.toBinaryString(N));
		return Stream.of(
					//integer to binary String
				    Integer.toBinaryString(N)
				    	   // trim 0(s) at the end
				           .replaceAll("0+$", "")
				           // split string with 1(s)
				           .split("1+"))
					 .peek(s -> System.out.printf("str1: %s\n",s))
				     //lambda expression: use filter to keep not null elements
				     .filter(a -> a!=null)
				     //.peek(s -> System.out.printf("after filtered str2: %s\n",s))
                     //method reference: Convert String to Integer by using the 
				     //length of String
				     .map(String::length)
				     //method reference: find the largest number in the stream by
				     //using integer comparator
				     .max(Integer::compare)
				     //return 0 if nothing matches after the process
				     .orElse(0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Largest gap for 9 is :" + solution1(9));
		System.out.println("Largest gap for 529 is :" + solution1(529));
		System.out.println("Largest gap for 20 is :" + solution1(20));
		System.out.println("Largest gap for 15 is :" + solution1(15));
		System.out.println("Largest gap for 1041 is :" + solution1(1041));
		
		int number = 16;
		System.out.printf("Largest gap for %d is: %d\n", number, solution1(number));
		
	}

}
