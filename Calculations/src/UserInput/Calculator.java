package UserInput;
import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num1: " );
		int num1 = sc.nextInt();
		
		
		System.out.print("[+, -, *, /, X]");
		String op = sc.nextLine();
		
		
		
		System.out.print("Enter num2: ");
		int num2 = sc.nextInt();
		
		
		while(true) {
		
		if(op.equals("+"))
		{
			System.out.println(num1 + num2);
		
		}else if(op.equals( "-"))
		{
			System.out.println(num1 - num2);
		}else if(op.equals("*"))
		{
			System.out.println(num1 / num2);
		}else if(op.equals("/"))
		{
			System.out.println(num1 / num2);
		}else if(op.equals("X"))
		{
			break;
		}
		}
	
		
	}

}
