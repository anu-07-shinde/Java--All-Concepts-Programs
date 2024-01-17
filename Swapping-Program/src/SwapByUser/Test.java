package SwapByUser;

import java.util.Scanner;

public class Test {
	
	int x ;
	int y ;
	
	public void swap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x and y: ");
		System.out.print("X: ");
		x = sc.nextInt();
		
		System.out.print("Y: " );
		y = sc.nextInt();
		
		
		System.out.println("Before Swapping..." + x + " "  + y );
		
		x = x + y;
		y = x - y ;
		x = x - y;
		
		System.out.println("Before Swapping..." + x + " "  + y );
		
		
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		t.swap();
		
	}
}
