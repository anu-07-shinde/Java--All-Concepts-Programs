package LInkedList1;

import java.util.LinkedList;

//import LinkedList.LL.Node;

public class Demo {
	
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
	

	
	public void reverseIterate() {
		
		if(head==null)
		{
			return;
		}
		
		Node prevNode = head;
		Node currNode = head.next;
		Node nextNode = currNode.next;
		
		
		
		prevNode = currNode;
		head = nextNode;
		
		
		
		head.next = null;
		head = prevNode;
	}
	
	}
	
	public static void main(String[] args) {
		
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		
//		System.out.println(list);
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.print(list.get(i)+" -> ");
		}
		System.out.println("null");
		
	}
	
	
	

}
