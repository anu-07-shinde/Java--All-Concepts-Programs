package CheckIdentical;

import java.util.*;

public class IdenticalOrNot {
	
	Node head;
	
	class Node{
		
		int data;
		Node next;
		
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	boolean areIdentical(IdenticalOrNot list2) 
    { 
        Node a = this.head, b = head; 
        while (a != null && b != null)
        { 
            if (a.data != b.data) 
            {
                return false; 
        }
			
			
			a = a.next;
			b = b.next;
		}
	
		
		return(a == null && b == null);
	}
	
	void push(int data)
	{
		Node newNode  = new Node(data);
		
	    newNode.next = head; 
	    
	    head = newNode;
	}
	
	
	public  void printList()
	{
		Node currNode = head;
		
		while(currNode != null)
		{
			System.out.println(currNode.data);
			currNode = currNode.next;
		}
	}
	public static void main(String[] args) {
		
		IdenticalOrNot list1 = new IdenticalOrNot();
		IdenticalOrNot list2 = new IdenticalOrNot();
		
		System.out.println("First List: ");
		
		list1.push(1);
		list1.push(2);
		list1.push(3);
		list1.push(4);
		
		list1.printList();
		System.out.println();
		
		list2.push(1);
		list2.push(2);
		list2.push(3);
		list2.push(4);
		
		list2.printList();
		
		if(list1.areIdentical(list2)==true)
		{
			 System.out.println("Identical "); 
		} else
		     System.out.println("Not identical "); 
		}
		
	}

