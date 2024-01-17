package StackCF;
import java.util.*;

public class StackJCF {
	
	
		public static void addAtButtom(Stack<Integer> s, int data)
		{
			if(s.isEmpty())
			{
				s.push(data);
				return;
			}
			int temp = s.pop();
			addAtButtom(s, data);
			s.push(temp);
		}
	

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
//		stack.push(4);
		
		addAtButtom(stack, 4);
		
		
		while(!stack.isEmpty())
		{
			System.out.println(stack.peek());
			stack.pop();
		}
		
	}
}
