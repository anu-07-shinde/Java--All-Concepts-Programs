package List_Programs;

import java.util.*;

public class IteratorExample {
	
	public static void main(String[] args) {
		
		
		List l = new ArrayList();
		
		l.add(1);
		l.add(2);
		l.add(3);
		
		
		Iterator itr = l.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
