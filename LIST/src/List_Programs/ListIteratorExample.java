package List_Programs;
import java.util.*;

public class ListIteratorExample {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(101);
		l.add("Anu");
		l.add("Shinde");
		
		
		ListIterator itr = l.listIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("******************************");
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
	}
}
