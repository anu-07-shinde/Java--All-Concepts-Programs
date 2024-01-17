package StackIteration;
import java.util.*;

public class StackActualIteration {
	
	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<>();
		
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		stk.push(5);
		
//		ListIterator<Integer> ListIterator = skt.listiterator(srk.size());

		ListIterator<Integer> ListIterator = stk.listIterator(stk.size());  
		
		while(ListIterator.hasPrevious())
		{
			Integer values = ListIterator.previous();
			System.out.println(values);
		}
		
	}

}
