
/* San Jose State University is throwing a party with FREE ICE CREAM for the incoming grad students. However, there is only one stall available due to budget cuts. 
 * The students have to stand in a priority based line depending upon the scoops of ice creams they order. The students with smaller scoop size are given a higher priority 
 * over those with higher scoop size. Use a queue to re-organize a random order of scoop requests and output the scoop requests in non-decreasing order.(Sort using Queue)*/

import java.util.*;
import java.io.*;
class Node{
	int data;
	Node next;
}

class Queue{
	Node head=null;
	Node temp=null;
	
	
	void add(int d){
		
		if(head==null){
			temp=new Node();
			temp.data=d;
			head=temp;
		}
		
		else{
			temp.next=new Node();
			temp.next.data=d;
			temp=temp.next;
		}
	}
		
	int remove(){
		
		int val=head.data;
		head=head.next;
		
		return val;
			
		}

	boolean empty() {
		
		if(head!=null)
		return false;
		else
			return true;
	}

	public int top() {
		if(head!=null)
		return head.data;
		
		else
			return -1;
	}

	public void rotate() {
		
		add(remove());
				
	}
		
}


public class QueueImplementation {

public static void main(String args[]){
	
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number of students :");
	int t=in.nextInt();
	Queue q=new Queue();
	int max=-1;
	
	for(int i=0;i<t;i++){
		
		System.out.println("Enter the scoop size :");
		int n=in.nextInt();
		
		//System.out.println("max :"+max+" top :"+q.top()+" n:"+n);
		
		if(q.empty()==true)
			{
			q.add(n);
			max=n;
			}
		else
		if(n<q.top()){
		
		q.add(n);
		//if(n<=q.top() && )
		while(n<q.top()){
			q.rotate();
		}
		
		}
		
		else
			if(n>=q.top() && n<max){
				
				while(n>=q.top()){
					q.rotate();
				}
				q.add(n);
				while(n<q.top()){
					q.rotate();
				}
			}
			
			else{
				
				max=n;
				q.add(n);
			}
		
	}
	
	System.out.println("The order in which priority should be assigned is :--");
	while(q.empty()!=true)
		System.out.println(q.remove());
	
}
	
}
