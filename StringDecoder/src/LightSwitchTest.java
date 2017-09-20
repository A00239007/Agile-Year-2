import junit.framework.TestCase;

public class LightSwitchTest extends TestCase {
	// Test: 001
	// Objective: Test to see if the light is on
	// Input(s): Using a method
	// Output(s): on
	public void testLightSwitch001() {
		LightSwitch testMethod = new LightSwitch();
		testMethod.switchOn();
		assertEquals(true, testMethod.status());
	}

	// Test: 002
	// Objective: Test to see if the light is off
	// Input(s): Using a method
	// Output(s): on
	public void testLightSwitch002() {
		LightSwitch testMethod = new LightSwitch();
		testMethod.switchOff();
		assertEquals(false, testMethod.status());
	}
}
