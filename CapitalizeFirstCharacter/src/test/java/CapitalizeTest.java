import static org.junit.Assert.*;

import org.junit.Test;

public class CapitalizeTest {

	@Test
	public void test() {
		CapitalizeFirstCharacter  cf=new CapitalizeFirstCharacter();
		String str="java programming is fun";
		cf.isCapitalize(str);
	}

}
