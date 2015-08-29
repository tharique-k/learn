package g4g;

public class Test {

	
	public static void main (String [] args){
		
		BinaryTree newTree = new BinaryTree();
		newTree.populate();
		newTree.fullInorder();
		if (newTree.hasPathSum(newTree.getRoot(), 15)){
			System.out.println("true");
		}
	}
}
