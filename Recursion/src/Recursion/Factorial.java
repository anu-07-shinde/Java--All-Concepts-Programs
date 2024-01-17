package Recursion;

public class Factorial {
	
	public static void factorial(int n, int fact)
	{
		if(n==1)
		{
			fact *= n;
			System.out.println(fact);
			return;  
		}
		
		fact *= n;
		factorial(n-1, fact);
//		System.out.println(fact);
		
	}
	public static void main(String[] args) {
		factorial(3, 1);
	}

}
