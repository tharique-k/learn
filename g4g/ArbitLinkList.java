package g4g;

import java.util.Scanner;

/**
 * 
 * This is a Linked list with two pointers. One to the next node and the
 * other to any random node in the list.
 * @author theroq
 *
 */
public class ArbitLinkList {
	
	private Node head;
	private Node tail;
	
	public void addNode(int dat){
		if (head==null){
			head = new Node(dat);
			tail=head;
		}
		else{
			Node tmp = new Node(dat);
			tail.setNext(tmp);
			tail=tmp;
		}
	}
	
	public void addArbit (int source , int destination){
		addArbit(source,getNode(destination));
	}
	
	private void addArbit(int source, Node arb){
			Node current = head;
			for (int i=1;i<source;i++){
				if (current.getNext()==null){
					return;
				}
				current=current.getNext();
			}
			current.setArbit(arb);
	}
	
	public Node getNode (int n){
			Node current = head;
			for (int i=1;i<n;i++){
				current=current.getNext();
			}
			return current;
	}
	
	public void print(){
			Node current=head;
			System.out.println("List");
			System.out.println("======");
		while (current!=null){
			System.out.print("["+current.getData()+"]->");
			current = current.getNext();
		}
			System.out.println("NULL");
			System.out.println("Arbits");
			System.out.println("======");
		current=head;
		while (current!=null){
			System.out.print("["+current.getData()+"]->[");
			if (current.getArbit()!=null){
			System.out.println(current.getArbit().getData()+"]");
			}
			else{
				System.out.println("NULL]");
			}
			current = current.getNext();
		}
	}
	
	public static ArbitLinkList copy(ArbitLinkList als){
		ArbitLinkList rv = new ArbitLinkList ();
		Node current = als.head;
		Node tmp;
		while (current!=null){
			tmp= Node.copyNode(current);
			current.setNext(tmp);
			current=current.getNext().getNext();
		}
		current = als.head;
		while (current!=null){
			current.getNext().setArbit(current.getArbit().getNext());
			current=current.getNext().getNext();
		}
		current=als.head;
		tmp=current.getNext();
		rv.head=tmp;
		while (tmp.getNext()!=null){
			current.setNext(current.getNext().getNext());
			tmp.setNext(tmp.getNext().getNext());
			current=current.getNext();
			tmp=tmp.getNext();
		}
		current.setNext(null);
		
		
		return rv;
	}
	
}
