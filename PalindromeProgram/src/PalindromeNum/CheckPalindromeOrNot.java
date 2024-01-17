package PalindromeNum;

public class CheckPalindromeOrNot {

	public static void main(String[] args) {


		int rem, sum = 0, temp ;
		int num = 454;
		
		temp = num;
		while(num > 0)
		{
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num /10;
			
		
		}
		if(temp == sum)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}

	}

}
