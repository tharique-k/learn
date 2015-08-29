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
	public TreeNode getRoot(){
		return this.root;
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
	/*
	 Given a tree and a sum, return true if there is a path from the root
	 down to a leaf, such that adding up all the values along the path
	 equals the given sum.
	 
	 Strategy: subtract the node value from the sum when recurring down,
	 and check to see if the sum is 0 when you run out of tree.
	*/
	public boolean hasPathSum(TreeNode node, int sum){
		
		if (node==null){
			return (sum == 0);
		}
		else {
			boolean result = false;
			int subSum = sum-node.val;
			if (subSum==0 && node.left==null && node.right==null){
				return true;
			}
			result = result || hasPathSum(node.left, subSum);
			if (result){
				return true;
			}
			result = result || hasPathSum(node.right,subSum);
			return result;
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
	}
	

}
