import junit.framework.TestCase;

public class SorterTest extends TestCase {
	//Test: 001
	//Objective: Test the code with a numerical value
	//Input(s): 2, 1, 3
	//Output(s): 1, 2, 3
	
	public void test001()
	{
		try
		{
			Sorter test= new Sorter();
			assertEquals("1, 2, 3",test.NumSorter(2, 1, 3));
		}
		catch(Exception e)
		{
			fail("Error in the code");
		}
	}
	
	//Test: 002
	//Objective: Test the code with a String value
	//Input(s): a, b, c
	//Output(s): Error
	
	public void test002()
	{
		try
		{
			Sorter test= new Sorter();
			assertEquals("1, 2, 3",test.NumSorter(2, 1, 3));
			fail("Error in code");
		}
		catch(Exception e)
		{
			assertEquals("An invalid value was inputted", e.getMessage());
		}
	}
}
