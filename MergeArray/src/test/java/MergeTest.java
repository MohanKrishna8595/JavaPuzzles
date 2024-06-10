import static org.junit.Assert.*;

import org.junit.Test;

public class MergeTest {

	@Test
	public void test() {
		MergeArray ma=new MergeArray();
		int arr1[]= {10,20,30,40};
		int arr2[]= {50,60,70};
		ma.isMerge(arr1,arr2);
	}

}
