import contact.sortingBad;
import static org.junit.Assert.*;

import org.junit.Test;


public class sortingTest {

	@Test
	public void test1() {
		//fail("Not yet implemented");
		
		int[] num = {89,73, 67};                // setup input array
		int[] expected = {67, 73, 89};          // the expected output array after sorted
		sortingBad.selectionSortInt(num);       // sends array num to method to be sorted
		assertArrayEquals(expected,num);        // compares new sorted array num with expected array.
		
	}
	

}
