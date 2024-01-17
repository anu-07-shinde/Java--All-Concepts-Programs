package LinkedList;

import java.awt.List;
import java.util.LinkedList;

public class Demo {
	
	public static void arrangement()
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(8);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		
		int search = 7;
		int index = -1;
		
		for(int i=0; i<list.size(); i++)
		{
			if(list.get(i)== search)
			{
				index=i;
				break;
			}
		}
		
		if(index!=0)
		{
			System.out.println(search + " "+ index);
		}
	}
	
	public static void main(String[] args) {
		
		arrangement();
		
	}
	

}
