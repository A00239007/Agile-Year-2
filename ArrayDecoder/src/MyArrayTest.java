import junit.framework.TestCase;

public class MyArrayTest extends TestCase {
	//Test: 001
	//Objective: Testing if the createArray method works
	//Input(s): apple
	//Output(s): apple
	
	public void testmyArray001(){
		MyArray testObj = new MyArray();
		assertEquals("apple".toCharArray(), testObj.createArray("apple"));
	}
}
