package my.tutorial.basic;

import java.util.Arrays;

public class Anagram {

public static boolean checkAnagram(String a, String b) {
		//To remove space and non-word characters
		a = a.replaceAll("[\\s\\W]*", "");
		b = b.replaceAll("[\\s\\W]*", "");
		if(a.length()!=b.length())
			return false;
		 //There is no case sensitive for anagram
		 char [] arrayA = a.toLowerCase().toCharArray();
		 char [] arrayB = b.toLowerCase().toCharArray();
		 Arrays.sort(arrayA);
		 Arrays.sort(arrayB);
		 
		 return  Arrays.equals(arrayA, arrayB);
	}
	
	//Read more: https://javarevisited.blogspot.com/2013/03/Anagram-how-to-check-if-two-string-are-anagrams-example-tutorial.html#ixzz5Uif2upu0
	/* * One way to find if two Strings are anagram in Java. 
	 * This method * assumes both arguments are not null and in lowercase. * * @return true, if both String are anagram 
	 * */ 
	public static boolean isAnagram(String word, String anagram) {
		if (word.length() != anagram.length()) {
			return false;
		}
		char[] chars = word.toCharArray();

		for (char c : chars) {
			int index = anagram.indexOf(c);
			if (index != -1) {
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
			} else {
				return false;
			}
		}
		return anagram.isEmpty();
	}
	
	public static boolean checkAnagram2(String first, String second) {
		char[] characters = first.toCharArray();
		StringBuilder sbSecond = new StringBuilder(second);
		for (char ch : characters) {
			int index = sbSecond.indexOf("" + ch);
			if (index != -1) {
				sbSecond.deleteCharAt(index);
			} else {
				return false;
			}
		}
		return sbSecond.length() == 0 ? true : false;
	}
	
	
//	public static boolean checkAnagram2(String a, String b) {
//		
//		a = a.replaceAll("[\\s\\W]*", "");
//		b = b.replaceAll("[\\s\\W]*", "");
//		
//		if(a.length()!=b.length()) {
//			return false;
//		}
//		
//		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1: "+ checkAnagram("Army", "Mary"));
		System.out.println("2: "+ checkAnagram("Army", "Maryy"));
		System.out.println("3: "+ checkAnagram("Listen", "silent"));
		System.out.println("4: "+ checkAnagram("Integral", "Triangle"));
		System.out.println("5: "+ checkAnagram("rail safety", "fairy tales"));
		System.out.println("6: "+ checkAnagram("adultery", "true lady"));
		System.out.println("7: "+ checkAnagram("adultery", "true lady!"));
		System.out.println("8: "+ checkAnagram("customers", "store scum"));

		
		System.out.println("------------------------------------------");
		System.out.println("1: "+ checkAnagram("word", "wrdo"));
		System.out.println("2: "+ checkAnagram("mary", "army"));
		System.out.println("3: "+ checkAnagram("stop", "tops"));
		System.out.println("4: "+ checkAnagram("boat", "btoa"));
		System.out.println("5: "+ checkAnagram("pure", "in"));
		System.out.println("6: "+ checkAnagram("fill", "fil"));
		System.out.println("7: "+ checkAnagram("b", "bbb"));
		System.out.println("8: "+ checkAnagram("ccc", "ccccccc"));
		System.out.println("9: "+ checkAnagram("a", "a"));
		System.out.println("10: "+ checkAnagram("sleep", "slep"));
		
//		assertTrue(AnagramCheck.isAnagram("word", "wrdo")); 
//		assertTrue(AnagramCheck.isAnagram("mary", "army")); 
//		assertTrue(AnagramCheck.isAnagram("stop", "tops")); 
//		assertTrue(AnagramCheck.isAnagram("boat", "btoa")); 
//		assertFalse(AnagramCheck.isAnagram("pure", "in")); 
//		assertFalse(AnagramCheck.isAnagram("fill", "fil")); 
//		assertFalse(AnagramCheck.isAnagram("b", "bbb")); 
//		assertFalse(AnagramCheck.isAnagram("ccc", "ccccccc")); 
//		assertTrue(AnagramCheck.isAnagram("a", "a")); 
//		assertFalse(AnagramCheck.isAnagram("sleep", "slep"));

		//Read more: https://javarevisited.blogspot.com/2013/03/Anagram-how-to-check-if-two-string-are-anagrams-example-tutorial.html#ixzz5UiaP7VjN
	}

}
