import junit.framework.TestCase;

public class LeapYearTest extends TestCase {
	//Test: 001
	//Objective: Test to see if the year 2000 is a leap year
	//Input: 2000
	//Output: True
	
	public void test001()
	{
		try
		{
			LeapYear test = new LeapYear();
			assertEquals(true, test.Leap(2000));
		}
		catch(Exception e)
		{
			fail("Error in code");
		}
	}
	
	//Test: 002
	//Objective: Test to see if the year 1900 is a leap year
	//Input: 1900
	//Output: False
	
	public void test002()
	{
		try
		{
			LeapYear test = new LeapYear();
			assertEquals(false, test.Leap(1900));
		}
		catch(Exception e)
		{
			fail("Error in code");
		}
	}
}
