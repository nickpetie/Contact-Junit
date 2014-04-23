import contact.sortingBad;
import static org.junit.Assert.*;

import org.junit.Test;


public class sortingTest {

	@Test
	public void test1() {
		//fail("Not yet implemented");
		
		int[] num = {89,73, 67};
		int[] expected = {67, 73, 89};
		sortingBad.selectionSortInt(num);
		assertArrayEquals(expected,num);
		
	}
	

}
