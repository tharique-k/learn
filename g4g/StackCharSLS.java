package g4g;

/**
 * Implementation of stack using linked list
 * @author theroq
 *
 */
public class StackCharSLS {
	
	private ListNode top = null;
	
	
	
	
	public void push(char val){
		if (top == null){
			top = new ListNode(val);
			top.next=null;
		}
		else {
			ListNode temp = top;
			top = new ListNode(val);
			top.next=temp;
		}
	}
	
	/**
	 * only call after checking isEmpty(). 
	 * @return if stack empty, will return '%'; 
	 */
	public char pop(){
		if (top==null){
			return '%';
		}
		else{
			char rv = top.val;
			top=top.next;
			return rv;
		}
	}
	public boolean isEmpty(){
		return (top==null);
	}
	
	
	private class ListNode{
		private char val;
		private ListNode next;
		
		private ListNode(char val){
			this.val=val;
		}
	}
}
