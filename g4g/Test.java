package g4g;

public class Test {

	
	public static void main (String [] args){
//		testSinglyLinkedList();
		testBinaryTree();
	}
	
	public static void testSinglyLinkedList(){
		SinglyLinkedList sls = new SinglyLinkedList();
		
		sls.populate();
		sls.print();
		sls.reverse();
		sls.print();
	}
	public static void testBinaryTree(){
		MyBinaryTree newTree = MyBinaryTree.createBinaryTree();
		newTree.fullInorder();
		if (newTree.hasPathSum(newTree.getRoot(), 15)){
			System.out.println("true");
		}
	}
}
