import junit.framework.TestCase;

public class StringDecoderTest extends TestCase {
	// Test: 001
	// Objective: Test if the program takes in numbers
	// Input(s): 1
	// Output(s): The user entered a number

	public void testStringDecoder001() {
		StringDecoder testObj = new StringDecoder();
		assertEquals(false, testObj.validateInput("1"));
	}

	// Test: 002
	// Objective: Test if the getVowels method works, valid input
	// Input(s): Apple
	// Output(s): 2
	public void testStringDecoder002() {
		StringDecoder testObj = new StringDecoder();
		assertEquals(2, testObj.getVowels("apple"));
	}

	// Test: 003
	// Objective: Test if the getVowels method works, invalid input
	// Input(s): Apple
	// Output(s): 2
	public void testStringDecoder003() {
		StringDecoder testObj = new StringDecoder();
		assertEquals(0, testObj.getVowels("l"));
	}

	// Test: 004
	// Objective: Test if the program takes in numbers, invalid input
	// Input(s): apple
	// Output(s): The user entered a number

	public void testStringDecoder004() {
		StringDecoder testObj = new StringDecoder();
		assertEquals(true, testObj.validateInput("apple"));
	}

	// Test: 005
	// Objective: Testing the getLength method for a valid input
	// Input(s): apple
	// Output(s): 5

	public void testStringDecoder005() {
		StringDecoder testObj = new StringDecoder();
		assertEquals(5, testObj.getLength("apple"));
	}

	// Test: 006
	// Objective: Testing the getLength method for an invalid input
	// Input(s): 1
	// Output(s): 1

	public void testStringDecoder006() {
		StringDecoder testObj = new StringDecoder();
		assertEquals(1, testObj.getLength("1"));
	}

}
