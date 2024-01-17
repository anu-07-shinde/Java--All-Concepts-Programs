package StackIteration;
import java.util.*;

public class StackIteration {
	
	
	public static void main(String[] args) {
		
		
		Stack s = new Stack();
		
		
		s.push('A');
		s.push('B');
		s.push('c');
		s.push('D');
		
		Iterator iterator = s.iterator();
		while(iterator.hasNext())
		{
			Object values = iterator.next();
			System.out.println(values);
		}
	}
}
