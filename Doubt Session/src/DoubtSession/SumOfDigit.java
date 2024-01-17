package DoubtSession;

public class SumOfDigit {

	public static void main(String[] args) {
		
		
		int num = 1234;
		int sum = 0;
		int Res;
		
		while(num > 0)
		
			
		{
			
			Res= num % 10;
			sum = sum + Res;
			num = num / 10;

			
			
			
		}
		System.out.println(sum);
		
	}

}


