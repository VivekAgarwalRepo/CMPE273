import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class testcase3Test {

	@Test
	public void test() {
//		fail("Not yet implemented");
		
				ArraySort as=new ArraySort(5);
				
				int jumb[]={5,1,7,4,8};
				
				for(int i=0;i<5;i++){
					as.arr[i]=jumb[i];
				}
				
				as.sort();
				int res[]={1,4,5,7,8};
				
				Assert.assertArrayEquals(res,as.arr);
			}
	}

