import static org.junit.Assert.*;

import org.junit.Test;


public class testcase2 {

	@Test
	public void test() {
		//fail("Not yet implemented");
	
		ConditionalAdmit admit=new ConditionalAdmit();
		
		admit.CMPE103();
		admit.CMPE106();
		
		
		assertFalse(admit.checkEligibility());
		
	
	}

}
