import static org.junit.Assert.*;

import org.junit.Test;

public class CharacterAtIndexTest {

	@Test
	public void test() {
		CharacterAtIndex ca=new CharacterAtIndex();
		String str="Hello,World";
		int n=6;
		ca.isCharacter(str,n);
	}

}
