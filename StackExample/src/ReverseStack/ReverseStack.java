package ReverseStack;
import java.util.*;

public class ReverseStack {
	
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		
		System.out.println("Given Stack: ");
		while(!s.isEmpty())
		{
			System.out.println(s.peek());
			s.pop();
		}
		
		int temp = s.pop();
		System.out.println("Reversed Stack");
		
		System.out.println(temp);
		
		
	}

}
