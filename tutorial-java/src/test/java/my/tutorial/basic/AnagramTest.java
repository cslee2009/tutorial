package my.tutorial.basic;


import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

/** * JUnit test class to test various anagram program for various String input. 
 * 
 * Read more: 
 * https://javarevisited.blogspot.com/2013/03/Anagram-how-to-check-if-two-string-are-anagrams-example-tutorial.html#ixzz5UihTOhBa
 * */
public class AnagramTest {
	
	@Test 
	public void testCheckAnagram() {
		assertTrue(Anagram.checkAnagram("word", "wrdo"));
		assertTrue(Anagram.checkAnagram("mary", "army"));
		assertTrue(Anagram.checkAnagram("stop", "tops"));
		assertTrue(Anagram.checkAnagram("boat", "btoa"));
		assertFalse(Anagram.checkAnagram("pure", "in"));
		assertFalse(Anagram.checkAnagram("fill", "fil"));
		assertFalse(Anagram.checkAnagram("b", "bbb"));
		assertFalse(Anagram.checkAnagram("ccc", "ccccccc"));
		assertTrue(Anagram.checkAnagram("a", "a"));
		assertFalse(Anagram.checkAnagram("sleep", "slep"));
	} 
	
	@Test 
	public void testIsAnagram() {
		assertTrue(Anagram.isAnagram("word", "wrdo"));
		assertTrue(Anagram.isAnagram("boat", "btoa"));
		assertFalse(Anagram.isAnagram("pure", "in"));
		assertFalse(Anagram.isAnagram("fill", "fil"));
		assertTrue(Anagram.isAnagram("a", "a"));
		assertFalse(Anagram.isAnagram("b", "bbb"));
		assertFalse(Anagram.isAnagram("ccc", "ccccccc"));
		assertFalse(Anagram.isAnagram("sleep", "slep"));
	} 
	
	@Test 
	public void testCheckAnagram2() {
		assertTrue(Anagram.checkAnagram2("word", "wrdo"));
		assertFalse(Anagram.checkAnagram2("b", "bbb"));
		assertFalse(Anagram.checkAnagram2("ccc", "ccccccc"));
		assertTrue(Anagram.checkAnagram2("a", "a"));
		assertFalse(Anagram.checkAnagram2("sleep", "slep"));
		assertTrue(Anagram.checkAnagram2("boat", "btoa"));
		assertFalse(Anagram.checkAnagram2("pure", "in"));
		assertFalse(Anagram.checkAnagram2("fill", "fil"));
	}

	
}
