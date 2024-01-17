package LinkedList;

public class LL {
	
	Node head;
	
	class Node
	{
		String data;
		Node next;
		
		
		Node(String data)
		{
			this.data = data;
			this.next = next;
		}
	
	}
	
	public void addFirst(String data)
	{
		Node NewNode = new Node(data);
		  
		if(head==null)
		{
			head = NewNode;
			return;
			
		}
		
		NewNode.next=head;
		head = NewNode;
			
	}
	
	public void reverseIterate()
	{
		if(head==null)
		{
			return;
		}
		
		Node prevNode = head;
		Node currNode = head.next;
		Node next = currNode.next;
		
		{
		prevNode = currNode;
		currNode = next;
		}
		
		head.next = null;
		head = prevNode;
		
	}
	public void addLast(String data)
	{
		Node NewNode = new Node(data);
		if(head==null)
		{
			head=NewNode;
			return;
		}
		
		Node currNode = head;
		while(currNode.next != null)
		{
			currNode = currNode.next;
		}
			currNode.next = NewNode;
	}
	
	
	   public void printList() {
		   
	   
	       Node currNode = head;


	       while(currNode != null) {
	           System.out.print(currNode.data+" -> ");
	           currNode = currNode.next;
	       }

	   }
	public static void main(String[] args) {
		
		
		LL list = new LL();
		list.addFirst("Anu");
		list.addFirst("The");
		
		list.addLast("Shinde");
		
		list.printList();
		
		list.reverseIterate();
		list.printList();
	
	}

}

