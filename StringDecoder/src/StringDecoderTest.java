import junit.framework.TestCase;

public class StringDecoderTest extends TestCase {
	// Test: 001
	// Objective: Test if the program takes in numbers
	// Input(s): 1
	// Output(s): The user entered a number
	
	public void testStringDecoder001(){
		StringDecoder testObj = new StringDecoder();
		assertEquals(false, testObj.validateInput("1"));
	}

	// Test: 002 
	// Objective: Test if the getVowels method works, valid input
	// Input(s): Apple
	// Output(s): 2
	public void testStringDecoder002(){
		StringDecoder testObj = new StringDecoder();
		assertEquals(2, testObj.getVowels("apple"));
	}
	
	// Test: 003 
		// Objective: Test if the getVowels method works, invalid input
		// Input(s): Apple
		// Output(s): 2
		public void testStringDecoder003(){
			StringDecoder testObj = new StringDecoder();
			assertEquals(0, testObj.getVowels("l"));
		}
}
