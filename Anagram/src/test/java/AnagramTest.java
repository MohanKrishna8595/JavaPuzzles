import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramTest {

	@Test
	public void test() 
	{
		assertEquals("Both Strings are Anagram",Anagram.isAnagram("race","care"));
		assertEquals("Both Strings are not Anagram",Anagram.isAnagram("things","wings"));
		assertEquals("Both Strings are Anagram",Anagram.isAnagram("earth","heart"));

	}

}
