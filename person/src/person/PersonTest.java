package person;



import junit.framework.TestCase;

public class PersonTest extends TestCase {
	// Test: 001
	// Objective: Testing the get First Name method
	// Input(s): null
	// Output(s): null
	
	public void testPerson001()
	{
		Person testObj = new Person();
		
		try
		{
			assertEquals(null,testObj.getFirstName());
		}
		catch(Exception e)
		{
			fail("Error in code");
		}
	}

	// Test: 002
	// Objective: Testing the Last Name method
	// Input(s): null
	// Output(s): null
	public void testPerson002()
	{
		Person testObj = new Person();
		
		try
		{
			assertEquals(null,testObj.getLastName());
		}
		catch(Exception e)
		{
			fail("Error in code");
		}
	}

	// Test: 003
	// Objective: Testing the Phone Number method
	// Input(s): 1999999999
	// Output(s):1999999999 
	public void testPerson003()
	{
		Person testObj = new Person();
		
		try
		{
			assertEquals(1999999999,testObj.getPhone());
		}
		catch(Exception e)
		{
			fail("Error in code");
		}
	}

	// Test: 004
	// Objective: Testing the Year method
	// Input(s): 1998
	// Output(s): 1998
	public void testPerson004()
	{
		Person testObj = new Person();
		
		try
		{
			assertEquals(1998,testObj.getYear());
		}
		catch(Exception e)
		{
			fail("Error in code");
		}
	}

	// Test: 005
	// Objective: Testing the Month method
	// Input(s): 7
	// Output(s): 7
	public void testPerson005()
	{
		Person testObj = new Person();
		
		try
		{
			assertEquals(7,testObj.getMonth());
		}
		catch(Exception e)
		{
			fail("Error in code");
		}
	}

	// Test: 006
	// Objective: Testing the day method
	// Input(s): 16
	// Output(s): 16
	public void testPerson006()
	{
		Person testObj = new Person();
		
		try
		{
			assertEquals(16,testObj.getDays());
		}
		catch(Exception e)
		{
			fail("Error in code");
		}
	}
	// Test: 007
	// Objective: 
	// Input(s): Testing the Gender method
	// Output(s): null
	public void testPerson007()
	{
		Person testObj = new Person();
		
		try
		{
			assertEquals(null,testObj.getGender());
		}
		catch(Exception e)
		{
			fail("Error in code");
		}
	}
	// Test: 008
	// Objective: Testing the Staff Number method
	// Input(s): 0
	// Output(s): 0
	public void testPerson008()
	{
		Lecturer testObj = new Lecturer();
		
		try
		{
			assertEquals(0,testObj.getStaffNumber());
		}
		catch(Exception e)
		{
			fail("Error in code");
		}
	}
	
	//Test: 009
	//Objective: Testing the Student Number method
	//Input(s): 0
	//Output(s): 0
	public void testPerson009()
	{
		Student testObj = new Student();
		try
		{
			assertEquals(0,testObj.StudentNumber());
		}
		catch(Exception e)
		{
			fail("Error in code");
		}
	}
	
}
