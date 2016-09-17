/* Emperor Tutankhamun had exactly two children. Each of his children has either two children or no children. Historian John Stark 
 * discovers that the entire family tree is buried in a pyramid. During his excavation he finds that the parents are easier to excavate
 * than children, and thus the predecessors are excavated before the successors. Help him build the entire family tree to understand the 
 * lineage of the egyptian empire.     */

package Routing;


class Node{
	int str;
	Node left;
	Node right;
}


class BinaryTree{
	Node root=null;
	
	BinaryTree(){
	
		root=new Node();
		root.str=0;
		root.left=null;
		root.right=null;
		
	}
	
	void addLeft(int data){
		Node left=new Node();
		left.str=data;
	}
	
	void addRight(int data){
		Node right=new Node();
		right.str=data;
	}
}

public class BFS {

public static void main(String args[]){
	
	System.out.println("")
	
}
	
}
