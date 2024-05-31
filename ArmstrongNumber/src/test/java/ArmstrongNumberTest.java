import static org.junit.Assert.*;

import org.junit.Test;

public class ArmstrongNumberTest {

	@Test
	public void test() {
		assertEquals("Armstrong Number",ArmstrongNumber.isArmstrongNumber(153));
		assertEquals("Armstrong Number",ArmstrongNumber.isArmstrongNumber(370));
		assertEquals("Armstrong Number",ArmstrongNumber.isArmstrongNumber(371));
	}

}
