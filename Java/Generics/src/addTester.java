import static org.junit.Assert.*;

import org.junit.Test;


public class addTester {

	@Test
	public void test() {
	GenericLinkedList<String> gll=new GenericLinkedList<String>();
	GenericLinkedList<Integer> gll2=new GenericLinkedList<Integer>();
	GenericLinkedList<Double> gll3=new GenericLinkedList<Double>();
	
	gll.add("Vivek");
	gll.add("Jason");
	gll.add("Agarwal");
	
	gll2.add(271);
	gll2.add(244);
	gll2.add(254);
	
	gll3.add(3.45);
	gll3.add(2.14);
	gll3.add(3.64);
	
	Node current=gll.display();
	
	assertEquals("Vivek",current.d);
	current=current.next;
	assertEquals("Jason",current.d);
	current=current.next;
	assertEquals("Agarwal",current.d);
	
	
	Node current2=gll2.display();
	assertEquals(271,current2.d);
	current2=current2.next;
	assertEquals(244,current2.d);
	current2=current2.next;
	assertEquals(254,current2.d);
	
	Node current3=gll3.display();
	assertEquals(3.45,current3.d);
	current3=current3.next;
	assertEquals(2.14,current3.d);
	current3=current3.next;
	assertEquals(3.64,current3.d);
	
	}

}
