import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class testcase2 {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		DublicateValues dv=new DublicateValues();
		
		String inputs[]={"Sneha","Aditya","Prachi","Samuel","Vivek","Aditi","Nikki","Prateek","Aditya"};
		
		for(int i=0;i<inputs.length;i++){
			dv.addStudent(inputs[i]);
		}
		
		List<String> result=dv.duplicates();
		List<String> expected=new ArrayList<String>();
		
		expected.add("Aditya");
		
		assertEquals(result,expected);
	}

}
