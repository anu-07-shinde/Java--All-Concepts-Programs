package CheckThePrimeNumbers;

public class IsPrimeNumorNot {
	
	public static void main(String[] args)
	{

		int num = 13;
		int temp = 0;
		
		for(int i = 1; i <=num ; i++)
		{
			if(num % i == 0)
			{
				temp = temp + 1;
//				break;
			}
			
		}
		
		if(temp == 2)
		{
			System.out.println(num + " Is prime number");
		}
		else
		{
			System.out.println(num + " Is not prime number");
		}
		
	}
		
}
	
	
	

