import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class testcase1 {
	@Test
	public void test() {
		//fail("Not yet implemented");
		ArraySort as=new ArraySort(5);
		
		int jumb[]={3,1,6,9,8};
		
		for(int i=0;i<5;i++){
			as.arr[i]=jumb[i];
		}
		
		as.sort();
		int res[]={1,3,6,8,9};
		
		Assert.assertArrayEquals(res,as.arr);
		
	}

}