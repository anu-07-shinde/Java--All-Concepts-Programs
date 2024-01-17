package CheckThePrimeNumbers;

import java.util.Scanner;

public class Demo1 {
	public static void main(String args[])
	{
		int temp = 0;
		
		
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		
		
		for(int i=1; i<=num; i++)
		{
			if(num % i == 0)
			{
				temp++;
			}
		}
		
		if(temp == 2)
		{
			System.out.println(num + " is prime number");
		}
		else
		{
			System.out.println(num + " is not prime number");
		}
		
		
	}

}
