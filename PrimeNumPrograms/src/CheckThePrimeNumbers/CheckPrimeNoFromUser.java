package CheckThePrimeNumbers;

import java.util.Scanner;

public class CheckPrimeNoFromUser {

	public static void main(String[] args) {

		int no;
		int temp=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		no = sc.nextInt();
		
		for(int i = 2; i < no - 1; i++)
		{
			if(i % 2 == 0)
			{
				temp = temp + 1;
			}
		}
		if(temp == 0)
		{
			System.out.println(no + " Is prime number");
		}
		else
		{
			System.out.println(no + " Is not prime number");
		}
		
	}

}
