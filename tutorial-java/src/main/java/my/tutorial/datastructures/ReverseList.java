package my.tutorial.datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * This is a simple algorithm and time complexity is O(n/2) or O(n) because it needs to iterate over 
 * almost half the elements and perform n/2 swapping as well. The space complexity of the algorithm 
 * is O(1) because no matter how big the array is, it requires same space. Obviously, all in place 
 * algorithms has constant space complexity.
 *
 * Read more: http://www.java67.com/2016/01/java-program-to-reverse-array-in-place.html#ixzz5VI0lcWOa
 *
 * http://www.java67.com/2016/01/java-program-to-reverse-array-in-place.html
 * https://javarevisited.blogspot.com/2015/03/how-to-reverse-array-in-place-in-java.html
 * @author lcn
 *
 */
public class ReverseList {

	public static List<String> reverseWithColletion(List<String> list){
		Collections.reverse(list);
		return list;
	}
	
	public static List<String> reverseWithRecursion(List<String> list){
		
		if(list.size() <=1) {
			return list;
		}
		
		List<String> reversedList = new ArrayList<>();
		reversedList.add(list.get(list.size()-1));
		reversedList.addAll(reverseWithRecursion(list.subList(0, list.size()-1)));
		return reversedList;
	}
	
	public static void reverse(String [] array) {
		if(array == null || array.length < 2) {
			return ;
		}
		
		for(int i = 0; i< array.length-1; i++) {
			String temp = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = temp;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
