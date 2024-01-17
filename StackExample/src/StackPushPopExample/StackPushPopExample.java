package StackPushPopExample;
import java.util.*;

public class StackPushPopExample {
	

	public static void pushelement(Stack stk, int x)
	{
		
		stk.push(x);
		
		System.out.print("Push->" + x);
		System.out.println("\nStack: "+ stk);
		
		
	}
	
	public static void popelement(Stack stk)
	{
		System.out.print("Pop->");
		
		int x = (int) stk.pop();
		
		System.out.println(x);
		System.out.println("\nStack: "+stk);
		
		
	}
	
	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<>();
		System.out.println(s);
		pushelement(s, 11);
		pushelement(s, 12);
		pushelement(s, 13);
		pushelement(s, 14);
		pushelement(s, 15);
		
		System.out.println("*****************************");
		
		popelement(s);
		
		
		
		
		
	
		
		
	}
}
