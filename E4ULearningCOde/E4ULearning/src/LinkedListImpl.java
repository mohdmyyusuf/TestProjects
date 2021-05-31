
public class LinkedListImpl {
	
	class Node{
		
		int data;
		Node next;
		
		public Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	
	public Node head = null;
	public Node tail = null; 
	
	public void addNode(int Ndata) {
		
		Node newNode = new Node(Ndata);
		//If empty
		
		if(head == null) {
			head = newNode;
			tail = newNode;
					
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
		
	}
	
	public void display() {
		
		Node current  = head;
		
		if(head == null) {
			System.out.println("This is an empty list...");
		}
		System.out.print("|Head|->");
		while(current!=null) {
			System.out.print("|"+current.data+"|->");
			current = current.next;
		}
		System.out.println("Tail");
	}
	public static void main(String[] args) {
		
		LinkedListImpl obj = new LinkedListImpl();
		obj.addNode(15);
		obj.addNode(16);
		obj.addNode(17);
		obj.addNode(18);
		obj.display();
		
	}
	

}
