package StackSearch;
import java.util.*;

public class StackSearch {
	
	public static void main(String[] args) {
		
		Stack<String> stk = new Stack<>();
		
		stk.push("Pune");
		stk.push("Mumbai");
		stk.push("Delhi");
		stk.push("Hydrabad");
		
		System.out.println("Stack -> " + stk);
		
		int location = stk.search("Delhi");
		
		System.out.println("Location Of Delhi: "+location);
		
		
		
		
		
		
	}

}
