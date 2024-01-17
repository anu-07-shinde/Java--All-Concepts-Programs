package Operators;

public class LogicalOperator {

	public static void main(String[] args) {
		
		//  && [AND OPERATOR]
		
		int a = 10;
		int b = 20;
		
		boolean res1 = a > b && a < b;
		
		System.out.println("Result: " + res1);
		
		
		int x = 20;
		int y = 20;
		
		boolean res2 = x >= y && x <= y;
		
		System.out.println("Result: " + res2);
		
		
		// || [OR OPERATOR]
		
		int m = 10;
		int n = 20;
		
		boolean res3 = m > n || m < n;
		
		
		System.out.println("Result: " + res3);
		
		
		int p = 10;
		int q = 20;
		
		boolean res4 = p >= q || p <= q;
		
		
		System.out.println("Result: " + res4);
		
		
		// ! [NOT OPERATOR]
		
		int e = 10;
		int f = 20;
		
		boolean res5 = !(e > f);
		
		System.out.println("Result: " + res5);

	}

}
