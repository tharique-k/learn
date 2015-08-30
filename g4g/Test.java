package g4g;

public class Test {

	
	public static void main (String [] args){
		testCharSinglyLinkedList();
//		testSinglyLinkedList();
//		testBinaryTree();
	}
	
	public static void testSinglyLinkedList(){
		SinglyLinkedList sls = new SinglyLinkedList();
		sls.populate();
		SinglyLinkedList.print(sls);
		sls = SinglyLinkedList.reverse(sls);
		SinglyLinkedList.print(sls);
	}
	public static void testBinaryTree(){
		MyBinaryTree newTree = MyBinaryTree.createBinaryTree();
		newTree.fullInorder();
		if (newTree.hasPathSum(newTree.getRoot(), 15)){
			System.out.println("true");
		}
	}
	
	public static void testCharSinglyLinkedList(){
		
		SLinkedListChar sls = new SLinkedListChar();
		sls.populate();
		SLinkedListChar.print(sls);
		if (SLinkedListChar.checkPalindromeUsingStack(sls)) 
			System.out.println("Its a palindrome");
		else System.out.println("Its not a palindrome"); 
		
		sls = SLinkedListChar.reverse(sls);
		System.out.print("The reverse is ");
		SLinkedListChar.print(sls);
	}
	
	
}
