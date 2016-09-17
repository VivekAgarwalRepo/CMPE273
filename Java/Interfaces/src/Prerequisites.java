/*
 * Write a program that checks if a conditionally admit grad student has completed his pre-requisites. If he satisfies all the pre-requisites then he is eligible to be completely admit.
 * Use an interface that contains a set of required conditions that is validated. 
 */

import java.util.Scanner;

public interface Prerequisites {
	
	public boolean CMPE103();
	public boolean CMPE106();
	public boolean CMPE110();
		
}

class ConditionalAdmit implements Prerequisites{
	
	boolean cmpe103=false,cmpe106=false,cmpe110=false;
	
	public boolean CMPE103() {
		// TODO Auto-generated method stub
		cmpe103=true;
		System.out.println("CMPE103 is marked as completed...");
		return true;
	}

	public boolean CMPE106() {
		// TODO Auto-generated method stub
		cmpe106=true;
		System.out.println("CMPE106 is marked as completed...");
		return true;
	}

	public boolean CMPE110() {
		// TODO Auto-generated method stub
		cmpe110=true;
		System.out.println("CMPE110 is marked as completed...");
		return true;
	}
	
	
	public static void main(String args[]){
		
		ConditionalAdmit admit=new ConditionalAdmit();
		
		Scanner in=new Scanner(System.in);
				
		System.out.println("Have you completed CMPE 103 as a pre-requisite? (0/1) :");
		
		if(in.nextInt()==1)
			
			admit.CMPE103();
			
		
		System.out.println("Have you completed CMPE 106 as a pre-requisite? (0/1) :");
		
		if(in.nextInt()==1)
			
			admit.CMPE106();
		
		System.out.println("Have you completed CMPE 110 as a pre-requisite? (0/1) :");
		
		if(in.nextInt()==1)
			admit.CMPE110();
		
		if(admit.checkEligibility())
			System.out.println("All pre-requisites have been satisfied. You are now completely admitted!");
		else
			System.out.println("Sorry! All pre-requisites have not been satisfied. You are not completely admitted!");
		
	}

	boolean checkEligibility() {
		// TODO Auto-generated method stub
		if(this.cmpe103&&this.cmpe106&&this.cmpe110)
			return true;
		else
		return false;
	}
	
}