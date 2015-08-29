package g4g;

import java.util.Scanner;

public class BinaryTree {
	
	private TreeNode root;
	private TreeNode current;
	public BinaryTree(){
	}
	public BinaryTree(int val){
		this.root = new TreeNode(val);
	}
	public void addRoot(int val){
		this.root = new TreeNode(val);
	}
	public void fullInorder(){
		inorder(root);
	}
	public void inorder(TreeNode node){
		if (node!=null){
		inorder(node.left);
		System.out.print(node.val + " -> ");
		inorder(node.right);
		}
		
	}
	
	public  void populate(){
		if (root!=null){
			System.out.println("This tree already exist");
			return;
		}
		else {
			System.out.println("enter value of root Node");
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			root = new TreeNode(scan.nextInt());
			current =root;
			while (true){
				System.out.println("Enter 1. to add node to left");
				System.out.println("Enter 2. to add node to right");
				System.out.println("Enter 3. move to left node");
				System.out.println("Enter 4. move to right node");
				System.out.println("Enter 5. move back to root");
				System.out.println("Enter 6. to exit");
				switch (scan.nextInt()){
					
				case 1 : System.out.println("Enter the node value");
						current.addLeft(new TreeNode(scan.nextInt()));
						break;
						
				case 2 : System.out.println("Enter the node value");
						current.addRight(new TreeNode(scan.nextInt()));
						break;
						
				case 3 : System.out.println("Moved to the left node now");
						current = current.left;
						break;
						
				case 4 : System.out.println("Moved to the left node now");
						current = current.right;
						break;
						
				case 5 : System.out.println("Moved to the left node now");
						current = root;
						break;
						
				case 6 : return;
				
				}
				
			}
		}
	}
	
	
	private class TreeNode{
		
		private TreeNode left = null;
		private TreeNode right = null;
		private int val;
		
		TreeNode(int val){
			this.val=val;
		}
		public void addLeft(TreeNode tn){
			if (this.left!=null){
				System.out.println("The node is not empty");
				return;
			}
			else {
				this.left = tn;
			}
		}
		public void addRight(TreeNode tn){
			if (this.right!=null){
				System.out.println("The node is not empty");
				return;
			}
			else {
				this.right = tn;
			}
		}
		public TreeNode getLeft(){
			return this.left;
		}
		
		public TreeNode getRight(){
			return this.right;
		}
		
		public int getVal(){
			return this.val;
		}
	}
	

}
