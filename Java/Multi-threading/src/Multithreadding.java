
/*Create a Web-Server Model that handles multiple client requests by using multi-threadding. Each client request is supposed to be handled using a thread.*/

import java.util.Scanner;


public class Multithreadding extends Thread{
	String threadName;
	public Multithreadding(String name) {
		// TODO Auto-generated constructor stub
		System.out.println("Creating thread "+name);
		threadName=name;
	}
	public void run(){
		
		try {
			System.out.println("Currently Serving "+threadName);
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.print("Exception for sleep");
		}
		System.out.println("Finished Serving :"+threadName);
	}
	
	public static void main(String args[]) throws InterruptedException{
		
		
		System.out.println("Enter the number of client requests :");
		Scanner in=new Scanner(System.in);
		
		int req=in.nextInt();
		
		Multithreadding thread[]=new Multithreadding[req];
		
		for(int i=0;i<req;i++){
			
			thread[i]=new Multithreadding("Client "+i+" request");
			thread[i].start();
		}
		
		
	}
}
