package SumOfDigits;

public class Demo {

	public static void main(String[] args) {

		
		int rem, sum = 0;
		int num = 123456;
		
		
		while(num > 0 )
		{
			rem = num % 10;
			sum = sum + rem;
			num = num /10;
		}
		
		System.out.println(sum);
	}

}
