import static org.junit.Assert.*;

import org.junit.Test;


public class testcase4 {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		
		Queue q=new Queue();
		q.add(5);
		q.add(2);
		q.add(6);
		
		q.rotate();
		q.rotate();
		
		assertEquals(q.top(),6);
		
	}

}
