import static org.junit.Assert.*;

import org.junit.Test;


public class testcase2 {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		GenericLinkedList<String> gll=new GenericLinkedList<String>();
		GenericLinkedList<Integer> gll2=new GenericLinkedList<Integer>();
		GenericLinkedList<Double> gll3=new GenericLinkedList<Double>();
		
		gll.add("Joel");
		gll.add("Alexis");
		gll.add("Ozil");
		
		gll2.add(321);
		gll2.add(233);
		gll2.add(283);
		
		gll3.add(3.25);
		gll3.add(2.54);
		gll3.add(3.12);
		
		Node current=gll.display();
		
		assertEquals("Joel",current.d);
		current=current.next;
		assertEquals("Alexis",current.d);
		current=current.next;
		assertEquals("Ozil",current.d);
		
		
		Node current2=gll2.display();
		assertEquals(321,current2.d);
		current2=current2.next;
		assertEquals(233,current2.d);
		current2=current2.next;
		assertEquals(283,current2.d);
		
		Node current3=gll3.display();
		assertEquals(3.25,current3.d);
		current3=current3.next;
		assertEquals(2.54,current3.d);
		current3=current3.next;
		assertEquals(3.12,current3.d);
	
	}

}
