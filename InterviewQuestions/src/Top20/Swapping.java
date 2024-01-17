package Top20;

import java.util.Scanner;

public class Swapping {
	
	public static void main(String[] args) {
		
		int x, y;
		
		System.out.println("Enter x and y: ");
		
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println("Before Swapping: ");
		
		System.out.println(x + " "+y);
		
		System.out.println("================================");
		
		System.out.println("Before Swapping: ");
		
		int temp = x; 
		x = y;
		y = temp;
		
		System.out.println(x + " "+y);
		
		
		
		
	}

}
