import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class testcase2 {

	@Test
	public void test() {
	//	fail("Not yet implemented");
	
		ArraySort as=new ArraySort(5);
		
		int jumb[]={8,6,4,2,1};
		
		for(int i=0;i<5;i++){
			as.arr[i]=jumb[i];
		}
		
		as.sort();
		int res[]={1,2,4,6,8};
		
		Assert.assertArrayEquals(res,as.arr);
	}

}
