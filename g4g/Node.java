package g4g;


public class Node {
		private Node next;
		private Node arbit;
		private int data;
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}

		public Node(int dat){
			this.data=dat;
		}
		
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public Node getArbit() {
			return arbit;
		}
		public void setArbit(Node arbit) {
			this.arbit = arbit;
		}
		
		public static Node copyNode(Node node){
			Node rv = new Node (node.data);
			rv.next=node.next;
			return rv;
		}
	}
