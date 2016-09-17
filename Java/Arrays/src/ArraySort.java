

/*
 * Professor Xin Shang has conducted a test for course 279. He has the scores of his grad students in random order. Help him sort these
 * scores in descending order so that he can find the top scores. 
 * */
import java.util.Scanner;
public class ArraySort {

	int arr[];
	ArraySort(int n){
		arr=new int[n];
	}
	
	void sort(){
		int temp=0;
		
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				while(arr[j]>arr[i])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}
	
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of students :");
		int num=in.nextInt();
		
		ArraySort as=new ArraySort(num);
		for(int i=0;i<num;i++){
			System.out.println("Enter the marks :");
			as.arr[i]=in.nextInt();
		}
		
		as.sort();
		System.out.println("The rearranged order of marks is as follows...");
		as.display();
	}

	private void display() {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
	
}
