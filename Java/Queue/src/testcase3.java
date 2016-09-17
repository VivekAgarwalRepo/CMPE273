import static org.junit.Assert.*;

import org.junit.Test;


public class testcase3 {

	@Test
	public void test() {
		//fail("Not yet implemented");
				Queue q=new Queue();
				q.add(5);
				q.add(2);
				q.add(6);
				q.remove();
				assertEquals(q.top(),2);
	}

}
