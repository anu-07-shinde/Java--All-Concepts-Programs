package SizeStack;
import java.util.*;
public class SizeStack {
	public static void main(String[] args) {
		
		Stack<Integer> stk = new Stack<>();
		
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		stk.push(5);
		
		System.out.println("Stack -> " +stk);
		
		int size = stk.size();
		
		System.out.println("Size of Stack: "+size);
		
	}
}
