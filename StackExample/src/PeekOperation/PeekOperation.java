package PeekOperation;

import java.util.*;

public class PeekOperation {
	
	public static void main(String[] args) {
		
		Stack<String> stk = new Stack<>();
		
		stk.push("Anu");
		stk.push("Komal");
		stk.push("Aniket");
		stk.push("Kaustubh");
		stk.push("Nikita");
		

		System.out.println("Stack-> "+stk);
		
		String result = stk.peek();
		
		System.out.println("Top name is: "+result);
		
		
		
		
	}

}
