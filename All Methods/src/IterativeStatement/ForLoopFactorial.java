package IterativeStatement;

public class ForLoopFactorial {

	public static void main(String[] args) {
		
		int n = 5, fact = 1;
		
		for( int i = n; i >= 1; i--)
		{
			fact = fact * i;
			
			
		}
		System.out.println(fact);

	}

}
