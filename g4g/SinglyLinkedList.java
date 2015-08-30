package g4g;

import java.util.Scanner;

public class SinglyLinkedList {
	
	private int val;
	private SinglyLinkedList next;
	SinglyLinkedList(){
	}
	SinglyLinkedList(int val){
		this.val=val;
	}
	
	public void add(int val){
		SinglyLinkedList current = this;
		while (current.next == null) current = current.next;
		current.next = new SinglyLinkedList(val);
	}
	public int get (int n){
		SinglyLinkedList current = this;
		if (n==0) return this.val;
		for (int i=0;i<n;i++) current = current.next;
		return current.val;
	}
	public void populate(){
		Scanner scan = new Scanner(System.in);
		SinglyLinkedList current;
		System.out.println("Enter the firstElement");
		val= scan.nextInt();
		current = this;
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
	}
	
	/*
	 * Reverse the link list
	 */
	public static SinglyLinkedList reverse(SinglyLinkedList node){
		SinglyLinkedList current = node;
		SinglyLinkedList prev = null;
		SinglyLinkedList nxt;
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
	
	public static void print(SinglyLinkedList node){
		SinglyLinkedList current = node;
		System.out.print(node.val);
		while (current.next!=null){
			current = current.next;
			System.out.print(" -> "+current.val);
		}
		System.out.println();
	}
	
}