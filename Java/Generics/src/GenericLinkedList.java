/*
 * Use a generic linked list that can store strings, decimals or integers as Name, GPA and course_number respectively for students. Use this generic linked list to print details of students entered. 
 */
import java.util.Scanner;

 class Node<X>{
	Node<X> next;
	X d;
}
 
public class  GenericLinkedList <T> {

	Node <T> traverse=null;
	Node <T> temp=null;
	Node <T> start=null;
	
	void add(T data){
		if(traverse==null){
			traverse=new Node<T>();
			traverse.d=data;
			start=traverse;
		}
		else{
			
		temp=new Node<T>();
		temp.d=data;
		traverse.next=temp;
		traverse=temp;
		}
	}
		
		
	Node display(){
		temp=start;
		while(temp!=null)
		{
			System.out.print("->"+temp.d);
			temp=temp.next;
		}
		System.out.println();
		return start;
	}
	
	public static void main(String args[]){
		int n;
		GenericLinkedList<String> gll=null;
		GenericLinkedList<Integer> gll2=null;
		GenericLinkedList<Double> gll3=null;
		Scanner in= new Scanner(System.in);

		System.out.println("Enter the total number of students :");
		int num=in.nextInt();
		
		do{
		System.out.println("Enter \n1.To create linked list of Names\n2.To create linked list of Course Numbers\n3.To create linked list of GPAs\n4.Display Entries\n5.Exit");
		
			
		n=in.nextInt();
		
		in.nextLine();
		if(n!=4)
		System.out.println("Start Entering your elements");
		switch(n){
		case 1:
			gll=new GenericLinkedList<String>();
			for(int i=0;i<num;i++){
				gll.add(in.nextLine());
				
			}
		
			break;
			
		case 2:
		gll2=new GenericLinkedList<Integer>();
		for(int i=0;i<num;i++){
			gll2.add(in.nextInt());
			
		}
		break;
		case 3:
			
			gll3=new GenericLinkedList<Double>();
			
			for(int i=0;i<num;i++){
				gll3.add(in.nextDouble());
				
			}
			break;
			
		case 4:
			try{
			gll.display();
			gll2.display();
			gll3.display();
			}
			catch(Exception e){
				if(e.toString()=="java.lang.NullPointerException")
				System.out.println("We have encountered an exception in your inputs as : One or more of your inputs are empty");
				else
					System.out.println(e.toString());
			}
			
		
		}
		
		}
		while(n!=5);
	}
	}

	
