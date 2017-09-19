import junit.framework.TestCase;


public class StringDecoderTest extends TestCase {
	// Test: 001
	// Objective: Test if the method that the method takes strings
	// Input(s): Apple
	// Output(s): The user entered a number
	public void test001(){
	
	}
	
	//Test: 002
	//Objective: Test if the method gets the length of the string
	//Input(s): Apple
	//Output(s): 5
	public void testMyStringLength(){
		StringDecoder testObj = new StringDecoder();
		assertEquals(5, testObj.getLength("Apple"));
	}

}
