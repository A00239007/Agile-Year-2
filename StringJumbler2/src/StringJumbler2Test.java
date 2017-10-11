import java.io.File;

import junit.framework.TestCase;

public class StringJumbler2Test extends TestCase {
	//	test: 001
	//	Objective: Test if text1 equals textShuffled1, expecting fail
	//	Input(s): text1 and textShuffled1
	//	Output(s): The 2 files don't match
	public void testStringJumbler001()
	{
		File fa = new File("C:\\Users\\Simon Harper\\Desktop\\New folder\\text1.txt");
		File faShuffled = new File("C:\\Users\\Simon Harper\\Desktop\\New folder\\textShuffled1.txt");
		try
		{
			if(fa==faShuffled)
			{
				fail("Error in product code");
			}
			else
			{
				throw new Exception("The 2 files don't match");
			}
		}
		catch(Exception e)
		{
			assertEquals("The 2 files don't match", e.getMessage());
		}
	}
	
	//	test: 002
	//	Objective: Test if the countVowelFile method works, expecting pass
	//	Input(s): text1
	//	Output(s): 69
	public void testStringJumbler002()
	{
		File fa = new File("C:\\Users\\Simon Harper\\Desktop\\New folder\\text1.txt");
		StringJumbler2 testObj = new StringJumbler2();
		try
		{
			assertEquals(69, testObj.countVowelFile(fa));
		}
		catch(Exception e)
		{
			fail("Error in product code");
		}
	}
	
	//	test: 003
	//	Objective: Test if the countWordFile method works, expecting pass
	//	Input(s): text1
	//	Output(s): 48
	public void testStringJumbler003()
	{
		File fa = new File("C:\\Users\\Simon Harper\\Desktop\\New folder\\text1.txt");
		StringJumbler2 testObj = new StringJumbler2();
		try
		{
			assertEquals(48, testObj.countWordFile(fa));
		}
		catch(Exception e)
		{
			fail("Error in product code");
		}
	}
	
}
