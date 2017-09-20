import junit.framework.TestCase;

public class BoxTest extends TestCase {
	// test: 001
	// test objective: Testing the method getArea when the box is empty
	// Input(s): 1, 1, 1
	// Output(s): 1
	public void testBox001() {
		Box testObj = new Box();
		assertEquals(1, testObj.getArea());
	}

	// test: 002
	// test objective: Testing the method getArea when the box is full 
	// Input(s): 5, 5, 5, true
	// Output(s):
	public void testBox002() {
		Box testObj = new Box(5, 5, 5, true);
		assertEquals(125, testObj.getArea());
	}
}
