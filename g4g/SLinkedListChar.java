package g4g;
import java.util.Scanner;
public class SLinkedListChar {
		private char data;
		private SLinkedListChar next;
		SLinkedListChar(){
		}
		SLinkedListChar(char data){
			this.data=data;
		}
		
		public void add(char data){
			SLinkedListChar current = this;
			while (current.next == null) current = current.next;
			current.next = new SLinkedListChar(data);
		}
		public char get (int n){
			SLinkedListChar current = this;
			if (n==0) return this.data;
			for (int i=0;i<n;i++) current = current.next;
			return current.data;
		}
		public void populate(){
			Scanner scan = new Scanner(System.in);
			SLinkedListChar current;
			System.out.println("Enter the String");
			String local = scan.nextLine();
			current = this;
			current.data= local.charAt(0);
			for (int i=1;i<local.length();i++){
			current.next = new SLinkedListChar(local.charAt(i));
			current = current.next;	
			}
			scan.close();
		}
		
		
		public static void print(SLinkedListChar node){
			SLinkedListChar current = node;
			System.out.print(node.data);
			while (current.next!=null){
				current = current.next;
				System.out.print(" -> "+current.data);
			}
			System.out.println();
		}
		
		/*
		 * Reverse the link list
		 */
		public static SLinkedListChar reverse(SLinkedListChar node){
			SLinkedListChar current = node;
			SLinkedListChar prev = null;
			SLinkedListChar nxt;
			while (current!=null){
				nxt = current.next;
				current.next = prev;
				prev = current;
				current = nxt;
				if (current==null){
					node = prev;
				}
			}
			return node;
		}
		
		/**
		 * Check if a character link list is palindrome or not.
		 * This is the method with O(n) linear time and O(1) constant space.
		 * Here we reverse the second half of the list and compare it with the first half
		 * @param sls
		 * @return boolean
		 */
		public static boolean checkPalindrome (SLinkedListChar sls){
			SLinkedListChar sp = sls;
			SLinkedListChar fp = sls;
			SLinkedListChar secondHalf;
			SLinkedListChar prevOfSp = sls;
			SLinkedListChar middle =null;
			
			while (fp.next !=null && fp.next.next!=null ){
				fp = fp.next.next;
				prevOfSp = sp;
				sp = sp.next;
				
			}
			if (fp!=null){
				middle =sp;
			}
			
			secondHalf = sp.next;
			prevOfSp.next = null;
			secondHalf = reverse(secondHalf);
			boolean rv = compare (sls , secondHalf);
			secondHalf = reverse(secondHalf);
			if (middle!=null){
				middle.next=secondHalf;
				prevOfSp.next=middle;
			}
			else {
				
				prevOfSp.next=secondHalf;
				
			}
			return rv;
			
		}
		/**
		 * this method has O(n) time and O(n) space complexity
		 * @return
		 */
		public static boolean checkPalindromeUsingStack(SLinkedListChar node){
			StackCharSLS stack = new StackCharSLS();
			SLinkedListChar current = node;
			while (current!=null){
				stack.push(current.data);
				current=current.next;
			}
			current = node;
			while (current!=null){
				if (stack.pop() == current.data){
					current=current.next;
				}
				else {
					return false;
				}
			}
			return true;
			
		}
		private static boolean compare(SLinkedListChar list1,
				SLinkedListChar list2) {
			
			SLinkedListChar temp1 = list1;
			SLinkedListChar temp2 = list2;
			
			while (temp1!=null && temp2!=null) {
				if (temp1.data==temp2.data){
					temp1 = temp1.next;
					temp2 = temp2.next;
				}
				else{
					return false;
				}
			}
			if (temp1==null && temp2==null)	return true;
			
			return false;
		}

	}


