package IsEmptyStack;
import java.util.*;

public class IsEmptyStack {
	
	public static void main(String[] args) {
		
		
		
		Stack<Integer> s = new Stack<Integer>();
		boolean result= s.isEmpty();
		
		System.out.println("Is stack empty? "+result);
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		System.out.println("Elements in stack: "+s);
		
		result = s.isEmpty();
		System.out.println("Is stack empty? "+result);
		
		
		
		
	}

}
