
/*Professor Psyke has given out add codes for his new subject to students on wait-list. Later he realizes that by mistake he has handed over multiple addcodes
 * to same students. He has a long random-ordered list of students who have received these add-codes. Help him identify these grad students.
 */
import java.util.*;
import java.io.*;

public class DublicateValues {
	static HashMap<String,Boolean> ht=new HashMap<String,Boolean>();
	static ArrayList<String> list=new ArrayList<String>();
	
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);

		System.out.println("Enter the number of add-codes given out :");
		int n=in.nextInt();
		in.nextLine();
			
		/*for(int i=0;i<n;i++){
			
			name=in.nextLine();
			if(!ht.isEmpty())
			{
				if(ht.get(name)==null)
					ht.put(name,true);
				
				else
					{
					if(!list.contains(name))
					list.add(name);
					
					continue;
					}
					
			}
			else
			ht.put(name, true);
			
		}*/
		for(int i=0;i<n;i++){
		System.out.println("Enter the name of the student :");
		addStudent(in.nextLine());
		}
		
		duplicates();
		/*
		if(list.isEmpty())
			System.out.println("No duplicates found!");
		else
			{
			System.out.println("List of student names with multiple add-codes...");
			
			for(String nm:list)
				System.out.println(nm);
			}*/
		
	}

	public static ArrayList<String> duplicates() {
		// TODO Auto-generated method stub
		if(list.isEmpty())
			System.out.println("No duplicates found!");
		else
			{
			System.out.println("List of student names with multiple add-codes...");
			
			for(String nm:list)
				System.out.println(nm);
			}
		
		return list;
	}

	public static  void addStudent(String name) {
		// TODO Auto-generated method stub
		if(!ht.isEmpty())
		{
			if(ht.get(name)==null)
				ht.put(name,true);
			
			else
				{
				if(!list.contains(name))
				list.add(name);
				return;
				}
				
		}
		else
		ht.put(name, true);
	}
}
