import java.io.FileNotFoundException;

import junit.framework.TestCase;


public class StringJumblerTest extends TestCase {
	//Test: 001
	//Obj: Test num of words
	//Input(s): text.txt
	//Output(s): 241
	public void testStringJumbler()
	{
		try
		{
			StringJumbler testObj = new StringJumbler();
			assertEquals(241,testObj.count());
		}
		catch(Exception e)
		{
			fail("Error in the product code");
		}
	}
	
	//Test: 002
	//Obj: Test num of vowels
	//Inputs: text.txt
	//Ouput(s): 339
	
	public void testStringJumbler002()
	{
		try
		{
			StringJumbler testObj = new StringJumbler();
			assertEquals(339,testObj.vowels());
		}
		catch(Exception e)
		{
			fail("Error in product code");
		}
	}
	
	//Test: 003
	//Obj: Test avgVowels
	//Input(s): text.txt
	//Output(s): 1
	
	public void testStringJumbler003()
	{
		try
		{
			StringJumbler testObj = new StringJumbler();
			assertEquals(1.0,testObj.avgVowels());
		}
		catch(Exception e)
		{
			fail("Error in product code");
		}
	}
	
	//Test: 004
	//Obj: Test StringJumbler
	//Input(s): text.txt
	//Output(s): Jumbled text
	
	public void testStringJumbler004()
	{
		try
		{
			StringJumbler testObj = new StringJumbler();
			assertEquals("word",testObj.jumbleString("word"));
			fail("No exception was thrown");
		}
		catch(Exception e)
		{
			assertEquals("No match",e.getMessage());
		}
	}
}
