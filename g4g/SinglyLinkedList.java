package g4g;

import java.util.Scanner;

public class SinglyLinkedList {
	
	private SinglyLinkedList head;
	private SinglyLinkedList tail = head;
	private int val;
	private SinglyLinkedList next;
	SinglyLinkedList(){
		this.head=this;
	}
	SinglyLinkedList(int val){
		this.val=val;
	}
	
	public void populate(){
		Scanner scan = new Scanner(System.in);
		SinglyLinkedList current;
		System.out.println("Enter the firstElement");
		head.val= scan.nextInt();
		current = head;
		while (true){
		System.out.println("Enter more elements ? 1.No  Any number. Yes");
		if (scan.nextInt() ==1){
			break;
		}
		System.out.println("Enter the next number");
		
		current.next = new SinglyLinkedList(scan.nextInt());
		current = current.next;	
		}
		scan.close();
		tail = current;
	}
	
	/*
	 * Reverse the link list
	 */
	public void reverse(){
		SinglyLinkedList current = this.head;
		this.tail=this.head;
		SinglyLinkedList prev = null;
		SinglyLinkedList nxt;
		while (current!=null){
			nxt = current.next;
			current.next = prev;
			prev = current;
			current = nxt;
			if (current==null){
				this.head = prev; // or if tail is an option put head=tail.  But we may not have tail
			}
		}
	}
	
	public void print(){
		SinglyLinkedList node = this.head;
		System.out.print(node.val);
		while (node.next!=null){
			node = node.next;
			System.out.print(" -> "+node.val);
		}
		System.out.println();
	}

}
