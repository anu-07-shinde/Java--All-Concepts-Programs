package LinkedList;

import java.util.LinkedList;

public class Demo2 {

	
	public static void main(String[] args) {
		
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for( int i=1; i<50; i++)
		{
			list.add(i);
		}
		
		System.out.println(list);
		
		for( int i=1; i<50; i++)
		{
		if(i>25)
		{
			list.remove();
		}
		}
		System.out.println(list);
	}
}
