package Practical1;

//import LinkedList.LL.Node;

public class Demo {
	
	
	Node head;
	class Node
	{
		int data;
		Node next;
		
		
		Node(int data)
		{
			this.data = data;
		}
		
		
	}
	
	
	public void addFirst(int data)
	{
		Node newNode = new Node(data);
		
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	
	public void addLast(int data)
	{
		Node newNode = new Node(data);
				{
					if(head==null)
					{
						head=newNode;
						return;
					}
					
					Node currNode = head;
					while(currNode.next != null)
					{
						currNode = currNode.next;
					}
						currNode.next = newNode;
				}
	}
	
	public void printNode()
	{
		Node currNode = head;
		
		while(currNode != null)
		{
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.addFirst(4);
		d.addFirst(3);
		d.addFirst(2);
		d.addFirst(1);
		
		d.addLast(5);
		
		
		d.printNode();
		
	}

}
