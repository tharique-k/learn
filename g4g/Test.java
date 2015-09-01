package g4g;

import java.util.Scanner;

public class Test {

	
	public static void main (String [] args){
//		testCharSinglyLinkedList();
//		testSinglyLinkedList();
//		testBinaryTree();
		testArbitLinkList();
	}
	
	public static void testArbitLinkList(){
		
			Scanner scan = new Scanner(System.in);
			System.out.println("How many numbers? : ");
			int n = scan.nextInt();
			System.out.println("enter the numbers");
			ArbitLinkList als = new ArbitLinkList();
			for (int i=0;i<n;i++){
				als.addNode(scan.nextInt());
			}
			System.out.println("Now enter the arbit connections : ");
			for (int i=0;i<n;i++ ){
				int a = scan.nextInt();
				int b = scan.nextInt();
				als.addArbit(a,b);
			}
			scan.close();
			als.print();
			ArbitLinkList als1 = ArbitLinkList.copy(als);
			System.out.println("The copied List is : ");
			als1.print();
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
